package com.example.crazylab;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;


import java.io.IOException;

public class SceneController {



    @FXML
    private TextField tfName;

    public static String userName;



    @FXML
    private void showIntro(ActionEvent event) throws IOException {
        userName = tfName.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("intro.fxml"));
        Parent root = loader.load();
        GameControler gameControler = loader.getController();
        Scene intro = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(intro);
        stage.setTitle("Intro");
        gameControler.setName(userName);
    }

}