package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BankAccount kicb = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        kicb.Depositka(350421.23);

        while (true){
            System.out.println(" Скок надо?: " );
            int sum = scanner.nextInt();

            try {
                kicb.withDraw(sum);
                System.out.println("Твое золото: " + kicb.getAmount());
            } catch (LimitException error) {
                System.err.println(error.getMessage());
                System.out.println("У тебя осталось: " + kicb.getAmount() + "Золота");

                try {
                    kicb.withDraw((int)(error.getRemainingAmount()));
                }catch (LimitException error1){
                    System.out.println(error.getMessage());
                }
            }break;

        }


    }


}