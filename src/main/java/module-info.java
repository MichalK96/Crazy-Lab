module com.example.crazylab {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.desktop;


    opens com.example.crazylab to javafx.fxml;
    exports com.example.crazylab;
    exports com.example.crazylab.map;
    opens com.example.crazylab.map to javafx.fxml;
}