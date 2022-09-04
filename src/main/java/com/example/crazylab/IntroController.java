package com.example.crazylab;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class IntroController {

    @FXML
    private Label textWelcome;

    @FXML
    private void startNewGame(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("game.fxml"));
        Parent root = loader.load();
        GameControler controller = loader.getController();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        controller.paintMap();
        controller.move(scene);
        stage.setScene(scene);


        stage.setWidth(32*20);
        stage.setHeight(32*20);
        stage.setMaxWidth(32*20);
        stage.setMaxHeight(32*20);
        stage.setMinWidth(32*20);
        stage.setMinHeight(32*20);

        stage.show();
    }


    void setName(String name) {
        textWelcome.setText("Welcome, dr " + name);
    }

}
