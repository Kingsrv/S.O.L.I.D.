package com.srv.solid.dip.solution;

public class CreditCardDI implements Card{
    public void doTransaction(long amount) {
        System.out.println("payment using credit card");
    }
}
