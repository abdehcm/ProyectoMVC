/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebabbddenmac;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abdelhachim
 */
public class PruebaBBDDenMAC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Connection con;
        Statement sentencia;
        String sql, sql2;
        String url = "jdbc:mysql://localhost/instituto1DAM";
        //ResultSet rs;
        int numero = 2;
        String nombre = "Foad";
        String curso = "1DAM";
        double media = 6.5;
        String fechaNac = "2004-06-06";

        try {
            //.executeUpdate(sql) --> 
            con = DriverManager.getConnection(url, "root", "1234");
            sql = "INSERT INTO alumnos(num, nombre, media, curso, fnac) VALUES (" + numero + ",'" + nombre + "'," + media + ",'" + curso + "','" + fechaNac + "')";
            sql2 = "DELETE FROM alumnos WHERE num = " + 3;
            sentencia = con.createStatement();
            sentencia.executeUpdate(sql);
            sentencia.executeUpdate(sql2);
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(PruebaBBDDenMAC.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR");
        }

    }

}
