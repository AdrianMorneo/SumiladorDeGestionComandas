package com.example.restaurantecomandas;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class ControladorLogin {
    @FXML
    private Button LogAtras;
    @FXML
    private TextField TextoLogin;
    @FXML
    private Label avisoL;

    /**
     * Metodo para el boton Entrar en la vista del Login
     * @throws IOException
     */
    @FXML
    public void siguiente() throws IOException {

        Main acessC = new Main();
        if (!TextoLogin.getText().isBlank()) {
            Stage stageActual = (Stage) LogAtras.getScene().getWindow();
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(ControladorLogin.class.getResource("SalaTerraza.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root, 600, 400);
            stage.setScene(scene);
            stage.show();

            stageActual.close();
            acessC.comanda.setCamarero(TextoLogin.getText());
        }else{
            avisoL.setText("Introduzca un nombre de usuario porfavor");
        }
        }
    }



