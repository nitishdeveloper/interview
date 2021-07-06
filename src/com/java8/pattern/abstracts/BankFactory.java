package com.java8.pattern.abstracts;

public class BankFactory implements  AbstractFactory{
    @Override
    public Bank getBank(String bank) {
        switch (bank){
            case "Hdfc":
                return new HdfcBank();
            case "Icici":
                return new IciciBank();
            case "Sbi":
                return new SbiBank();
            default:

        }
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}
