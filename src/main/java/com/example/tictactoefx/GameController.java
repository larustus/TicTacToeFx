package com.example.tictactoefx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.animation.PauseTransition;
import javafx.util.Duration;
import java.io.IOException;
import java.util.Objects;

public class GameController{
    private Game game = new Game();

    @FXML
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

    @FXML
    private Button buttonBack;

    @FXML
    private Label endgame;

    private int getIDIndex(Button b){
        char temp = b.getId().charAt(1);
        String temp2 = String.valueOf(temp);
        return Integer.parseInt(temp2);
    }

    @FXML
    protected void clickedButton(ActionEvent event) throws IOException {
        Button clickedButton = (Button) event.getSource();
        int clickedIndex = getIDIndex(clickedButton);
        if (game.getBoard()[clickedIndex-1].getOccupation().equals(" ")) {
            clickedButton.setText(game.getTurn());
            game.makeMove(clickedIndex);
            if (game.checkEndgame()){
                endgame.setText("ENDGAME");
                buttonBack.setVisible(true);
            }
            game.changeTurn();
        }
    }

    @FXML
    private void restartGame(ActionEvent event) throws IOException{
        Stage stage;
        Parent root;


        stage = (Stage) buttonBack.getScene().getWindow();
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("start_screen.fxml")));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}