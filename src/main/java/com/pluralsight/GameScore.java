package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class GameScore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the game score: ");

        String input = scanner.nextLine();
        String[] tokens = input.split(Pattern.quote("|"));

        System.out.println(tokens[0] + "\n" + tokens[1]);

        String[] location = tokens[0].split(Pattern.quote(":"));
        System.out.println(location[0] + "\n" + location[1]);

        String[] stringScore = tokens[1].split(Pattern.quote(":"));

        int score1 = Integer.parseInt(stringScore[0]);
        int score2 = Integer.parseInt(stringScore[1]);

        System.out.println(score1 + " " + score2);



        // Home:Visitor|21:9
        // print the team with the higher score
    }
}
