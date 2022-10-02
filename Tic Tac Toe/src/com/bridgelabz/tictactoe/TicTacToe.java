package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToe {
    static void showBoard(){
        System.out.println("showing board :");
        for (int i = 1; i < 10; i++) {
            System.out.print(board[i]+" .");
            if (i == 3 || i==6) {
                System.out.println();
            }else {

            }
        }
        System.out.println();
        System.out.println(board[1]+" | "+board[2]+" | "+board[3]);
        System.out.println(board[4]+" | "+board[5]+" | "+board[6]);
        System.out.println(board[7]+" | "+board[8]+" | "+board[9]);
    }

    static void selectPosition(int number, char letter){
         static void selectPosition(int number, char letter){
            System.out.println(position+ " is already taken");
            position=scanner.nextInt();
        }else {
            position= (int) ((Math.random()*10+1)%9);
            position=(int) ((Math.random()*10+1)%9);
        }

    }
    static int getPosition(){
                || board[9]==' ' && board[3]== computerLetter && board[3] == board[6]
                || board[9]==' ' && board[7]== computerLetter && board[7] == board[8]) {
            return 9;
        }else if ( board[1]==' ' && board[2] == board[3]
                || board[1]==' ' && board[4] == board[7]
                || board[1]==' ' && board[5] == board[9]) {
        }else if ( board[1]==' ' && board[2] == board[3] && board[3]!=' '
                || board[1]==' ' && board[4] == board[7] && board[7]!=' '
                || board[1]==' ' && board[5] == board[9] && board[9]!=' ') {
            return 1;
        } else if (board[2]==' ' && board[1] == board[3]
                || board[2]==' ' && board[5] == board[8]) {
        } else if (board[2]==' ' && board[1] == board[3]  && board[3]!=' '
                || board[2]==' ' && board[5] == board[8]  && board[8]!=' ') {
            return 2;
        } else if (board[3]==' ' && board[1] == board[2]
                || board[3]==' ' && board[6] == board[9]
                || board[3]==' ' && board[5] == board[7]) {
        } else if (board[3]==' ' && board[1] == board[2]  && board[2]!=' '
                || board[3]==' ' && board[6] == board[9] && board[9]!=' '
                || board[3]==' ' && board[5] == board[7] && board[7]!=' ') {
            return 3;
        } else if (board[4]==' ' && board[1] == board[7]
                || board[4]==' ' && board[5] == board[6]) {
        } else if (board[4]==' ' && board[1] == board[7] && board[7]!=' '
                || board[4]==' ' && board[5] == board[6] && board[6]!=' ') {
            return 4;
        } else if (board[5]==' ' && board[1] == board[9]
                || board[5]==' ' && board[2] == board[8]
                || board[5]==' ' && board[3] == board[7]
                || board[5]==' ' && board[4] == board[6]) {
        } else if (board[5]==' ' && board[1] == board[9] && board[9]!=' '
                || board[5]==' ' && board[2] == board[8] && board[8]!=' '
                || board[5]==' ' && board[3] == board[7] && board[7]!=' '
                || board[5]==' ' && board[4] == board[6] && board[6]!=' ') {
            return 5;
        } else if (board[6]==' ' && board[3] == board[9]
                || board[6]==' ' && board[4] == board[5]) {
        } else if (board[6]==' ' && board[3] == board[9] && board[9]!=' '
                || board[6]==' ' && board[4] == board[5] && board[5]!=' ') {
            return 6;
        } else if (board[7]==' ' && board[1] == board[4]
                || board[7]==' ' && board[8] == board[9]
                || board[7]==' ' && board[5] == board[3]) {
        } else if (board[7]==' ' && board[1] == board[4] && board[4]!=' '
                || board[7]==' ' && board[8] == board[9] && board[9]!=' '
                || board[7]==' ' && board[5] == board[3] && board[3]!=' ') {
            return 7;
        } else if (board[8]==' ' && board[2] == board[5]
                || board[8]==' ' && board[7] == board[9]) {
        } else if (board[8]==' ' && board[2] == board[5] && board[5]!=' '
                || board[8]==' ' && board[7] == board[9] && board[9]!=' ') {
            return 8;
        } else if (board[9]==' ' && board[1] == board[5]
                || board[9]==' ' && board[3] == board[6]
                || board[9]==' ' && board[7] == board[8]) {
        } else if (board[9]==' ' && board[1] == board[5] && board[5]!=' '
                || board[9]==' ' && board[3] == board[6] && board[6]!=' '
                || board[9]==' ' && board[7] == board[8] && board[8]!=' ') {
            return 9;
        }else
            return  (int) ((Math.random()*10+1)%9);
                    }
                }
            }
        }
    }
}





