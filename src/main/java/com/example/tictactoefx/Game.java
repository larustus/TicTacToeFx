package com.example.tictactoefx;

public class Game {
    private Field[] board = new Field[9];
    private String turn;

    public Game() {
        this.turn = "X";
        for (int i=0;i<9;i++){
            this.board[i] = new Field();
        }
    }

    public Field[] getBoard() {
        return board;
    }

    public void setBoard(Field[] board) {
        this.board = board;
    }

    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    public void changeTurn(){
        if (this.turn.equals("X")){
            this.turn = "O";
        }else{
            this.turn = "X";
        }
    }
    public void makeMove(int index){
        board[index-1].setOccupation(turn);
    }

    public boolean checkEndgame(){
        //check rows
        for (int i=0;i<9;i+=3){
            if ((board[i].getOccupation().equals(turn)) && (board[i+1].getOccupation().equals(turn)) && (board[i+2].getOccupation().equals(turn))){
                return true;
            }
        }

        //check columns
        for (int i=0;i<3;i+=1){
            if ((board[i].getOccupation().equals(turn)) && (board[i+3].getOccupation().equals(turn)) && (board[i+6].getOccupation().equals(turn))){
                return true;
            }
        }

        //check first diagonal
        if ((board[0].getOccupation().equals(turn)) && (board[4].getOccupation().equals(turn)) && (board[8].getOccupation().equals(turn))){
            return true;
        }

        //check second digonal
        if ((board[2].getOccupation().equals(turn)) && (board[4].getOccupation().equals(turn)) && (board[6].getOccupation().equals(turn))){
            return true;
        }
        return false;
    }

}
