package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToe {
    static final int PLAYER_1 = 0;    //user
    static final int PLAYER_2 = 1;    //computer
    static final int PLAYER_1 = 1;    //user
    static final int PLAYER_2 = 2;    //computer
    static int currentPlayer;
    static int winner;
    static char player1letter = ' ';
    static char player2letter = ' ';
    static Scanner scanner = new Scanner(System.in);
    static char[] board = new char[]{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',};

    public static void main(String[] args) {
        public static void main (String[]args) throws InterruptedException {
            int position;
            System.out.println("Welcome to Tic Tac Toe Game");

            @ @ -24, 18 + 25, 29 @@public static void main (String[]args){
                currentPlayer = doToss();
                showBoard();

                if (currentPlayer == PLAYER_1) {
                    System.out.println("user won the toss");
                    System.out.println("select position on board (1 to 9)");
                    position = scanner.nextInt();
                } else {
                    System.out.println("computer won the toss");
                    position = (int) ((Math.random() * 10 + 1) % 9);
                }
                while (winner == 0) {
                    if (currentPlayer == PLAYER_1) {
                        System.out.println("your turn select position");
                        position = scanner.nextInt();
                        selectPosition(position, player1letter);
                    } else {
                        System.out.println("computer turn");
                        Thread.sleep(1000);
                        position = (int) ((Math.random() * 10 + 1) % 9);
                        selectPosition(position, player2letter);
                    }
                    showBoard();
                    winner = checkWinner();

                    selectPosition(position);
                    //switch current player
                    currentPlayer = (currentPlayer == PLAYER_1) ? PLAYER_2 : PLAYER_1;

                    showBoard();
                }
                if (winner == PLAYER_1) {
                    System.out.println("Congratulaions...\nyou won the game");
                } else {
                    System.out.println("you lost the game");
                }
            }

            static char chooseLetter () {
                @ @ -53, 24 + 65, 51 @@static void showBoard () {
                    System.out.println();
                }

                static void selectPosition ( int number){
                    static void selectPosition ( int number, char letter){
                        int position = number;

                        if (board[position] == ' ') {
                            board[position] = player1letter;
                            board[position] = letter;
                        } else {
                            while (board[position] != ' ') {
                                System.out.println(position + " is already taken");
                                position = scanner.nextInt();
                                if (currentPlayer == PLAYER_1) {
                                    System.out.println(position + " is already taken");
                                    position = scanner.nextInt();
                                } else {
                                    position = (int) ((Math.random() * 10 + 1) % 9);
                                }

                            }
                            board[position] = player1letter;
                            board[position] = letter;
                        }
                    }
                    static int doToss () {
                        if ((Math.random() * 10) % 2 == 1) {
                            System.out.println("user won the toss");
                            return PLAYER_1;
                        } else {
                            System.out.println("computer won the toss");
                            return PLAYER_2;
                        }
                    }

                    static int checkWinner () {
                        if (board[1] == board[2] && board[2] == board[3] && board[2] != ' ') {
                            return (board[1] == player1letter) ? PLAYER_1 : PLAYER_2;
                        } else if (board[4] == board[5] && board[5] == board[6] && board[5] != ' ') {
                            return (board[4] == player1letter) ? PLAYER_1 : PLAYER_2;
                        } else if (board[7] == board[8] && board[8] == board[9] && board[8] != ' ') {
                            return (board[7] == player1letter) ? PLAYER_1 : PLAYER_2;
                        } else if (board[1] == board[4] && board[4] == board[7] && board[4] != ' ') {
                            return (board[1] == player1letter) ? PLAYER_1 : PLAYER_2;
                        } else if (board[2] == board[5] && board[5] == board[8] && board[5] != ' ') {
                            return (board[2] == player1letter) ? PLAYER_1 : PLAYER_2;
                        } else if (board[3] == board[6] && board[6] == board[9] && board[6] != ' ') {
                            return (board[3] == player1letter) ? PLAYER_1 : PLAYER_2;
                        } else if (board[1] == board[5] && board[5] == board[9] && board[5] != ' ') {
                            return (board[1] == player1letter) ? PLAYER_1 : PLAYER_2;
                        } else if (board[3] == board[5] && board[5] == board[7] && board[5] != ' ') {
                            return (board[3] == player1letter) ? PLAYER_1 : PLAYER_2;
                        } else return 0;
                    }
                }
            }
        }
    }
}




