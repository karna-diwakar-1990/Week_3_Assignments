package org.assignemnt_3;

import io.cucumber.java.bs.A;

public class AxisBank extends BankInfo {
    public void deposit(){
        System.out.println("Override Deposit of Parent bankInfo Class and Display amount to be deposited in Axis Bank");
    }

    public static void main(String[] args) {
        AxisBank ax =  new AxisBank();
        ax.deposit();
    }
}

