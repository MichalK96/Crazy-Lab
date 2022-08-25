package com.example.crazylab;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
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

        FXMLLoader loader = new FXMLLoader(getClass().getResource("gameScreen2.fxml"));
        Parent root = loader.load();
        GameControler controller = loader.getController();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("gameScreen2.fxml"));   //TODO problem ze ścieżką

        scene = new Scene(root);
        controller.move(scene, stage);
        stage.setScene(scene);
        System.out.println("po naszym kontyrolerze");
        stage.show();


    }

}
