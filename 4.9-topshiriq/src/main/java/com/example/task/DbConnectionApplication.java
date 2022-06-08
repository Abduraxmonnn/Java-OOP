package com.example.task;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DbConnectionApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(DbConnectionApplication.class.getResource("db-connection.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 420, 410);
        stage.setTitle("db-connection");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}