package com.java8.pattern.abstracts;

public class AbstractFactoryCreator {
    public static AbstractFactory getAbstractFoctory(String choice){
        if("Bank".equalsIgnoreCase(choice)){
            return new BankFactory();
        }
        else if("Loan".equalsIgnoreCase(choice)){
            return new LoanFactory();
        }
        return null;
    }
}
