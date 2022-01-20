package com.example.testtask;

import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button button;

    @FXML
    private TextField enter_cod;

    @FXML
    private TextField enter_date;

    @FXML
    private Text outputusd;

    @FXML
    void initialize() {
        System.out.print("всё работает!");

    }

}
