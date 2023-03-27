package com.srv.solid.dip.solution;

public class DebitCardDI implements Card{
    public void doTransaction(long amount) {
        System.out.println("payment using debit card");
    }
}
