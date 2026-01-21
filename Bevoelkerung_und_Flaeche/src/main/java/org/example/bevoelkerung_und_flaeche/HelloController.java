package org.example.bevoelkerung_und_flaeche;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    public HelloController(){
        System.out.println("Hello");
    }
    public void initialize(){
        welcomeText.setText("Welcome");
    }
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}