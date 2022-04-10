package com.gloriaaaron.project2;
import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Scanner play = new Scanner(System.in);
        int number = 1 + (int)(20 * Math.random());
        int attempts = 6;
        int i;
        String user;
        int guess;
        String replay;

        System.out.println("Hello! What is your name?");
        user = name.nextLine();
        System.out.println("Well, " + user + ", I am thinking of a number between 1 and 20. \n" +
                "Take a guess.");

        for (i = 0; i < attempts; i++) {
            guess = input.nextInt();
            if (number == guess) {
                System.out.println(
                        "Good job, "
                                + user + ". You guessed my number. \n" +
                                "Would you like to play again? (y or n)"
                                 );
                replay = play.nextLine();
                break;
            }
            else if (number > guess
                    && i != attempts - 1) {
                System.out.println(
                        guess + " is too low. \n" +
                                "Take a guess.");
            }
            else if (number < guess
                    && i != attempts - 1) {
                System.out.println(
                        guess + " is too high. \n" +
                                "Take a guess.");
            }
        }

        if (i == attempts) {
            System.out.println(
                    "You have exhausted all "
                            + attempts
                            + " attempts.");

            System.out.println(
                    "The number was " + number);
        }
    }
}
