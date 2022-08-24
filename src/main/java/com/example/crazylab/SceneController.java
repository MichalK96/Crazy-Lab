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




import java.io.IOException;

public class SceneController {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField userName;

    @FXML
    void startNewGame(ActionEvent event) throws IOException {
        System.out.println(".....................................................");
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("gameScreen.fxml"));   //TODO problem ze ścieżką
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        GameControler.move();

    }

}
