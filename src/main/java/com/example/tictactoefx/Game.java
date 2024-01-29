package com.example.tictactoefx;

public class Game {
    private Field[][] board = new Field[3][3];
    private Field[] board2 = new Field[9];
    private String turn;

    public Game() {
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                Field f = new Field("free");
                this.board[i][j] = f;
            }
        }
    }

    public Field[][] getBoard() {
        return board;
    }

    public void setBoard(Field[][] board) {
        this.board = board;
    }

    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    public Field[] getBoard2() {
        return board2;
    }

    public void setBoard2(Field[] board2) {
        this.board2 = board2;
    }
    public void setField(Field f, int index){
        this.board2[index] = f;
    }
}
