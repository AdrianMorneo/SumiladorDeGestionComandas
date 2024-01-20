
package com.example.restaurantecomandas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * ADRIAN MORENO NOVILLO
 * Metodo Main donde se ejecuta el hilo principal de la aplicacion
 */
public class Main extends Application {
    public static Comandas comanda = new Comandas(null , null , null  , null , null , null);
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}