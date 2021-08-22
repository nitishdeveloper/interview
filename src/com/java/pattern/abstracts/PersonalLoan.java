package com.java.pattern.abstracts;

public class PersonalLoan implements Loan{
    @Override
    public String selectLoan() {
        return "You have applied for PersonalLoan on 10% interest rate";
    }
}
