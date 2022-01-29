package com.javalearning;


import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
	    Bank bank = new Bank("Chase Bank");

        bank.addBranch("Texas");

        bank.addCustomer("Texas", "Joe", 50.50);
        bank.addCustomer("Texas", "Furay", 175.99);
        bank.addCustomer("Texas", "ken", 320.67);

        bank.addBranch("Louisiana");
        bank.addCustomer("Louisiana", "Bob", 150.54);

        bank.addCustomerTransaction("Texas", "Joe", 50.25);
        bank.addCustomerTransaction("Texas", "Joe", 12.99);
        bank.addCustomerTransaction("Texas", "Furay", 554.00);

        bank.listCustomers("Texas", true);

    }
}
