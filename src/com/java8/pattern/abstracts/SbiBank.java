package com.java8.pattern.abstracts;

public class SbiBank implements Bank{

    @Override
    public String selectBank() {
        return "SBI BANK";
    }

    @Override
    public String openBankAccount() {
        return "Your "+selectBank()+"has been opened successfully...!!!";
    }
}
