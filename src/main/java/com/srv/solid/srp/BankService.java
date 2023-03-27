package com.srv.solid.srp;

public class BankService {

    public long deposit(long amount, String accountNumber){
        //logic for amount deposit
        return 0;
    }

    public long withdraw(long amount, String accountNumber){
        //logic for amount withdraw
        return 0;
    }

    public void printPassbook(){
        //logic for print transactions on passbook
    }

    public void getLoanInterestInfo(String loanType){
        if(loanType.equals("homeLoan")){
            //logic
        }
        if(loanType.equals("personalLoan")){
            //logic
        }
        if(loanType.equals("carLoan")){
            //logic
        }
    }

    public void sendOTP(String medium){
        if(medium.equals("email")){
            //write email related logic
        }
    }
}
