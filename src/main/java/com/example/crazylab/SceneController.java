package com.example.crazylab;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.stage.StageStyle;


import java.io.IOException;

public class SceneController {



    @FXML
    private TextField tfName;

    @FXML
    private Button btn_continue;

    @FXML
    private Label text_welcome;

    public static String userName;



    @FXML
    private void showIntro() throws IOException {
        userName = tfName.getText();
        Parent root = FXMLLoader.load(getClass().getResource("intro.fxml"));
        Scene intro = new Scene(root);
        Stage stage = new Stage();
        text_welcome.setText("ffff");
        System.out.println("ssssssssssssssssss" + userName);

        stage.setScene(intro);
        stage.setTitle("Intro");
        stage.showAndWait();

    }
    @FXML
    private void close_intro(ActionEvent event) {
        Stage stage = (Stage)btn_continue.getScene().getWindow();
        stage.close();
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


        stage.setWidth(32*20);
        stage.setHeight(32*20);
        stage.setMaxWidth(32*20);
        stage.setMaxHeight(32*20);
        stage.setMinWidth(32*20);
        stage.setMinHeight(32*20);

        stage.show();
        showIntro();
    }
}