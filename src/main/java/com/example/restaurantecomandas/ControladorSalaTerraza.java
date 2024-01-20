package com.example.restaurantecomandas;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class ControladorSalaTerraza {
    Main acessC = new Main();
    @FXML
    private Button STatras;

    /**
     * Metodo para el boton de atras en la vista de seleccion de la mesa
     * @throws IOException
     */
    @FXML
    public void siguiente1() throws IOException {


            Stage stageActual = (Stage) STatras.getScene().getWindow();
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(ControladorLogin.class.getResource("Login.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root, 600, 400);
            stage.setScene(scene);
            stage.show();

            stageActual.close();
    }
    /*
    Metodos para devolver el identificador de la mesa que selecciona , uno por cada mesa
     */
    public void B0S() throws IOException {
        acessC.comanda.setNumeroMesa("0S");
        siguienteBoton();
    }
    public void B1S() throws IOException {
        acessC.comanda.setNumeroMesa("1S");
        siguienteBoton();
    }
    public void B2S() throws IOException {
        acessC.comanda.setNumeroMesa("2S");
        siguienteBoton();
    }
    public void B3S() throws IOException {
        acessC.comanda.setNumeroMesa("3S");
        siguienteBoton();
    }
    public void B4S() throws IOException {
        acessC.comanda.setNumeroMesa("4S");
        siguienteBoton();
    }
    public void B5S() throws IOException {
        acessC.comanda.setNumeroMesa("5S");
        siguienteBoton();
    }
    public void B6S() throws IOException {
        acessC.comanda.setNumeroMesa("6S");
        siguienteBoton();
    }
    public void B7S() throws IOException {
        acessC.comanda.setNumeroMesa("7S");
        siguienteBoton();
    }
    public void B8S() throws IOException {
        acessC.comanda.setNumeroMesa("8S");
        siguienteBoton();
    }
    public void B9S() throws IOException {
        acessC.comanda.setNumeroMesa("9S");
        siguienteBoton();
    }
    public void B10S() throws IOException {
        acessC.comanda.setNumeroMesa("10S");
        siguienteBoton();
    }
    public void B11S() throws IOException {
        acessC.comanda.setNumeroMesa("11S");
        siguienteBoton();
    }

    public void B0T() throws IOException {
        acessC.comanda.setNumeroMesa("0T");
        siguienteBoton();
    }
    public void B1T() throws IOException {
        acessC.comanda.setNumeroMesa("1T");
        siguienteBoton();
    }
    public void B2T() throws IOException {
        acessC.comanda.setNumeroMesa("2T");
        siguienteBoton();
    }
    public void B3T() throws IOException {
        acessC.comanda.setNumeroMesa("3T");
        siguienteBoton();
    }
    public void B4T() throws IOException {
        acessC.comanda.setNumeroMesa("4T");
        siguienteBoton();
    }
    public void B5T() throws IOException {
        acessC.comanda.setNumeroMesa("5T");
        siguienteBoton();
    }

    /**
     * Metodo para ir a la siguiente vista despues de seleccionar cualquier boton de las mesas
     * @throws IOException
     */
    @FXML
    public void siguienteBoton() throws IOException {
            Stage stageActual = (Stage) STatras.getScene().getWindow();
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(ControladorSalaTerraza.class.getResource("ListComensales.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root, 600, 400);
            stage.setScene(scene);
            stage.show();

            stageActual.close();
        }

}
