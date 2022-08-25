package com.example.crazylab;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;




import java.io.IOException;

public class SceneController {



    @FXML
    private TextField tfName;

    public static String userName;

    public SceneController() {
    }

    @FXML
    void startNewGame(ActionEvent event) throws IOException {
        userName = tfName.getText();
        System.out.println(userName);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("gameScreen.fxml"));
        Parent root = loader.load();
        GameControler controller = loader.getController();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        controller.move(scene);

        stage.setScene(scene);
        stage.show();






}
}