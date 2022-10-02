package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToe {
    static final int PLAYER_1=1;    //user
    static final int COMPUTER =2;    //computer
    static int currentPlayer;
    static int winner;
    static char playerLetter =' ';
    static char computerLetter =' ';
    public enum Winner{
        PLAYER1,COMPUTER
    }
    static Winner currentPlayer;
    static Winner winner;
    static char playerSymbol;
    static char computerSymbol;
    static int moveCount;
    static Scanner scanner=new Scanner(System.in);
    static char []board=new char[]{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',};
    static char []board=new char[10];

    public static void main(String[] args) throws InterruptedException {
        int position;
        System.out.println("Welcome to Tic Tac Toe Game");

        playerLetter =chooseLetter();
        computerLetter =(playerLetter == 'O') ? 'X': 'O';
        playerSymbol =chooseLetter();
        computerSymbol =(playerSymbol == 'O') ? 'X': 'O';

        System.out.println("player-letter = "+ playerLetter);
        System.out.println("computer-Letter = "+ computerLetter);
        System.out.println("player-letter = "+ playerSymbol);
        System.out.println("computer-Letter = "+ computerSymbol);

        currentPlayer=doToss();
        initializeBoard();
        showBoard();

        while (winner == 0 && moveCount<9){
            if (currentPlayer == PLAYER_1) {
                while (winner == null && moveCount<9){
                    if (currentPlayer == Winner.PLAYER1) {
                        System.out.println("your turn select position");
                        position=scanner.nextInt();
                        selectPosition(position, playerLetter);
                        selectPosition(position, playerSymbol);
                    }else {
                        System.out.println("computer turn");
                        Thread.sleep(1000);
                        position= getPosition();
                        selectPosition(position, computerLetter);
                        selectPosition(position, computerSymbol);
                    }
                    showBoard();
                    winner=checkWinner();

                    //switch current player
                    currentPlayer=(currentPlayer == PLAYER_1) ? COMPUTER : PLAYER_1;
                    currentPlayer=(currentPlayer == Winner.PLAYER1) ? Winner.COMPUTER : Winner.PLAYER1;
                    moveCount++;

                    if (winner == PLAYER_1) {
                        if (winner == Winner.PLAYER1) {
                            System.out.println("Congratulaions...\nyou won the game");
                            System.out.println("1.Play again \n2.Exit");
                            resetGame(scanner.nextInt());
                        }else if (winner == COMPUTER) {
                            resetBoard(scanner.nextInt());
                        }else if (winner == Winner.COMPUTER) {
                            System.out.println("you lost the game");
                            System.out.println("1.Play again \n2.Exit");
                            resetGame(scanner.nextInt());
                        }else if (moveCount == 9 && winner==0) {
                            resetBoard(scanner.nextInt());
                        }else if (moveCount == 9 && winner== null) {
                            System.out.println("Match is draw ");
                            System.out.println("1.Play again \n2.Exit");
                            resetGame(scanner.nextInt());
                            int playOption=scanner.nextInt();
                            resetBoard(playOption);

                        }
                    };
                }
            }
            static char chooseLetter(){
                char letter=' ';
                @@ -68,7 +72,6 @@ static char chooseLetter(){
                    return letter;
                }
                static void showBoard(){
                    System.out.println("showing board :");
                    System.out.println(board[1]+" | "+board[2]+" | "+board[3]);
                    System.out.println(board[4]+" | "+board[5]+" | "+board[6]);
                    System.out.println(board[7]+" | "+board[8]+" | "+board[9]);
                    @@ -80,7 +83,7 @@ static void selectPosition(int number, char letter){
                        board[position] =letter;
                    }else {
                        while (board[position] != ' '){
                            if (currentPlayer == PLAYER_1) {
                                if (currentPlayer == Winner.PLAYER1) {
                                    System.out.println(position+ " is already taken");
                                    position=scanner.nextInt();
                                }else {
                                    @@ -90,77 +93,91 @@ static void selectPosition(int number, char letter){
                                        board[position] =letter;
                                    }
                                }
                                static int doToss(){
                                    if( ((int)(Math.random()*10)%2)+1 ==PLAYER_1){
                                        static Winner doToss(){
                                            if( ((int)(Math.random()*10)%2)+1 == 1){
                                                System.out.println("user won the toss");
                                                return PLAYER_1;
                                                return Winner.PLAYER1;
                                            }else{
                                                System.out.println("computer won the toss");
                                                return COMPUTER;
                                                return Winner.COMPUTER;
                                            }
                                        }
                                        static void resetGame(int x){
                                            if (x == 1) {
                                                for (int i = 0; i < 10; i++) {
                                                    board[i]=' ';
                                                }
                                                winner=0;
                                                static void initializeBoard(){
                                                    for (int i = 0; i < board.length; i++) {
                                                        board[i]=' ';
                                                    }
                                                }
                                                static void resetBoard(int x){
                                                    if (x == 1) {               //1. play again
                                                        initializeBoard();
                                                        winner=null;
                                                        moveCount=0;
                                                        currentPlayer=doToss();
                                                        showBoard();

                                                    }
                                                }
                                                static int checkWinner(){
                                                    static Winner checkWinner(){
                                                        if (board[1] == board[2] && board[2] == board[3] && board[2] !=' ') {
                                                            return  (board[1] == playerLetter) ? PLAYER_1 : COMPUTER;
                                                            return  (board[1] == playerSymbol) ? Winner.PLAYER1 : Winner.COMPUTER;
                                                        } else if (board[4] == board[5] && board[5] == board[6] && board[5] !=' ') {
                                                            return  (board[4] == playerLetter) ? PLAYER_1 : COMPUTER;
                                                            return  (board[4] == playerSymbol) ? Winner.PLAYER1 : Winner.COMPUTER;
                                                        } else if (board[7] == board[8] && board[8] == board[9] && board[8] !=' ') {
                                                            return  (board[7] == playerLetter) ? PLAYER_1 : COMPUTER;
                                                            return  (board[7] == playerSymbol) ? Winner.PLAYER1 : Winner.COMPUTER;
                                                        } else if (board[1] == board[4] && board[4] == board[7] && board[4] !=' ') {
                                                            return  (board[1] == playerLetter) ? PLAYER_1 : COMPUTER;
                                                            return  (board[1] == playerSymbol) ? Winner.PLAYER1 : Winner.COMPUTER;
                                                        } else if (board[2] == board[5] && board[5] == board[8] && board[5] !=' ') {
                                                            return  (board[2] == playerLetter) ? PLAYER_1 : COMPUTER;
                                                            return  (board[2] == playerSymbol) ? Winner.PLAYER1 : Winner.COMPUTER;
                                                        } else if (board[3] == board[6] && board[6] == board[9] && board[6] !=' ') {
                                                            return  (board[3] == playerLetter) ? PLAYER_1 : COMPUTER;
                                                            return  (board[3] == playerSymbol) ? Winner.PLAYER1 : Winner.COMPUTER;
                                                        } else if (board[1] == board[5] && board[5] == board[9] && board[5] !=' ') {
                                                            return  (board[1] == playerLetter) ? PLAYER_1 : COMPUTER;
                                                            return  (board[1] == playerSymbol) ? Winner.PLAYER1 : Winner.COMPUTER;
                                                        } else if (board[3] == board[5] && board[5] == board[7] && board[5] !=' ') {
                                                            return  (board[3] == playerLetter) ? PLAYER_1 : COMPUTER;
                                                        }else return 0;
                                                        return  (board[3] == playerSymbol) ? Winner.PLAYER1 : Winner.COMPUTER;
                                                    }else return null;
                                                }
                                                static int getCornerPosition(){
                                                    int position=0;
                                                    while (board[position] != ' ' || position==0){
                                                        int []corners=new int[]{1,3,7,9};
                                                        int i=(int)(Math.random()*10)%4;
                                                        position= corners[i];
                                                    }
                                                    return position;
                                                }
                                                static int getPosition(){
                                                    if ( board[1]==' ' && board[2]== computerLetter && board[2] == board[3]
                                                            || board[1]==' ' && board[4]== computerLetter && board[4] == board[7]
                                                            || board[1]==' ' && board[5]== computerLetter && board[5] == board[9]) {
                                                        if ( board[1]==' ' && board[2]== computerSymbol && board[2] == board[3]
                                                                || board[1]==' ' && board[4]== computerSymbol && board[4] == board[7]
                                                                || board[1]==' ' && board[5]== computerSymbol && board[5] == board[9]) {
                                                            return 1;
                                                        } else if (board[2]==' ' && board[1]== computerLetter && board[1] == board[3]
                                                                || board[2]==' ' && board[5]== computerLetter && board[5] == board[8]) {
                                                        } else if (board[2]==' ' && board[1]== computerSymbol && board[1] == board[3]
                                                                || board[2]==' ' && board[5]== computerSymbol && board[5] == board[8]) {
                                                            return 2;
                                                        } else if (board[3]==' ' && board[1]== computerLetter && board[1] == board[2]
                                                                || board[3]==' ' && board[6]== computerLetter && board[6] == board[9]
                                                                || board[3]==' ' && board[5]== computerLetter && board[5] == board[7]) {
                                                        } else if (board[3]==' ' && board[1]== computerSymbol && board[1] == board[2]
                                                                || board[3]==' ' && board[6]== computerSymbol && board[6] == board[9]
                                                                || board[3]==' ' && board[5]== computerSymbol && board[5] == board[7]) {
                                                            return 3;
                                                        } else if (board[4]==' ' && board[1]== computerLetter && board[1] == board[7]
                                                                || board[4]==' ' && board[5]== computerLetter && board[5] == board[6]) {
                                                        } else if (board[4]==' ' && board[1]== computerSymbol && board[1] == board[7]
                                                                || board[4]==' ' && board[5]== computerSymbol && board[5] == board[6]) {
                                                            return 4;
                                                        } else if (board[5]==' ' && board[1] == computerLetter && board[1] == board[9]
                                                                || board[5]==' ' && board[2] == computerLetter && board[2] == board[8]
                                                                || board[5]==' ' && board[3] == computerLetter && board[3] == board[7]
                                                                || board[5]==' ' && board[4]== computerLetter && board[4] == board[6]) {
                                                        } else if (board[5]==' ' && board[1]== computerSymbol && board[1] == board[9]
                                                                || board[5]==' ' && board[2]== computerSymbol && board[2] == board[8]
                                                                || board[5]==' ' && board[3]== computerSymbol && board[3] == board[7]
                                                                || board[5]==' ' && board[4]== computerSymbol && board[4] == board[6]) {
                                                            return 5;
                                                        } else if (board[6]==' ' && board[3]== computerLetter && board[3] == board[9]
                                                                || board[6]==' ' && board[4]== computerLetter && board[4] == board[5]) {
                                                        } else if (board[6]==' ' && board[3]== computerSymbol && board[3] == board[9]
                                                                || board[6]==' ' && board[4]== computerSymbol && board[4] == board[5]) {
                                                            return 6;
                                                        } else if (board[7]==' ' && board[1]== computerLetter && board[1] == board[4]
                                                                || board[7]==' ' && board[8]== computerLetter && board[8] == board[9]
                                                                || board[7]==' ' && board[5]== computerLetter && board[5] == board[3]) {
                                                        } else if (board[7]==' ' && board[1]== computerSymbol && board[1] == board[4]
                                                                || board[7]==' ' && board[8]== computerSymbol && board[8] == board[9]
                                                                || board[7]==' ' && board[5]== computerSymbol && board[5] == board[3]) {
                                                            return 7;
                                                        } else if (board[8]==' ' && board[2]== computerLetter && board[2] == board[5]
                                                                || board[8]==' ' && board[7]== computerLetter && board[7] == board[9]) {
                                                        } else if (board[8]==' ' && board[2]== computerSymbol && board[2] == board[5]
                                                                || board[8]==' ' && board[7]== computerSymbol && board[7] == board[9]) {
                                                            return 8;
                                                        } else if (board[9]==' ' && board[1]== computerLetter && board[1] == board[5]
                                                                || board[9]==' ' && board[3]== computerLetter && board[3] == board[6]
                                                                || board[9]==' ' && board[7]== computerLetter && board[7] == board[8]) {
                                                        } else if (board[9]==' ' && board[1]== computerSymbol && board[1] == board[5]
                                                                || board[9]==' ' && board[3]== computerSymbol && board[3] == board[6]
                                                                || board[9]==' ' && board[7]== computerSymbol && board[7] == board[8]) {
                                                            return 9;
                                                        }else if ( board[1]==' ' && board[2] == board[3] && board[3]!=' '
                                                                || board[1]==' ' && board[4] == board[7] && board[7]!=' '
                                                        @@ -195,6 +212,8 @@ static int getPosition(){
                || board[9]==' ' && board[3] == board[6] && board[6]!=' '
                                                                    || board[9]==' ' && board[7] == board[8] && board[8]!=' ') {
                                                                return 9;
                                                            }else return  (int) ((Math.random()*10+1)%9);
                                                        }else {
                                                            return getCornerPosition();
                    }
                }
            }
        }
    }
}





