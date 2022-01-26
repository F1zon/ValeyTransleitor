module com.example.kursovik {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens com.example.kursovik to javafx.fxml;
    exports com.example.kursovik;
}