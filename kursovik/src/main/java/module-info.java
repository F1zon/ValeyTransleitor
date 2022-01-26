module com.example.kursovik {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;
    requires java.sql;


    opens com.example.kursovik to javafx.fxml;
    exports com.example.kursovik;
}