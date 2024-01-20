module com.example.restaurantecomandas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.restaurantecomandas to javafx.fxml;
    exports com.example.restaurantecomandas;
}