package com.srv.solid.dip;

public class ShoppingMall {

    private DebitCard debitCard;

    public ShoppingMall(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public void doPurchaseSomething(long amount){
        debitCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        DebitCard dc = new DebitCard();
        ShoppingMall sm = new ShoppingMall(dc);

        sm.doPurchaseSomething(5000);
    }
}
