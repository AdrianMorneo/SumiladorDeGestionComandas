package com.example.restaurantecomandas;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Clase para la vista de seleccion de los comensales
 */
public class ControladorListComensales {

    @FXML
    private Button atrasSC;
    @FXML
    private Label SCatras;
    static String numComensal = "";
    Main acessC = new Main();
    ObservableList<String> opciones;

    static List<String> resListC =new ArrayList<>(Arrays.asList("Comensal 1", "Comensal 2", "Comensal 3", "Comensal 4"));
    @FXML
    private ListView<String> ListaComensales;

    @FXML
    public void initialize() {

        SCatras.setText(acessC.comanda.getNumeroMesa());
        opciones = FXCollections.observableArrayList(resListC);
        ListaComensales.setItems(opciones);
        ListaComensales.setOnMouseClicked(this::handle);
    }

    /**
     * Metodo para selecionar en la lista de comensales el comensal sobre el que se va a realizar el pedido de la comanda
     * @param mouseEvent
     */
    public void handle(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 2) {
            // Obtiene el elemento seleccionado en el doble click
            numComensal = ListaComensales.getSelectionModel().getSelectedItem();
            try {
                siguienteCom1();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    /**
     * Metodo para el boton de volver atras de la vista de la seleccion de comensal en caso de que no se este haciendo una comanda
     * @throws IOException
     */
    @FXML
    public void atrasComen() throws IOException {
        Main cM = new Main();
        if (cM.comanda.getComensal1()== null&&cM.comanda.getComensal2()== null&&cM.comanda.getComensal3()== null&&cM.comanda.getComensal4()== null) {

            Stage stageActual = (Stage) atrasSC.getScene().getWindow();
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(ControladorListComensales.class.getResource("SalaTerraza.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root, 600, 400);
            stage.setScene(scene);
            stage.show();

            stageActual.close();
        }
    }
    /**
     * Metodo para cambiar de pantalla cuando se selecciona el comensal deseado
     * @throws IOException
     */
    @FXML
    public void siguienteCom1() throws IOException {

        Stage stageActual = (Stage) ListaComensales.getScene().getWindow();
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(ControladorListComensales.class.getResource("SeleccionPedido.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.show();

        stageActual.close();
    }
    /**
     * Metodo para eliminar el comensal seleccionado para no confundir al usuario y no permitir que se vuelva a seleccionar
     * borranolo de la lista de comensales
     * @param comensal
     */
    public void borrarCom(String comensal ){
        for (int i= 0 ; i <  resListC.size(); i++){
            if (resListC.get(i).equalsIgnoreCase(comensal)){
                resListC.remove(i);
            }
        }
    }
}
