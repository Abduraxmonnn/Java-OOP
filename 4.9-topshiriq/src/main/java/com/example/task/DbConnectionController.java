package com.example.task;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DbConnectionController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}