package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToe {
     public static void main(String[] args) throws InterruptedException {
        System.out.println("1.Play again \n2.Exit");
        resetGame(scanner.nextInt());
    }


};

    }

static char chooseLetter(){
        char letter=' ';
        while (letter != 'O' && letter != 'X'){
 static void showBoard(){
        System.out.println(board[4]+" | "+board[5]+" | "+board[6]);
        System.out.println(board[7]+" | "+board[8]+" | "+board[9]);
        }

static void selectPosition(int number, char letter){
        int position=number;

static void selectPosition(int number, char letter){
        }else {
        position=(int) ((Math.random()*10+1)%9);
        }

        }
        board[position] =letter;
        }
 static int doToss(){
        return COMPUTER;
        }
        }

static void resetGame(int x){
        if (x == 1) {
        for (int i = 0; i < 10; i++) {
 static void resetGame(int x){
        moveCount=0;
        showBoard();
        }

        }

static int checkWinner(){
        if (board[1] == board[2] && board[2] == board[3] && board[2] !=' ') {
        return  (board[1] == playerLetter) ? PLAYER_1 : COMPUTER;
 static int checkWinner(){
        return  (board[3] == playerLetter) ? PLAYER_1 : COMPUTER;
        }else return 0;
        }

static int getPosition(){
        if ( board[1]==' ' && board[2]== computerLetter && board[2] == board[3]
        || board[1]==' ' && board[4]== computerLetter && board[4] == board[7]
 static int getPosition(){
        || board[9]==' ' && board[3] == board[6] && board[6]!=' '
        || board[9]==' ' && board[7] == board[8] && board[8]!=' ') {
        return 9;
        }else
        return  (int) ((Math.random()*10+1)%9);
        }else return  (int) ((Math.random()*10+1)%9);
    }
}
        }
        }






