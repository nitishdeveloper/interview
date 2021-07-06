package com.java8.pattern.abstracts;

public interface AbstractFactory {
    Bank getBank(String bank);
    Loan getLoan(String loan);
}
