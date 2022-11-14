package com.company;

public class Main {

    public static void main(String[] args) {
        String month = "January";

        switch (month.toLowerCase()){
            case "january":
                System.out.println("it's January");
                break;
            case "february":
                System.out.println("its February");
                break;
            default:
                System.out.println("its not January or February");

        }
    }
}
