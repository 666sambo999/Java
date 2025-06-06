package org.openjfx.academyfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("AcademyFX");
        stage.setScene(scene);
        stage.show();

//        stage.getIcons().add(new Image("file:halfmoon.png")); ????
    }

    public static void main(String[] args) {
        launch();
    }
}