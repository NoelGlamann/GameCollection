package edu.neumont.csc150.Games.Connect4;

public class Computer extends Player{
    Computer(String name, boolean isHuman){
        setName(name);
        setHuman(isHuman);
    }

    @Override
    public String toString() {
        return("Player: "+getName() +"\n" +
                "\tType: "+(isHuman() == true? "Human" : "Computer") + "\n" +
                "\tOrder: "+(getPlayerOrder() == 1? "First" : "Second") + "\n"
        );
    }
}
