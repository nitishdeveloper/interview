package com.java.pattern.abstracts;

public class LoanFactory implements  AbstractFactory{


    @Override
    public Bank getBank(String bank) {
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        switch (loan){
            case "HL":
                return new HomeLoan();
            case "PL":
                return new PersonalLoan();
            case "EL":
                return new EducationLoan();
            default:

        }
        return null;
    }
}
