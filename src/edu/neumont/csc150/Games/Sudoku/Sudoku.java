package edu.neumont.csc150.Games.Sudoku;

import edu.neumont.csc150.Games.Console;
import edu.neumont.csc150.Games.Game;

import java.io.IOException;

public class Sudoku extends Game {
    @Override
    public void run() throws IOException, InterruptedException{

        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        displayBoard(board);

    }
    private static void displayBoard(int[][] board){
        loopByRow(board);
        System.out.println();
    }
    private static void loopByRow(int[][] board){
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                int contents = board[row][column];

                if (column == 2 || column == 5){
                    System.out.print(Console.BLUE);
                    System.out.print(" " +(contents == 0? " " : contents)+ " ");
                    System.out.print(Console.RED);
                    System.out.print("|");
                    System.out.print(Console.RESET);
                }else{
                    System.out.print(Console.BLUE);
                    System.out.print(" " +(contents == 0? " " : contents)+ " ");
                    System.out.print(Console.RESET);
                }
            }
            System.out.println();
            if (row== 2 | row == 5){
                System.out.print(Console.RED);
                System.out.print("---------|---------|--------");
                System.out.println(Console.RESET);
            }
        }
    }

}