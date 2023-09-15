package Enums;

import java.util.Random;

public class Game {
    Random rand = new Random();
    public void generateChoice(RPS hChoice) {
        int num = rand.nextInt(3);
        RPS cpuChoice = null;
        if (num == 1) cpuChoice = RPS.ROCK;
        else if (num == 2) cpuChoice = RPS.PAPER;
        else cpuChoice = RPS.SCISSORS;


        if(cpuChoice == hChoice ){
            System.out.println(RPS.DRAW);
        } else if (cpuChoice== RPS.ROCK && hChoice == RPS.PAPER) {
            System.out.println(RPS.WIN);
        }
        else if (cpuChoice== RPS.SCISSORS && hChoice == RPS.ROCK) {
            System.out.println(RPS.WIN);
        }
        else if (cpuChoice== RPS.PAPER && hChoice == RPS.SCISSORS) {
            System.out.println(RPS.WIN);
        }
        else {
            System.out.println(RPS.LOSE);
        }
    }

}
