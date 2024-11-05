/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenconexionbbdd2;

/**
 *
 * @author abdelhachim
 */
import java.sql.*;

public class EmpleadoDAO {

    Connection con;

    EmpleadoDAO() {
        con = conecta();
    }

    private Connection conecta() {
        Connection con = null;

        String url = "jdbc:mysql://localhost/EmpresaDAM";
        try {
            con = DriverManager.getConnection(url, "root", "1234");
        } catch (SQLException ex) {
            System.out.println("Error al conectar al SGBD.");
        }

        return con;
    }

    public void desconectar() {

        try {
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error al desconectar del SGBD.");
        }
    }

    public void create(Empleado empleado) {
        if (empleado != null) {
            String sql = "INSERT INTO empleados (numEmp, nombre, edad, oficina, puesto, contrato) "
                    + "VALUES ( ?, ?, ?, ?, ?, ?)";

            try {
                PreparedStatement sentencia = con.prepareStatement(sql);
                sentencia.setInt(1, empleado.getNumEmp());
                sentencia.setString(2, empleado.getNombre());
                sentencia.setInt(3, empleado.getEdad());
                sentencia.setDouble(4, empleado.getOficina());
                sentencia.setString(5, empleado.getPuesto());
                sentencia.setDate(6, empleado.getContrato());

                sentencia.executeUpdate();
            } catch (SQLException ex) {
                System.out.println("Error al insertar un empleado.");
            }
        }
    }

    public Empleado read(int numEmp) {
        Empleado empleado = null;
        String sql = "SELECT *"
                + "FROM empleados "
                + "WHERE numEmp = ?";
        try {
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, numEmp);

            ResultSet rs = sentencia.executeQuery();

            if (rs.next()) {
                empleado = new Empleado(numEmp,
                        rs.getString("nombre"),
                        rs.getInt("edad"),
                        rs.getInt("oficina"),
                        rs.getString("puesto"),
                        rs.getDate("contrato"));
            }
        } catch (SQLException ex) {
            System.out.println("Error al consultar un alumno.");
        }

        return empleado;
    }

    public void update(Empleado empleado) {
        if (empleado != null) {
            String sql = "UPDATE empleados "
                    + "SET nombre=?, edad=?, oficina=?, puesto=?, contrato =? "
                    + "WHERE numEmp = ?";
            try {
                PreparedStatement sentencia = con.prepareStatement(sql);

                sentencia.setString(1, empleado.getNombre());
                sentencia.setInt(2, empleado.getEdad());
                sentencia.setInt(3, empleado.getOficina());
                sentencia.setString(4, empleado.getPuesto());
                sentencia.setDate(5, empleado.getContrato());

                sentencia.executeUpdate();
            } catch (SQLException ex) {
                System.out.println("Error al actualizar un empleado.");
            }
        }
    }

    public void delete(int numEmp) {
        String sql = "DELETE FROM empleados "
                + "WHERE numEmp = ?";
        try {
            PreparedStatement sentencia = con.prepareStatement(sql);

            sentencia.setInt(1, numEmp);

            sentencia.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar un empleado.");
        }
    }

}
