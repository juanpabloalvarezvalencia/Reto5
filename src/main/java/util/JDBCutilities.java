package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import java.sql.Statement;
//import java.sql.ResultSet;

public class JDBCutilities {
    
    public final static String UBICACION_BD ="c:/reto4/ProyectosConstruccion.db";
    //public final static String UBICACION_BD ="ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException
    {
        String url = "jdbc:sqlite:" + UBICACION_BD;
        return DriverManager.getConnection(url);
    }
}
