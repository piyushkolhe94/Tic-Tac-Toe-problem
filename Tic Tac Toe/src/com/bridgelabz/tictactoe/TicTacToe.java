package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToe {
    static void userMove() {
        if (board[position] == ' ') {
            board[position] = player1letter;
        } else {
            while (board[position] != ' ') {
                System.out.println(position + " is already taken");
                position = scanner.nextInt();
            }
            board[position] = player1letter;
        }

    }
}



