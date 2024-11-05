/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenconexionbbdd1;

import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abdelhachim
 */
public class ExamenConexionBBDD1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection con;
        String url = "jdbc:mysql://localhost/EmpresaDAM";

        try {
            con = DriverManager.getConnection(url, "root", "1234");

            String sql = "SELECT * FROM empleados";

            Statement sentencia = con.createStatement();

            ResultSet rs = sentencia.executeQuery(sql);

            while (rs.next()) {
                int numEmp = rs.getInt("numEmp");
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");
                int oficina = rs.getInt("oficina");
                String puesto = rs.getString("puesto");

                System.out.println("Empleado: "
                        + numEmp + ", "
                        + nombre + ", "
                        + edad + ", "
                        + oficina + ", "
                        + puesto);
            }

            System.out.println("\nEdad inferior: ");
            int edadINF = new Scanner(System.in).nextInt();

            System.out.println("Edad superior: ");
            int edadSUP = new Scanner(System.in).nextInt();
            
            muestraEmpleadosXEdad(edadINF, edadSUP, con);

            con.close();

        } catch (SQLException ex) {
            System.out.println("ERROR al consultar empleados.");
        }
    }

    private static void muestraEmpleadosXEdad(int min, int max, Connection con) {
        String sql = "SELECT nombre, edad FROM empleados WHERE edad BETWEEN ? AND ?";

        try {
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, min);
            sentencia.setInt(2, max);

            ResultSet rs = sentencia.executeQuery();

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");

                System.out.println("Empleado: " + nombre + ", " + edad + " años");
            }

        } catch (SQLException ex) {
            System.out.println("ERROR al consultar empleado.");
        }

    }

}
