package com.example.restaurantecomandas;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class ControladorSeleccionPedido {
    @FXML
    private Button aceptarP;
    @FXML
    private Button cancelarP;
    @FXML
    private Label NumeroMesa;
    @FXML
    private Label NumeroComensal;
    @FXML
    private RadioButton hamb;
    @FXML
    private RadioButton platoC;
    @FXML
    private RadioButton coca;
    @FXML
    private RadioButton cerve;
    @FXML
    private RadioButton agua;
    @FXML
    private RadioButton pizza;
    @FXML
    private TextArea comentariosArea;

    String comensalN = "";
    Main acessC = new Main();
    private Comandas cAux = acessC.comanda;

    @FXML
    public void initialize() {
        ControladorListComensales comensal = new ControladorListComensales();
        NumeroMesa.setText(cAux.getNumeroMesa());
        NumeroComensal.setText(comensal.numComensal);
        comensalN = comensal.numComensal;
    }

    /**
     * Metodo para el boton de cancelar pedido que dvuelve al usuario de seleccion de comensal
     * @throws IOException
     */
    @FXML
    public void cancelP() throws IOException {

            Stage stageActual = (Stage) cancelarP.getScene().getWindow();
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(ControladorSeleccionPedido.class.getResource("ListComensales.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root, 600, 400);
            stage.setScene(scene);
            stage.show();

            stageActual.close();
        }
    @FXML
    public void aceptarP() throws IOException {
        boolean comprobar = comprobarCampos();
        if(!comprobar) {
            String pide = pedido();
            pide = pide + comentariosArea.getText();
            if (comensalN.equalsIgnoreCase("Comensal 1")) {
                if (cAux.getComensal1() == null) {
                    //Guardo el String que me devuelve el metodo pedido en el atributo del comensal correspondiente en la coanda
                    cAux.setComensal1(pide);
                }
            } else if (comensalN.equalsIgnoreCase("Comensal 2")) {
                if (cAux.getComensal2() == null) {
                    cAux.setComensal2(pide);
                }
            } else if (comensalN.equalsIgnoreCase("Comensal 3")) {
                    if (cAux.getComensal3() == null) {
                        cAux.setComensal3(pide);
                    }
            } else if (comensalN.equalsIgnoreCase("Comensal 4")) {
                    if (cAux.getComensal4() == null) {
                        cAux.setComensal4(pide);
                    }
            }
            bComensalDeLista();
            Stage stageActual = (Stage) aceptarP.getScene().getWindow();
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(ControladorSeleccionPedido.class.getResource("Resumen.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root, 600, 400);
            stage.setScene(scene);
            stage.show();

            stageActual.close();
        }
    }

    /**
     * Metodo para guardar todo el texto necesario en base a la seleccion del usuario
     * @return
     */
   private String pedido(){
        String resumenDelPedido = "";
        if (hamb.isSelected()){
            resumenDelPedido = resumenDelPedido +" Hamburgesa, ";
        }
        if (platoC.isSelected()){
            resumenDelPedido = resumenDelPedido +" Plato Combinado, ";
        }
        if (pizza.isSelected()){
            resumenDelPedido = resumenDelPedido +" Pizza, ";
        }
        if (coca.isSelected()){
            resumenDelPedido = resumenDelPedido +" Cocacola, ";
        }
        if (cerve.isSelected()){
            resumenDelPedido = resumenDelPedido +" Cerveza, ";
        }
        if (agua.isSelected()){
            resumenDelPedido = resumenDelPedido +" Agua, ";
        }
       return resumenDelPedido;
    }

    /**
     * Metodo para no permitir al usuario aceptar el pedido si no hay ninguna bebida seleccionada o si no hay ninguna comida seleccionada e incluso ambos casos
     * @return
     */
    private boolean comprobarCampos(){
        boolean noListo = false;
            if (!cerve.isSelected() && !agua.isSelected() && !coca.isSelected() && !pizza.isSelected() && !hamb.isSelected() && !platoC.isSelected() ){
                noListo = true;
            }else if(!cerve.isSelected() && !agua.isSelected() && !coca.isSelected()){
                noListo = true;
            }else if(!pizza.isSelected() && !hamb.isSelected() && !platoC.isSelected()){
                noListo = true;
            }
        return noListo ;
    }

    /**
     * Metodo para borrar el comensal de la lista una vez se acepta su pedido
     */
    public void bComensalDeLista(){
        ControladorListComensales comensal = new ControladorListComensales();
        if (comensal.numComensal.equalsIgnoreCase("Comensal 1")){
            comensal.borrarCom("Comensal 1");
        }
        if (comensal.numComensal.equalsIgnoreCase("Comensal 2")){
            comensal.borrarCom("Comensal 2");
        }
        if (comensal.numComensal.equalsIgnoreCase("Comensal 3")){
            comensal.borrarCom("Comensal 3");
        }
        if (comensal.numComensal.equalsIgnoreCase("Comensal 4")){
            comensal.borrarCom("Comensal 4");
        }

    }
}
