package com.cydeo.bootstrap;

import com.cydeo.entity.Account;
import com.cydeo.enums.UserRole;
import com.cydeo.repository.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.stream.Stream;

@Component
public class DataGenerator implements CommandLineRunner {

    private final AccountRepository accountRepository;


    public DataGenerator(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("**********************   Account start **************");
        System.out.println(accountRepository.findByCountryOrState("United States", "Alabama"));
        System.out.println();
        accountRepository.findByAgeLessThanEqual(35).forEach(System.out::println);
        System.out.println();
        accountRepository.findByRole(UserRole.USER).forEach(System.out::println);
        System.out.println();
        //accountRepository.streamByAgeBetween(30,40).forEach(System.out::println);
        accountRepository.findByAgeBetween(20,40).forEach(System.out::println);
        System.out.println();
        accountRepository.findByAddressStartsWith("26").forEach(System.out::println);
        accountRepository.findByOrderByAge().forEach(x -> System.out.println(x.getName()));

        System.out.println("%$%$%$%$%$ JPQL %$%$%$%$%$%$%$");
        accountRepository.getAllAdminAccounts().forEach(x-> System.out.println(x.getName()));
        accountRepository.getAllAccountsSortedByAge().forEach(x-> System.out.println(x.getName()));
        System.out.println("%$%$%$%$%$ NATIVE %$%$%$%$%$%$%$");

        System.out.println("**********************   Account finish *************");


    }
}
