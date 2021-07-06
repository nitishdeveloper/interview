package com.java8.pattern.abstracts;

public class HdfcBank implements Bank{
    @Override
    public String selectBank() {
        return "HDFC BANK";
    }

    @Override
    public String openBankAccount() {
        return "Your "+selectBank()+"has been opened successfully...!!!";
    }
}
