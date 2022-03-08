package com.example.xyz_banksimulation.repository;

import com.example.xyz_banksimulation.entity.Account;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class AccountRepository {
    public static List<Account> accountList  = new ArrayList<>();

    public static List<Account> findAll() {

        return accountList;
    }

    public Account save(Account account) {
        accountList.add(account);
        return account;
    }


}
