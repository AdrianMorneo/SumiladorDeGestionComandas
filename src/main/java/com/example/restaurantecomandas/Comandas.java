package com.example.restaurantecomandas;

import java.util.Arrays;

/**
 * Clase del objeto comandas para cada comanda que se lleva a cabo con los atributos necesarios
 */
public class Comandas {

    private String numeroMesa;
    private String camarero;
    private String comensal1;
    private String comensal2;
    private String comensal3;
    private String comensal4;

    public Comandas(String numeroMesa, String camarero, String comensal1, String comensal2, String comensal3, String comensal4) {

        this.numeroMesa = numeroMesa;
        this.camarero = camarero;
        this.comensal1 = comensal1;
        this.comensal2 = comensal2;
        this.comensal3 = comensal3;
        this.comensal4 = comensal4;
    }

    public String getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(String numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public String getCamarero() {
        return camarero;
    }

    public void setCamarero(String camarero) {
        this.camarero = camarero;
    }

    public String getComensal1() {
        return comensal1;
    }

    public void setComensal1(String comensal1) {
        this.comensal1 = comensal1;
    }

    public String getComensal2() {
        return comensal2;
    }

    public void setComensal2(String comensal2) {
        this.comensal2 = comensal2;
    }

    public String getComensal3() {
        return comensal3;
    }

    public void setComensal3(String comensal3) {
        this.comensal3 = comensal3;
    }

    public String getComensal4() {
        return comensal4;
    }

    public void setComensal4(String comensal4) {
        this.comensal4 = comensal4;
    }

}

