package edu.orangecoastcollege.sbadajoz.ic17;

import java.util.Scanner;

/*
Badajoz, Seve
CS A170
October 28, 2016

IC17
*/
public class FootballGameDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] teams = new String[2];
        int point, team;
        
        System.out.print("Please enter home team name: ");
        teams[0] = input.nextLine();
        
        System.out.print("\nPlease enter visitor team name: ");
        teams[1] = input.nextLine();
        
        FootballGame game = new FootballGame(teams[0], teams[1]);
        
        while(true) {
            System.out.println("\nEnter Scoring Event (or -1 to end game):\n"
                    + "1) To score touchdown\n"
                    + "2) To score extra point\n"
                    + "3) To score conversion\n"
                    + "4) To score field goal\n"
                    + "5) To score safety\n");
//            input.next();
            point = input.nextInt();
            if(point < 1 || point > 5) break;
            
            System.out.println("\nEnter Team:\n\n"
                    
                    + "1) For " + teams[0] + " (home)\n"
                    + "2) For " + teams[1] + " (visitor)\n");
            
            team = input.nextInt() - 1;
            
            switch(point) {
                case 1: game.scoreTouchdown(teams[team]);
                break;
                case 2: game.scoreExtraPoint(teams[team]);
                break;
                case 3: game.scoreConversion(teams[team]);
                break;
                case 4: game.scoreFieldGoal(teams[team]);
                break;
                case 5: game.scoreSafety(teams[team]);
                break;
                
            }
            
            System.out.println("\n" + game);
        }
       System.out.println("Game Over!");
    }
}
