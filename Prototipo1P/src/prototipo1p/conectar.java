/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipo1p;

/**
 *
 * @author Alejandro
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conectar {
    Connection conectar = null;

    public Connection conexion() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/serie3Parcial", "root", "");


        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion de la base de datos");
        } catch (ClassNotFoundException ex) {
        }
        return conectar;
    }
}
