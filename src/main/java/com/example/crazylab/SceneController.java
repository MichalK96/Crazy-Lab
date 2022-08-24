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
    private TextField userName;

    @FXML
    void startNewGame(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("gameScreen.fxml"));
        Parent root = loader.load();
        GameControler controller = loader.getController();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        System.out.println("ras");

        Scene scene = new Scene(root);
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {

                switch (keyEvent.getCode()) {

                    case UP:
                        controller.moveUp();
                        break;
                    case RIGHT:
                        controller.moveRight();
                        break;
                    case LEFT:
                        controller.moveLeft();
                        break;
                    case DOWN:
                        controller.moveDown();
                        break;
                    default:
                        System.out.println(keyEvent.getCode());
                        break;
                }

            }
        });

        stage.setScene(scene);
        stage.show();
        System.out.println("dwea");





}
}