package com.srv.solid.dip.solution;

public class ShoppingMallDI {

    private Card card;

    public ShoppingMallDI(Card card) {
        this.card = card;
    }

    public void doPurchaseSomething(long amount){
        card.doTransaction(amount);
    }

    public static void main(String[] args) {
        //runtime polymorphism
        Card c = new DebitCardDI();
        ShoppingMallDI sm = new ShoppingMallDI(c);

        sm.doPurchaseSomething(5000);
    }
}
