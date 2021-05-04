package hello;

import java.util.Scanner;

public class rockPaperScissors {

    public static char logic(char h) {
        char winner = '.';
        int chandNum = (int) (Math.random() * 3) + 1;
        char chand = '.';
        switch (chandNum){
            case 1:
                chand = 'r';
                break;
            case 2:
                chand = 'p';
                break;
            case 3:
                chand = 's';
                break;
        }
        if ((h == 'r' && chand == 'r') || (h == 's' && chand == 's') || (h == 'p' && chand == 'p')) {
            winner = 't';
        }
        if (h == 'r' && chand == 's') {
            winner = 'h';
        }
        if (h == 'r' && chand == 'p') {
            winner = 'c';
        }
        if (h == 'p' && chand == 's') {
            winner = 'c';
        }
        if (h == 'p' && chand == 'r') {
            winner = 'h';
        }
        if (h == 's' && chand == 'r') {
            winner = 'c';
        }
        if (h == 's' && chand == 'p') {
            winner = 'h';
        }

        return winner;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char hand, check = 'y';
        System.out.println("*********\n" + "Game of rock paper scissors!");
        while (check == 'y') {
            System.out.print("Choose rock (r), paper (p) or scissors (s): ");
            hand = sc.next().charAt(0);
            switch (hand) {
                case 'r' -> {
                }
                case 'p' -> {
                }
                case 's' -> {
                }
                default -> {
                    System.out.println("Try again and select a correct hand.");
                    continue;
                }
            }
            if (logic(hand) == 't') {
                System.out.println("It's a tie.");
            }
            if (logic(hand) == 'h') {
                System.out.println("You win!");
            }
            if (logic(hand) == 'c') {
                System.out.println("You lose.");
            }
            System.out.println("Play again (y for yes)?");
            check = sc.next().charAt(0);
        }
    }
}
