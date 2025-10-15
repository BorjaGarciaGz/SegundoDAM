package org.example.demofx03;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Bienvenido a Fx!");
    }


    @FXML
    protected void onHelloButtonClick2() {
        welcomeText.setText("Bienvenido!");
    }

}
