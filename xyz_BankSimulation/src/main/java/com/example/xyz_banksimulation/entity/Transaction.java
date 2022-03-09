package com.example.xyz_banksimulation.entity;

import com.example.xyz_banksimulation.enums.AccountType;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;


@Data
@Builder
public class Transaction {
    private UUID sender;
    private UUID receiver;
    private BigDecimal amount;
    private String message;
    private Date creationDate;


}
