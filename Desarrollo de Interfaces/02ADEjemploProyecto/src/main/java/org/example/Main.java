package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        try {
            crearConexion();
            System.out.println("Conexion a la base de datos");
        }  catch (SQLException e) {
            System.out.println("Error de SQL: "+e.getMessage());
        }
    }

        public static Connection crearConexion() throws SQLException {
            Connection cn = null;
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda","root", "101599");

            return cn;
        }


}
