module org.example.bevoelkerung_und_flaeche {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.postgresql.jdbc;


    opens org.example.bevoelkerung_und_flaeche to javafx.fxml;
    exports org.example.bevoelkerung_und_flaeche;
}