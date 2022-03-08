package com.example.xyz_banksimulation.service;

import com.example.xyz_banksimulation.entity.Account;
import com.example.xyz_banksimulation.enums.AccountType;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AccountService {

    Account createNewAccount(BigDecimal balance, Date creationDate, AccountType accountType, Long userId);

    List<Account> listAccount();

}

