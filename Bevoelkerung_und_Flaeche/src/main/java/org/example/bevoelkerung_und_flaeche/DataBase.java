package org.example.bevoelkerung_und_flaeche;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase { //stellt eine Verbindung zur PostgreSQL-Datenbank "world2" her

    //Verbindungsdaten in eigener Klasse, damit andere Klassen DataBase.connect
    //aufrufen können zur Verbindung.
    private static final String URL = "jdbc:postgresql://xserv:5432/world2";
    private static final String USER = "reader";
    private static final String PASSWORD = "reader";

    public static Connection connect() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    //connect() baut die Verbindung zur Datenbank auf und gibt ein Connection-Objekt zurück
    //wenn Server nicht erreichbar ist -> SQLExeption
}
