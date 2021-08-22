package com.java.pattern.abstracts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the name of Bank : ");
        String bankName = br.readLine();

        AbstractFactory abstractBankFactory = AbstractFactoryCreator.getAbstractFoctory("Bank");
        Bank bank = abstractBankFactory.getBank(bankName);
        System.out.println(bank.openBankAccount());

        AbstractFactory abstractLoanFactory = AbstractFactoryCreator.getAbstractFoctory("Loan");
        System.out.println("Enter the type of Loan (PL , HL , EL) : ");
        String loanType=br.readLine();
        Loan loan = abstractLoanFactory.getLoan(loanType);

        System.out.println(loan.selectLoan());
    }

}
