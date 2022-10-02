package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToe {
    static void selectPosition(int number, char letter){
        System.out.println(position+ " is already taken");
        position=scanner.nextInt();
    }else {
        position=(int) ((Math.random()*10+1)%9);
        position=getPosition();
    }
}
            board[position] =letter;
static int getCornerPosition(){
        }
        return position;
        }
static int getAvailablePosition(){
        int position=(int)(Math.random()*10)%9+1;
        while (board[position]!=' '){
        position=(int)(Math.random()*10)%9+1;
        }
        return position;
        }
static int getPosition(){
        if ( board[1]==' ' && board[2]== computerSymbol && board[2] == board[3]
        || board[1]==' ' && board[4]== computerSymbol && board[4] == board[7]
static int getPosition(){
        || board[9]==' ' && board[7] == board[8] && board[8]!=' ') {
        return 9;
        }else {
        return getCornerPosition();
        boolean isCornerAvailable=(board[1]==' ' || board[3]==' ' || board[7]==' ' || board[9]==' ');
        boolean isCenterAvailable=(board[5]==' ');

        if (isCornerAvailable) {
        return getCornerPosition();
        } else if (isCenterAvailable) {
        return 5;
        }else {
        return getAvailablePosition();
                    }
                }
            }
        }
    }
}





