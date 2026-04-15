package com.pluralsight;

import java.util.Scanner;

public class HighscoreApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a game score: ");
        String userInput = scanner.nextLine();

        String[] splitOne = userInput.split("\\|");
        String[] teams = splitOne[0].split(":");
        String[] scores = splitOne[1].split(":");

        if(Integer.parseInt(scores[0]) > Integer.parseInt(scores[1])){
            System.out.println("Winner: " + teams[0]);
        } else {
            System.out.println("Winner: " + teams[1]);
        }

    }
}