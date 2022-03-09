package com.example.xyz_banksimulation;

import com.example.xyz_banksimulation.entity.Account;
import com.example.xyz_banksimulation.enums.AccountType;
import com.example.xyz_banksimulation.exception.BalanceNotSufficientException;
import com.example.xyz_banksimulation.service.AccountService;
import com.example.xyz_banksimulation.service.TransactionService;
import com.example.xyz_banksimulation.service.impl.AccountServiceImpl;
import com.example.xyz_banksimulation.service.impl.TransactionServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;
import java.util.Date;

@SpringBootApplication
public class XyzBankSimulationApplication {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(XyzBankSimulationApplication.class, args);

		AccountService accountService = applicationContext.getBean(AccountServiceImpl.class);
		TransactionService transactionService = applicationContext.getBean(TransactionServiceImpl.class);

		Account receiver = accountService.createNewAccount( BigDecimal.TEN, new Date(), AccountType.CHECKING, 1L);
		Account sender =  accountService.createNewAccount(new BigDecimal(70), new Date(), AccountType.CHECKING, 1L);

		accountService.listAccount().forEach(System.out::println);

		transactionService.makeTransfer(BigDecimal.TEN, new Date(), sender, receiver, "transfer no:1");

		System.out.println(transactionService.findAll().get(0));
		accountService.listAccount().forEach(System.out::println);

		transactionService.makeTransfer(new BigDecimal(25), new Date(), sender, receiver, "transfer no:2");

		System.out.println(transactionService.findAll().get(1));
		accountService.listAccount().forEach(System.out::println);








	}

}
