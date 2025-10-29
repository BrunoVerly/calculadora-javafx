package org.example.calculadoracleber;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class CalculadoraApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CalculadoraApplication.class.getResource("calculadora.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 360  , 673);
        scene.getStylesheets().add(getClass().getResource("/css/style.css").toExternalForm());
        stage.setMinWidth(360);
        stage.setMinHeight(673);
        stage.setTitle("Calculadora");
        stage.setScene(scene);
        stage.show();

    }
}
