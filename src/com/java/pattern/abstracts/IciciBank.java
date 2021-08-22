package com.java.pattern.abstracts;

public class IciciBank implements Bank{
    @Override
    public String selectBank() {
        return "ICICI BANK";
    }

    @Override
    public String openBankAccount() {
        return "Your "+selectBank()+"has been opened successfully...!!!";
    }
}
