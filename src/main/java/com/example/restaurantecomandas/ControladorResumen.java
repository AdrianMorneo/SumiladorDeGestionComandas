package com.example.restaurantecomandas;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;

public class ControladorResumen {
    @FXML
    private Label Resumen;
    @FXML
    private Label CamareroRnom;
    @FXML
    private Button ac;
    @FXML
    private Button pc;
    Main acessC = new Main();
    private Comandas cAux = acessC.comanda;

    @FXML
    public void initialize() {

        CamareroRnom.setText(cAux.getCamarero());
        String res = resumen();
        Resumen.setText(res);
        if ( cAux.getComensal1() != null && cAux.getComensal2() != null && cAux.getComensal3() != null && cAux.getComensal4() != null){
            ac.setDisable(true);
        }
    }

    /**
     * Metodo para el boton de anadir un comensal a la comanda que se este llevando a cabo en el momento
     * @throws IOException
     */
    @FXML
    public void anadirComen() throws IOException {

        Stage stageActual = (Stage) ac.getScene().getWindow();
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(ControladorResumen.class.getResource("ListComensales.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.show();

        stageActual.close();
    }

    /**
     * Metodo que usa el boton cancelar comanda y el boton procesar comanda , para simular el funcionamiento del programa
     * devolviendo al usuario a la vista de seleccion de mesa y reseteando por completo el contenido del objecto coanda de
     * la comanda actual
     * @throws IOException
     */
    @FXML
    public void procComan() throws IOException {
        ControladorListComensales clc = new ControladorListComensales();
        Stage stageActual = (Stage) pc.getScene().getWindow();
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(ControladorResumen.class.getResource("SalaTerraza.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.show();

        stageActual.close();
        cAux.setComensal1(null);
        cAux.setComensal2(null);
        cAux.setComensal3(null);
        cAux.setComensal4(null);
        clc.resListC.clear();
        clc.resListC.add("Comensal 1");
        clc.resListC.add("Comensal 2");
        clc.resListC.add("Comensal 3");
        clc.resListC.add("Comensal 4");
    }

    /**
     * Metodo para formatear y dejar mas limpio el texto del resumen de la coamda que se esta tratando en el momento
     * @return
     */
    public String resumen(){

        String c1 = cAux.getComensal1();
        String c2 = cAux.getComensal2();
        String c3 = cAux.getComensal3();
        String c4 = cAux.getComensal4();

        if (c1 == null){
            c1 = " ";
        }
        if (c2 == null){
            c2 = " ";
        }
        if (c3 == null){
            c3 = " ";
        }
        if (c4 == null){
            c4 = " ";
        }
        String resumen = "-Comensal 1:\n" + c1 + '\n' + "-Comensal 2:\n" + c2 + '\n' + "-Comensal 3:\n" + c3 + '\n' + "-Comensal 4:\n" + c4 + '\n' ;
        return resumen ;
    }
}
