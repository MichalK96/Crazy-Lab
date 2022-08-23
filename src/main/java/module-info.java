module com.example.crazylab {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.crazylab to javafx.fxml;
    exports com.example.crazylab;
}