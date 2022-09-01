package com.example.crazylab;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.stage.StageStyle;


import java.io.IOException;

public class SceneController {



    @FXML
    private TextField tfName;

    public static String userName = "123";

    public SceneController() {
    }

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
        stage.show();


}
}