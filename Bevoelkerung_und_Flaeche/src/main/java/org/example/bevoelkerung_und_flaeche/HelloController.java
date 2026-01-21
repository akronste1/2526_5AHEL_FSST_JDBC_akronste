package org.example.bevoelkerung_und_flaeche;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.sql.SQLException;

public class HelloController {
    @FXML
    private Label welcomeText;

    private static class ContinentData{
        String continent;
        double population;
        double area;

        public ContinentData(String continent, double population, double area) {
            this.continent = continent;
            this.population = population;
            this.area = area;
        }
    }

    public HelloController(){
        System.out.println("Hello");
    }
    public void initialize(){
        welcomeText.setText("Welcome");
        try(var con = DataBase.connect()){//Testen, ob die Verbindung zur Datenbank besteht
            System.out.println("Database connected: " + con.getMetaData().getURL());//con.getMetaData() liefert Infos über die Verbindung (Datenbank-Typ, Treiber, URL, Version…).
        } catch (Exception e) {
            System.out.println("Connection failed.");
            e.printStackTrace(); //druckt FEhlermeldung + Ursache in die Konsole
        }
    }
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}