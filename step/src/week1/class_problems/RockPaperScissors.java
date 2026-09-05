package week1.class_problems;

import java.util.Random;

public class RockPaperScissors {

    static String[] moves = {"Rock", "Paper", "Scissors"};

    public static void main(String[] args) {
        String[] playerMoves = {"Rock", "Paper", "Scissors", "Rock", "Paper"}; // predefined for demo
        int N = playerMoves.length;

        String[] playerHistory = new String[N];
        String[] computerHistory = new String[N];
        String[] results = new String[N];

        int wins = 0, losses = 0, draws = 0;
        Random rand = new Random();

        for (int i = 0; i < N; i++) {
            String playerMove = playerMoves[i];
            String computerMove = moves[rand.nextInt(3)];
            String result = playRound(playerMove, computerMove);

            playerHistory[i] = playerMove;
            computerHistory[i] = computerMove;
            results[i] = result;

            if (result.equals("Player Wins")) wins++;
            else if (result.equals("Computer Wins")) losses++;
            else draws++;
        }

        System.out.println("Round | Player Move | Computer Move | Result");
        for (int i = 0; i < N; i++) {
            System.out.printf("%-5d | %-11s | %-14s | %s%n",
                    i + 1, playerHistory[i], computerHistory[i], results[i]);
        }

        double winPercentage = (wins * 100.0) / N;
        System.out.printf("%nWins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%%n",
                wins, losses, draws, winPercentage);
    }

    static String playRound(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove)) return "Draw";

        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
                (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
                (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {
            return "Player Wins";
        }
        return "Computer Wins";
    }
}
