package org.sebastian.java.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDatos {

    private static String url = "jdbc:mysql://localhost:3306/java_curso?ServerTimezone=UTC";
    private static String user = "root";
    private static String password = "";
    private static Connection connection;

    public static Connection getInstance() throws SQLException {
        if(connection == null){
            connection = DriverManager.getConnection(url, user, password);
        }
        return connection;
    }
}
