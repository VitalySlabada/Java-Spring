package com.example.xyz_banksimulation.repository;

import com.example.xyz_banksimulation.entity.Account;
import com.example.xyz_banksimulation.exception.RecordNotFound;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Component
public class AccountRepository {
    public static List<Account> accountList = new ArrayList<>();

    public static List<Account> findAll() {

        return accountList;
    }

    public Account save(Account account) {
        accountList.add(account);
        return account;
    }


    public Account findByID(UUID accountId) {
        return accountList.stream().filter(p -> p.getId().equals(accountId))
                .findAny().orElseThrow(() -> new RecordNotFound("this account is not in a database"));

    }
}
