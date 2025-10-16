package org.example.tutorial01;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    //*INIT - Esto es una prueba
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("El Tómas es Gay!");
    }

    protected void onHelloButtonClick2() {
        welcomeText.setText("Mucho!");
    }

    //FIN - fin prueba0
}
