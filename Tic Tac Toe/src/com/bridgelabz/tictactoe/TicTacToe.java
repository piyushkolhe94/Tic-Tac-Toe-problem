package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToe {
    static final int PLAYER_1=1;    //user
    static final int PLAYER_2=2;    //computer
    static final int COMPUTER =2;    //computer
    static int currentPlayer;
    static int winner;
    static char player1letter=' ';
    @@ -33,14 +33,14 @@ public static void main(String[] args) throws InterruptedException {
    }else {
        System.out.println("computer turn");
        Thread.sleep(1000);
        position= (int) ((Math.random()*10+1)%9);
        position= getPosition();
        selectPosition(position,player2letter);
    }
    showBoard();
    winner=checkWinner();

    //switch current player
    currentPlayer=(currentPlayer == PLAYER_1) ? PLAYER_2 : PLAYER_1;
    currentPlayer=(currentPlayer == PLAYER_1) ? COMPUTER : PLAYER_1;

}
        if (winner == PLAYER_1) {
@@ -60,6 +60,8 @@ static void showBoard(){
        System.out.print(board[i]+" .");
        if (i == 3 || i==6) {
        System.out.println();
        }else {

        }
        }
        System.out.println();
@@ -84,32 +86,70 @@ static void selectPosition(int number, char letter){
        }
        }
static int doToss(){
        if((Math.random()*10)%2 ==1){
        if( ((int)(Math.random()*10)%2)+1 ==PLAYER_1){
        System.out.println("user won the toss");
        return PLAYER_1;
        }else{
        System.out.println("computer won the toss");
        return PLAYER_2;
        return COMPUTER;
        }
        }

static int checkWinner(){
        if (board[1] == board[2] && board[2] == board[3] && board[2] !=' ') {
        return  (board[1] == player1letter) ? PLAYER_1 : PLAYER_2;
        return  (board[1] == player1letter) ? PLAYER_1 : COMPUTER;
        } else if (board[4] == board[5] && board[5] == board[6] && board[5] !=' ') {
        return  (board[4] == player1letter) ? PLAYER_1 : PLAYER_2;
        return  (board[4] == player1letter) ? PLAYER_1 : COMPUTER;
        } else if (board[7] == board[8] && board[8] == board[9] && board[8] !=' ') {
        return  (board[7] == player1letter) ? PLAYER_1 : PLAYER_2;
        return  (board[7] == player1letter) ? PLAYER_1 : COMPUTER;
        } else if (board[1] == board[4] && board[4] == board[7] && board[4] !=' ') {
        return  (board[1] == player1letter) ? PLAYER_1 : PLAYER_2;
        return  (board[1] == player1letter) ? PLAYER_1 : COMPUTER;
        } else if (board[2] == board[5] && board[5] == board[8] && board[5] !=' ') {
        return  (board[2] == player1letter) ? PLAYER_1 : PLAYER_2;
        return  (board[2] == player1letter) ? PLAYER_1 : COMPUTER;
        } else if (board[3] == board[6] && board[6] == board[9] && board[6] !=' ') {
        return  (board[3] == player1letter) ? PLAYER_1 : PLAYER_2;
        return  (board[3] == player1letter) ? PLAYER_1 : COMPUTER;
        } else if (board[1] == board[5] && board[5] == board[9] && board[5] !=' ') {
        return  (board[1] == player1letter) ? PLAYER_1 : PLAYER_2;
        return  (board[1] == player1letter) ? PLAYER_1 : COMPUTER;
        } else if (board[3] == board[5] && board[5] == board[7] && board[5] !=' ') {
        return  (board[3] == player1letter) ? PLAYER_1 : PLAYER_2;
        return  (board[3] == player1letter) ? PLAYER_1 : COMPUTER;
        }else return 0;
        }

static int getPosition(){
        if ( board[1]==' ' && board[2]==player2letter && board[2] == board[3]
        || board[1]==' ' && board[4]==player2letter && board[4] == board[7]
        || board[1]==' ' && board[5]==player2letter && board[5] == board[9]) {
        return 1;
        } else if (board[2]==' ' && board[1]==player2letter && board[1] == board[3]
        || board[2]==' ' && board[5]==player2letter && board[5] == board[8]) {
        return 2;
        } else if (board[3]==' ' && board[1]==player2letter && board[1] == board[2]
        || board[3]==' ' && board[6]==player2letter && board[6] == board[9]
        || board[3]==' ' && board[5]==player2letter && board[5] == board[7]) {
        return 3;
        } else if (board[4]==' ' && board[1]==player2letter && board[1] == board[7]
        || board[4]==' ' && board[5]==player2letter && board[5] == board[6]) {
        return 4;
        } else if (board[5]==' ' && board[1] == player2letter && board[1] == board[9]
        || board[5]==' ' && board[2] == player2letter && board[2] == board[8]
        || board[5]==' ' && board[3] == player2letter && board[3] == board[7]
        || board[5]==' ' && board[4]==player2letter && board[4] == board[6]) {
        return 5;
        } else if (board[6]==' ' && board[3]==player2letter && board[3] == board[9]
        || board[6]==' ' && board[4]==player2letter && board[4] == board[5]) {
        return 6;
        } else if (board[7]==' ' && board[1]==player2letter && board[1] == board[4]
        || board[7]==' ' && board[8]==player2letter && board[8] == board[9]
        || board[7]==' ' && board[5]==player2letter && board[5] == board[3]) {
        return 7;
        } else if (board[8]==' ' && board[2]==player2letter && board[2] == board[5]
        || board[8]==' ' && board[7]==player2letter && board[7] == board[9]) {
        return 8;
        } else if (board[9]==' ' && board[1]==player2letter && board[1] == board[5]
        || board[9]==' ' && board[3]==player2letter && board[3] == board[6]
        || board[9]==' ' && board[7]==player2letter && board[7] == board[8]) {
        return 9;
        }else
        return  (int) ((Math.random()*10+1)%9);
                    }
                }
            }
        }
    }
}




