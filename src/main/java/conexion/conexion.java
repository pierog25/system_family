/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author PIERO
 */
public class conexion {
    private static final String db_url = "jdbc:mysql://localhost:3308/bd_system";
    private static final String db_user = "root";
    private static final String db_password = "";
    private static final String db_driver = "com.mysql.cj.jdbc.Driver";
    private static Connection cn;
    
    public static Connection openConnection() {
        try {
            Class.forName(db_driver);
            cn = DriverManager.getConnection(db_url, db_user, db_password);
            System.out.println("Conectado");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No conectado");
        }
        return cn;
    }
    public static void closeRs(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }
    public static void closeStm(PreparedStatement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }
    public static void closeConn(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }
    
}
