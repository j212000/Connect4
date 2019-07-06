import java.util.Arrays;
import java.util.Scanner;

public class Connect4{


  public static void main(String[] args){
    //width = 7
    //height = 6

    boolean player1 = true;
    char[][] board = new char[7][6];
    initBoard(board);
    printBoard(board);

    String answer;
    Scanner scan = new Scanner(System.in);
    System.out.println("Which Coloum do you want to place the chip in 0-6");
    answer = scan.nextLine();

  










  }
  static void initBoard(char[][] board){

    for(int i = 0; i<7; i++){
      for(int j = 0; j<6; j++){
        board[i][j] = '.';
      }
    }
  }

  static void printBoard(char[][] board){

    for(int i = 0; i<7; i++){
      for(int j = 0; j<6; j++){
        System.out.print(board[i][j]);
      }
      System.out.println();

    }
    System.out.println();

  }

  public static void dropChip(char[][] board, boolean player1, int col) {
  //do if statement that checks if the row is empty;
  int row = 0;
  boolean flag = true;
  while(flag){
    if(board[col][row+1]== '.' && row != 5){
      row++;
    }
    else {
      flag = false;
    }

  }
  System.out.println("X");


  }






}
