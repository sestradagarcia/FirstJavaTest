package Enums;

public class Runner {
    public static void main(String[] args) {
        Game game = new Game();
        for (int i = 0; i < 10; i++) game.generateChoice(RPS.SCISSORS);
    }
}
