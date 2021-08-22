package com.java.pattern.abstracts;

public class HomeLoan implements Loan{
    @Override
    public String selectLoan() {
        return "You have applied for HomeLoan on 5% interest rate";
    }
}
