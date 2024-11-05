/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenconexionbbdd2;

import java.sql.Date;
import java.util.Scanner;

/**
 *
 * @author abdelhachim
 */
public class ExamenConexionBBDD2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        EmpleadoDAO dao = new EmpleadoDAO();

        System.out.println("Numero empleado: ");
        int numEmp = sc.nextInt();

        Empleado empleado = dao.read(numEmp);

        if (empleado != null) {
            System.out.println("Este empleado ya existe en la BD.");
            System.out.println(empleado);
        } else {
            System.out.println("Introduce el resto de datos");
            System.out.println("Nombre empleado: ");
            String nombre = sc.next();

            System.out.println("Edad empleado: ");
            int edad = sc.nextInt();

            System.out.println("Oficina empleado: ");
            int oficina = sc.nextInt();

            System.out.println("Puesto empleado: ");
            String puesto = sc.next();
            
            System.out.println("Fecha Contrato: ");
            String contrato = sc.next();
            
            empleado = new Empleado(numEmp, nombre, edad, oficina, puesto, Date.valueOf(contrato));
            
            dao.create(empleado);
        }
        
        System.out.println("Introduzca el número para el cambio de oficina: ");
        System.out.println("Numero empleado: ");
        numEmp = sc.nextInt();
        
        System.out.println("Oficina destino: ");
        int numOf = sc.nextInt();
        
        empleado = dao.read(numEmp);
        
        if (empleado != null) {
            empleado.setOficina(numOf);
            dao.update(empleado);
        }else{
            System.out.println("El número de empleado no existe.");
        }
        
        System.out.println("Numero de empleado a borrar");
        System.out.println("Numero empleado: ");
        numEmp = sc.nextInt();
        
        dao.delete(numEmp);
        
        dao.desconectar();

    }

}
