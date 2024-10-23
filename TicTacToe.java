/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tictactoe;
import java.util.*;
public class TicTacToe {
    static int n=3;
    public static void main(String[] args) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]=' ';
            }
        }
        Scanner sc=new Scanner(System.in);
        char Opponent='X';
        boolean gameOver=false;
        while(gameOver==false){
        printBoard(board);
        if(checkDraw(board)){
            System.out.println("The game ended with draw");
            System.out.println("Do you want to play again?\nEnter 1 to play again or 0 to exit the game: ");
            int play=sc.nextInt();
            if(play==0){
                System.out.println("Thank you for playing!");
                return;
            }
            else{
                resetBoard(board);
                continue;
            }
        }
        System.out.println("For Opponent "+Opponent+", Where do you want to place?...Enter in terms of rows and columns(0-2) with space: ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        if(board[r][c]==' ')
            board[r][c]=Opponent;
        else{
            System.out.println("Invalid move! Please enter correctly...");
            continue;
        }
        if(checkWin(board,Opponent)){
            printBoard(board);
            System.out.println("Opponent "+Opponent+" won the game!");
            gameOver=true;
            continue;
        }
            Opponent=(Opponent=='X')?'O':'X';
    }
    }
    static void printBoard(char[][] board){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(board[i][j] +" |");
            }
            System.out.println();
        }
    }
    static boolean checkWin(char[][] board,char Opponent){
        
    //rowwisecheck
    for(int r=0;r<n;r++){
            if(board[r][0]==Opponent && board[r][1]==Opponent && board[r][2]==Opponent){
                return true;
            }
        }   
    //colwiseheck
    for(int c=0;c<n;c++){
        if(board[0][c]==Opponent && board[1][c]==Opponent && board[2][c]==Opponent){
            return true;
        }
    }
    //diagonal1
    if(board[0][0]==Opponent && board[1][1]==Opponent && board[2][2]==Opponent){
        return true;
    }
    //diagonal2
    if(board[0][2]==Opponent && board[1][1]==Opponent && board[2][0]==Opponent){
        return true;
    }
    
    return false;
}

static boolean checkDraw(char[][] board){
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        if(board[i][j]==' ')
            return false;
    }
}
return true;
}

static void resetBoard(char[][] board){
    for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]=' ';
            }
        }
}
}