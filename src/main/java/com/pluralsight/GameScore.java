package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class GameScore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the game score: ");
        String input = scanner.nextLine();

        String[] tokens = input.split(Pattern.quote("|"));

        String[] location = tokens[0].split(Pattern.quote(":"));

        String[] stringScore = tokens[1].split(Pattern.quote(":"));

        int score1 = Integer.parseInt(stringScore[0]);
        int score2 = Integer.parseInt(stringScore[1]);

        String winner;
        if (score1 == score2) {
            winner = "Tie!";
        } else if (score1 > score2) {
            winner = location[0];
        } else {
            winner = location[1];
        }

        System.out.printf("Winner: %s", winner);
    }
}
