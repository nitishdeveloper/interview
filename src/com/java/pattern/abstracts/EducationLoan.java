package com.java.pattern.abstracts;

public class EducationLoan implements Loan{
    @Override
    public String selectLoan() {
        return "You have applied for EducationLoan on 7% interest rate";
    }
}
