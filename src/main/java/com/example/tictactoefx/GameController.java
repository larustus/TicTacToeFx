package com.example.tictactoefx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

public class GameController{

    private String turn = "X";

    @FXML
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

    private void changeTurn(){
        if (turn.equals("X")){
            turn = "O";
        }else{
            turn = "X";
        }
    }

    @FXML
    protected void clickedButton(ActionEvent event) throws IOException {
        Button[] buttons = new Button[]{b1, b2, b3, b4, b5, b6, b7, b8, b9};
        Button[][] buttons2 = new Button[][]{{b1, b2, b3}, {b4, b5, b6}, {b7, b8, b9}};

        for (Button button : buttons){
            if (event.getSource()==button){
                button.setText(turn);
                changeTurn();
            }
        }
    }
}