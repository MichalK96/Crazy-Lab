package com.example.crazylab.save;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.TilePane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Save {

    private Connection conn;
    public Save()  {

        String user = System.getenv("PSQL_USER_NAME");
        String password = System.getenv("PSQL_PASSWORD");
        String url = "jdbc:postgresql://localhost/"+System.getenv("PSQL_DB_NAME");

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        this.conn = conn;
    }

    public boolean saveProgress(String currentMap, String playerPosition, String inventoryContent)
    {
        TextInputDialog td = new TextInputDialog("Name");
        td.setTitle("Save Game");
        td.setHeaderText("");

        ((Button)(td.getDialogPane().lookupButton(ButtonType.OK))).setText("Save");
        ((Button)(td.getDialogPane().lookupButton(ButtonType.CANCEL))).setText("Cancel");


        td.showAndWait();
        String player = (td.getEditor().getText());


        try {
            Statement s = conn.createStatement();

            String sql = "INSERT INTO save(user_name, map, position, inventory_content) VALUES('##0##','##1##','##2##','##3##')";
            sql = sql.replace("##0##", player);
            sql = sql.replace("##1##", currentMap);
            sql = sql.replace("##2##", playerPosition);
            sql = sql.replace("##3##", inventoryContent);
            System.out.println(sql);
            s.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }

        return true;
    }
}
