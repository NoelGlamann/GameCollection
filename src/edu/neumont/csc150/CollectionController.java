package edu.neumont.csc150;

import edu.neumont.csc150.Games.Connect4.Connect4;
import edu.neumont.csc150.Games.Game;
import edu.neumont.csc150.Games.Sudoku.Sudoku;

import java.io.IOException;

public class CollectionController {
    CollectionInterface ci = new CollectionInterface();
    public void runMain() throws IOException, InterruptedException {

        while(true){
            ci.displayMainMenu();
            int selection = ci.getUserInputAsInt(1,4);
            switch (selection) {
                case 1 -> {
                    //hangman
                }
                case 2 -> {
                    //connect four
                    Game connectFour = new Connect4();
                    connectFour.run();
                }
                case 3 -> {
                    //sudoku
                    Game sudoku = new Sudoku();
                    sudoku.run();
                }
                case 4 -> {
                    return;
                }
                default -> throw new IllegalArgumentException("unknown menu item\n");
            }
        }
    }
}
