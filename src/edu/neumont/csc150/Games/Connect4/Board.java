package edu.neumont.csc150.Games.Connect4;

public class Board {
    Piece[][] boardArray = {
            {Piece.e, Piece.e, Piece.e, Piece.e, Piece.e, Piece.e, Piece.e},
            {Piece.e, Piece.e, Piece.e, Piece.e, Piece.e, Piece.e, Piece.e},
            {Piece.e, Piece.e, Piece.e, Piece.e, Piece.e, Piece.e, Piece.e},
            {Piece.e, Piece.e, Piece.e, Piece.e, Piece.e, Piece.e, Piece.e},
            {Piece.e, Piece.e, Piece.e, Piece.e, Piece.e, Piece.e, Piece.e},
            {Piece.e, Piece.e, Piece.e, Piece.e, Piece.e, Piece.e, Piece.e},
            {Piece.n, Piece.n, Piece.n, Piece.n, Piece.n, Piece.n, Piece.n},
    };

    public Piece[][] resetBoard(){
        Piece[][] boardArray = {
                {Piece.e, Piece.e, Piece.e, Piece.e, Piece.e, Piece.e, Piece.e},
                {Piece.e, Piece.e, Piece.e, Piece.e, Piece.e, Piece.e, Piece.e},
                {Piece.e, Piece.e, Piece.e, Piece.e, Piece.e, Piece.e, Piece.e},
                {Piece.e, Piece.e, Piece.e, Piece.e, Piece.e, Piece.e, Piece.e},
                {Piece.e, Piece.e, Piece.e, Piece.e, Piece.e, Piece.e, Piece.e},
                {Piece.e, Piece.e, Piece.e, Piece.e, Piece.e, Piece.e, Piece.e},
                {Piece.n, Piece.n, Piece.n, Piece.n, Piece.n, Piece.n, Piece.n},
        };
        return boardArray;
    }
    public boolean columnAvailable(int column){
        boolean available = false;
        if (boardArray[0][column-1] == Piece.e){
            available = true;
        }
        return available;
    }
    public int rowAvailable(int column) {
        int rowIndex = 0;
        for(Piece[] row: boardArray){
            if (row[column-1] != Piece.e){
                break;
            }
            rowIndex++;
        }
        return rowIndex;
    }

    public void playPiece(Player p, int column, int row){
        Piece pieceColor = p.getMyColor();
        boardArray[row-1][column-1] = pieceColor;
    }

    public boolean checkForWin(Piece color, int column){
        boolean won = checkVertical(color, column);
        if(!won){
            won = checkHorizontal(color);
        }
        if(!won){
            won = checkDiagonal(color);
        }
        return won;
    }
    public boolean checkForTie(Piece[][] b){
        boolean tie = true;
        for (Piece p: b[0]){
            if (p == Piece.e){
                tie = false;
            }
        }
        return tie;
    }
    public boolean checkVertical(Piece color, int column){
        boolean won = false;
        int count = 0;
        for(int row = 0; row < boardArray.length; row++){
            if (boardArray[row][column-1] == color){
                count++;
                if (count==4){
                    won = true;
                }
            }else{
                count = 0;
            }
        }
        return won;
    }
    public boolean checkHorizontal(Piece color){
        boolean won = false;
        for(Piece[] row: boardArray) {
            int count = 0;
            for (Piece p : row) {
                if (p == color){
                    count++;
                    if (count == 4){
                        won = true;
                    }
                }else{
                    count=0;
                }
            }
        }
        return won;
    }
    public boolean checkDiagonal(Piece color){
        boolean won = false;
        return won;
    }

}
