package org.example.bevoelkerung_und_flaeche;

import java.sql.*;

public class JdbcTest {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:postgresql://xserv:5432/world2";
        String user = "reader";
        String pass = "reader";

        try (Connection con = DriverManager.getConnection(url, user, pass);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM country")) {

            rs.next();
            System.out.println(" Connected! Countries: " + rs.getInt(1));
        }
    }
}

