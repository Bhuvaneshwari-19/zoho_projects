/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fifteennumberpuzzle;
import java.util.*;

public class FifteenNumberPuzzle {
        static int n=4;
        static int row=n-1,col=n-1;
    public static void main(String[] args) {
        
        int[][] board=new int[n][n];
        ArrayList<Integer> numbers=new ArrayList<>();
        for(int i=1;i<=15;i++){
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        numbers.add(0);
        int numIter=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = numbers.get(numIter++);
            }
        }
        board[n-1][n-1]=0;
        boolean gameOver=false;
        while(gameOver==false){
            printBoard(board);
            if(wonGame(board)){
                //printBoard(board);
                System.out.println("Congrats, You've solved the puzzle! Great job!");
                gameOver=true;
            }
            System.out.println("Enter 1 to move up\nEnter 2 to move down\nEnter 3 to move left\nEnter 4 to move right\nEnter 5 to exit the game.");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            switch(choice){
                case 1->{
                    if(row==0){
                        System.out.println("Invalid move");
                        break;
                    }else{
                    board[row][col]=board[--row][col];
                    board[row][col]=0;
                    break;
                    }
                    }
                    
                case 2->{
                    if(row==n-1){
                        System.out.println("Invalid move");
                        break;
                    }else{
                    board[row][col]=board[++row][col];
                    board[row][col]=0;
                    break;
                }
                }
                case 3->{
                    if(col==0){
                        System.out.println("Invalid move");
                        break;
                    }else{
                    board[row][col]=board[row][--col];
                    board[row][col]=0;
                    break;
                }
                }
                case 4->{
                    if(col==n-1){
                        System.out.println("Invalid move");
                        break;
                    }else{
                    board[row][col]=board[row][++col];
                    board[row][col]=0;
                    break;
                }
                }
                case 5->{
                    return;
                }
                default->{
                    System.out.println("Enter valid option.");
                }
                    
            }
        }
    }
    
    static void printBoard(int[][] board){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==0)
                    System.out.print("   |");
                else{
                if(board[i][j]<10)
                    System.out.print(board[i][j]+"  |");
                else
                    System.out.print(board[i][j]+" |");
            }
            }
            System.out.println();
        }
    }
    static boolean wonGame(int[][] board){
        int k=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[n-1][n-1]!=0)
                    return false;
                if(board[i][j]!=k++)
                    return false;
            }
        }
        return true;
    }
}
