module com.example.testtask {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testtask to javafx.fxml;
    exports com.example.testtask;
}