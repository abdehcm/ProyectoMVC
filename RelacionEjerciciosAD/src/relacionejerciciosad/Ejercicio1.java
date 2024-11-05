/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacionejerciciosad;

/**
 *
 * @author alumnadotarde
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ejercicio1 {

    /**
     * @param args the command line arguments // TODO code application logic
     *
     */
    private static final String URL = "jdbc:mysql://localhost:3306/tienda";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "1234";
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            Ejercicio1 db = new Ejercicio1();
            System.out.println("Elige una opción:");
            System.out.println("1. Insertar cliente");
            System.out.println("2. Actualizar cliente");
            System.out.println("3. Borrar cliente");
            System.out.println("4. Salir");
            System.out.println("");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    db.insertarCliente();
                    break;
                case 2:
                    db.actualizarCliente();
                    break;
                case 3:
                    db.eliminarCliente();
                    break;
                case 4:
                    System.out.println("Saliendo");
                    return;
                default:
                    throw new AssertionError();
            }
        }

    }

    public void insertarCliente() {
        System.out.println("Introduce la contraseña");
        String password = sc.nextLine();
        System.out.println("Introduce el usuario");
        String usuario = sc.nextLine();
        System.out.println("Introduce la dirección");
        String direccion = sc.nextLine();
        System.out.println("Introduce el teléfono");
        String telefono = sc.nextLine();

        try (Connection connection = DriverManager.getConnection(URL, USUARIO, PASSWORD)) {
            //Insertar cliente
            String sql = "INSERT INTO clientes (password, usuario, direccion, telefono) VALUES (?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {

                statement.setString(1, password);
                statement.setString(2, usuario);
                statement.setString(3, direccion);
                statement.setString(4, telefono);

                int comprobar = statement.executeUpdate();

                if (comprobar > 0) {
                    System.out.println("Insertado correctamente\n");
                } else {
                    System.out.println("Cliente no insertado\n");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void actualizarCliente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el usuario");
        String usuario = sc.nextLine();
        System.out.println("Introduce la nueva contraseña");
        String nPassword = sc.nextLine();
        System.out.println("Introduce la nueva dirección");
        String nDireccion = sc.nextLine();
        System.out.println("Introduce el nuevo teléfono");
        String nTelefono = sc.nextLine();

        try (Connection connection = DriverManager.getConnection(URL, USUARIO, PASSWORD)) {
            //Insertar cliente
            String sql = "UPDATE  clientes SET password = ?, direccion = ?, telefono = ? WHERE usuario = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {

                statement.setString(1, nPassword);
                statement.setString(2, nDireccion);
                statement.setString(3, nTelefono);
                statement.setString(4, usuario);

                statement.executeUpdate();
                int comprobar = statement.executeUpdate();

                if (comprobar > 0) {
                    System.out.println("Actualizado correctamente\n");
                } else {
                    System.out.println("Cliente no actualizado\n");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void eliminarCliente() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el usuario");
        String usuario = sc.nextLine();

        try (Connection connection = DriverManager.getConnection(URL, USUARIO, PASSWORD)) {
            String sql = "DELETE FROM clientes WHERE usuario = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {

                statement.setString(1, usuario);
                int comprobar = statement.executeUpdate();

                if (comprobar > 0) {
                    System.out.println("Eliminado correctamente\n");
                } else {
                    System.out.println("Cliente no eliminado\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


