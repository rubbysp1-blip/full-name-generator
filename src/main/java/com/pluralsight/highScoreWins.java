package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class highScoreWins {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Following This Format (Home:Visitor|21:9)\n" +
                "Enter game score: ");
        String gameScore = input.nextLine();

//        String[] tokens = gameScore.split(Pattern.quote("|"));
//
//        String[] teams = tokens[0].split(Pattern.quote(":"));
//        String[] teamScore = tokens[1].split(Pattern.quote(":"));

//        int homeTeamScore = Integer.parseInt(teamScore[0]);
//        int visitorTeamScore = Integer.parseInt(teamScore[1]);

        int homeTeamScore = returnHomeScore(gameScore);
        int visitorTeamScore = returnVisitorScore(gameScore);

        String winner = "";
        if(homeTeamScore > visitorTeamScore){
            winner = returnhomeTeamName(gameScore);
        }else{
            winner = returnVisitorTeamName(gameScore);
        }

        System.out.print("Winner: " + winner);

    }

    public static int returnHomeScore(String gameScore){

        String[] tokens = gameScore.split(Pattern.quote("|"));

        //String[] teams = tokens[0].split(Pattern.quote(":"));
        String[] teamScore = tokens[1].split(Pattern.quote(":"));

        //int visitorTeamScore = Integer.parseInt(teamScore[1]);

        return Integer.parseInt(teamScore[0]);

    }
    public static int returnVisitorScore(String gameScore){

        String[] tokens = gameScore.split(Pattern.quote("|"));

        //String[] teams = tokens[0].split(Pattern.quote(":"));
        String[] teamScore = tokens[1].split(Pattern.quote(":"));

        //int visitorTeamScore = Integer.parseInt(teamScore[1]);

        return Integer.parseInt(teamScore[1]);
    }
    public static String returnhomeTeamName(String gameScore){

        String[] tokens = gameScore.split(Pattern.quote("|"));

        String[] teams = tokens[0].split(Pattern.quote(":"));
        //String[] teamScore = tokens[1].split(Pattern.quote(":"));

        //int homeTeam = Integer.parseInt(teams[0]);
        //int visitorTeam = Integer.parseInt(teams[1]);

        return teams[0];
    }
    public static String returnVisitorTeamName(String gameScore){

        String[] tokens = gameScore.split(Pattern.quote("|"));

        String[] teams = tokens[0].split(Pattern.quote(":"));
        //String[] teamScore = tokens[1].split(Pattern.quote(":"));

        //int homeTeam = Integer.parseInt(teams[0]);
        //int visitorTeam = Integer.parseInt(teams[1]);

        return teams[1];
    }
}
