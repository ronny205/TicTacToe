package com.ronnie;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Board {

    static String[] board;
    static String turn;

    //CheckWinner method willl decide the winner
    static String checkWinner() {
        for (int a = 0; a < 8; a++) {
            String line = null;

            switch (a) {
                //Horizontal Possibilities
                case 0 -> line = board[0] + board[1] + board[2];
                case 1 -> line = board[3] + board[4] + board[5];
                case 2 -> line = board[6] + board[7] + board[8];

                //Vertical Possibilities
                case 3 -> line = board[0] + board[3] + board[6];
                case 4 -> line = board[1] + board[4] + board[7];
                case 5 -> line = board[2] + board[5] + board[8];

                //Diagonal Possibilities
                case 6 -> line = board[0] + board[4] + board[8];
                case 7 -> line = board[2] + board[4] + board[6];
            }

            // For X Winner
            if (line.equals("XXX")) {
                return "X";
            }

            //For O Winner
            else if (line.equals("OOO")) {
                return "O";
            }
        }

        for (int a = 0; a < 9; a++){
            if(Arrays.asList(board).contains(String.valueOf(a + 1))){
                break;
            } else if( a == 8 ){
                return "draw";
            }
        }

        System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
        return null;
    }

    //To print the board
    static void printBoard(){
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        board = new String[9];
        turn = "X";
        String winner = null;

        for(int a = 0; a < 9; a++){
            board[a] = String.valueOf(a + 1);
        }

        System.out.println("Welcome to 3x3 Tic Tac Toe.");
        printBoard();
        System.out.println("X will play First. Enter a slot number to place X in: ");

        while(winner == null){
            int numInput;

            try {
                numInput = in.nextInt();

                //check range

                if(!(numInput > 0 && numInput <= 9)){
                    System.out.println("Invalid input; re-enter slot number: ");
                    continue;
                }

                //check if slot is available
                if (board[numInput - 1] .equals(String.valueOf(numInput))) {
                    board[numInput - 1] = turn;

                    //toggle turn
                    turn = turn.equals("X") ? "O" : "X";

                    printBoard();
                    winner = checkWinner();
                } else {
                    System.out.println("Slot already taken; re-enter slot number:");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input: re-enter slot number");
                in.nextLine(); //consume invalid input to prevent infinite loop
            }
        }

        //final result
        if(winner.equalsIgnoreCase("draw")) {
            System.out.println("It's a draw! Thanks for Playing.");
        } else {
            System.out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");
        }
        in.close();
    }
}
