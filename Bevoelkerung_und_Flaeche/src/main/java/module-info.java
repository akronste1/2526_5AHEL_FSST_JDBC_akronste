module org.example.bevoelkerung_und_flaeche {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.bevoelkerung_und_flaeche to javafx.fxml;
    exports org.example.bevoelkerung_und_flaeche;
}