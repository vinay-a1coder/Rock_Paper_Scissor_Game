package com.company;
import java.util.Random;
import java.util.Scanner;
public class game {
    public static void main(String[] args) {
//        0 for Rock,  1 for Paper and 2 for Scissor

        Scanner sc = new Scanner(System.in);
        System.out.println("0 for Rock, 1 for Paper and 2 for Scissor.");
        System.out.print("Choose your number: ");
        int userInput = sc.nextInt();

        Random rand = new Random();
        int compInput = rand.nextInt(3);

        if(userInput == compInput)
            System.out.println("Draw");
        else if((userInput==1 && compInput==2) || (userInput==1 && compInput==0) || (userInput==2 && compInput==1))
            System.out.println("You Won!");
        else
            System.out.println("Computer Won!");

        switch (compInput){
            case 0:
                System.out.println("Because Computer choose Rock");
                break;
            case 1:
                System.out.println("Because Computer choose Paper");
                break;
            case 2:
                System.out.println("Because Computer choose Scissor");
                break;
        }
    }
}
