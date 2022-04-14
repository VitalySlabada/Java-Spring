package com.example.xyz_banksimulation.service.impl;

import com.example.xyz_banksimulation.model.Account;
import com.example.xyz_banksimulation.model.Transaction;
import com.example.xyz_banksimulation.enums.AccountType;
import com.example.xyz_banksimulation.exception.AccountOwnershipException;
import com.example.xyz_banksimulation.exception.BadRequestException;
import com.example.xyz_banksimulation.exception.BalanceNotSufficientException;
import com.example.xyz_banksimulation.exception.UnderConstructionException;
import com.example.xyz_banksimulation.repository.AccountRepository;
import com.example.xyz_banksimulation.repository.TransactionRepository;
import com.example.xyz_banksimulation.service.TransactionService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;


@Component
public class TransactionServiceImpl implements TransactionService {

    @Value("${under_construction}")
    private boolean underConstruction;
    AccountRepository accountRepository;
    TransactionRepository transactionRepository;

    public TransactionServiceImpl(AccountRepository accountRepository, TransactionRepository transactionRepository) {
        this.accountRepository = accountRepository;
        this.transactionRepository = transactionRepository;
    }

    @Override
    public Transaction makeTransfer(BigDecimal amount, Date creationDate, Account sender, Account receiver, String message) {

        if (!underConstruction) {
            checkAccoutnOwnership(sender, receiver);
            validateAccount(sender, receiver);
            executeBalanceAndUpdateIfRequired(amount, sender, receiver);
            return transactionRepository.save(Transaction.builder()
                    .amount(amount)
                    .creationDate(creationDate)
                    .sender(sender.getId())
                    .receiver(receiver.getId())
                    .message(message)
                    .build());
        }
        else {
            throw new UnderConstructionException("transaction did not go though");
        }
    }

    private void executeBalanceAndUpdateIfRequired(BigDecimal amount, Account sender, Account receiver) {

        if (checkSenderBalance(sender, amount)) {
            sender.setBalance(sender.getBalance().subtract(amount));
            receiver.setBalance(receiver.getBalance().add(amount));
        } else {
            throw new BalanceNotSufficientException("not enough balance");
        }
    }

    private boolean checkSenderBalance(Account sender, BigDecimal amount) {
        return sender.getBalance().subtract(amount).compareTo(BigDecimal.ZERO) > 0;
    }


    private void validateAccount(Account sender, Account receiver) {
        if (sender == null || receiver == null) {
            throw new BadRequestException("sender or receiver cannot be found");
        }
        if (sender.getId().equals(receiver.getId())) {
            throw new BadRequestException("Sneder accound needs to be different from receiver account");
        }

        findAccountById(sender.getId());
        findAccountById(receiver.getId());
    }

    private void checkAccoutnOwnership(Account sender, Account receiver) {
        if ((sender.getAccountType().equals(AccountType.SAVINGS) || receiver.getAccountType().equals(AccountType.SAVINGS))
                && sender.getUserId().equals(receiver.getUserId())) {
            throw new AccountOwnershipException("Saving account transactions are only allowed for same person");
        }

    }


    private Account findAccountById(UUID accountId) {
        return accountRepository.findByID(accountId);
    }


    @Override
    public List<Transaction> findAll() {


        return transactionRepository.findAll();

    }
}
