package edu.neumont.csc150.Games;

import java.io.IOException;

public abstract class Game {
    protected String name;
    public abstract void run() throws IOException, InterruptedException;

}
