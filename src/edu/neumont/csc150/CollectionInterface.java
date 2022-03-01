package edu.neumont.csc150;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CollectionInterface {
    private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public void displayMainMenu() {
        System.out.println("\n\nWhat game would you like to play?\r\n" +
                "\t1 - Hangman\r\n" +
                "\t2 - Connect Four\r\n" +
                "\t3 - Sudoku\r\n" +
                "\t4 - Exit\r\n");
    }

    public int getUserInputAsInt(int min, int max) throws IOException {
        float value = getUserInputAsFloat(min, max);

        return (int) value;
    }
    public float getUserInputAsFloat(float min, float max) throws IOException {
        float input = 0;
        do {
            String line = in.readLine();
            try {
                input = Float.parseFloat(line);
                if (input < min || input > max) {
                    throw new NumberFormatException("out of range");
                }
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Input invalid. " +
                        "You must enter a number between " + min + " and " + max);
            }
        } while (true);
        return input;
    }
}
