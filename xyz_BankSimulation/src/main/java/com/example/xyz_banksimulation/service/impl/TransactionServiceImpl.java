package com.example.xyz_banksimulation.service.impl;

import com.example.xyz_banksimulation.entity.Account;
import com.example.xyz_banksimulation.entity.Transaction;
import com.example.xyz_banksimulation.enums.AccountType;
import com.example.xyz_banksimulation.exception.AccountOwnershipException;
import com.example.xyz_banksimulation.exception.BadRequestException;
import com.example.xyz_banksimulation.service.TransactionService;
import org.springframework.beans.factory.support.BeanDefinitionOverrideException;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Component
public class TransactionServiceImpl implements TransactionService {
    @Override
    public Transaction makeTransfer(BigDecimal amount, Date creationDate, Account sender, Account receiver, String message) {
        checkAccoutnOwnership(sender, receiver);
        validateAccount(sender, receiver);
        return null;
    }

    private void validateAccount(Account sender, Account receiver) {
        if (sender == null || receiver == null) {
            throw new BadRequestException("sender or receiver cannot be found");
        }
    }

    private void checkAccoutnOwnership(Account sender, Account receiver) {
        if ((sender.getAccountType().equals(AccountType.SAVINGS) || receiver.getAccountType().equals(AccountType.SAVINGS))
                && sender.getUserId().equals(receiver.getUserId())) {
            throw new AccountOwnershipException("Saving account transactions are only allowed for same person");
        }
        if (sender.getId().equals(receiver.getId())) {
            throw new BadRequestException("Sneder accound needs to be different from receiver account");
        }


    }


    @Override
    public List<Transaction> findAll() {
        return null;
    }
}
