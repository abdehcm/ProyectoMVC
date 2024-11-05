/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

import java.io.BufferedReader;

/**
 *
 * @author alu_tarde
 */
/*crea un editor de texto de fichero jugadores.txt y escribe en el los nombres edades y 
estaturas de los jugadores de un equipo
con un jugador en cada linea. Implementa un programa que lea del fichero los datos,
muestre los nombre y calcule la media de la edad y estatura*/
import java.io.*;

public class Main5 {

    public static void main(String[] args) {
        try {
            // Escritura de datos de jugadores en el archivo jugadores.txt
            BufferedWriter writer = new BufferedWriter(new FileWriter("jugadores.txt"));
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int totalJugadores;

            System.out.print("Ingrese el número de jugadores: ");
            totalJugadores = Integer.parseInt(reader.readLine());

            for (int i = 0; i < totalJugadores; i++) {
                System.out.println("Ingrese los datos del jugador " + (i + 1) + ":");
                System.out.print("Nombre: ");
                String nombre = reader.readLine();
                System.out.print("Edad: ");
                int edad = Integer.parseInt(reader.readLine());
                System.out.print("Estatura: ");
                double estatura = Double.parseDouble(reader.readLine());

                // Escribir los datos en el archivo
                writer.write(nombre + "," + edad + "," + estatura);
                writer.newLine();
            }

            System.out.println("Datos de los jugadores");
            writer.close();

            reader = new BufferedReader(new FileReader("jugadores.txt"));
            String linea;
            int sumaEdad = 0;
            double sumaEstatura = 0.0;

            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                String nombre = datos[0];
                int edad = Integer.parseInt(datos[1]);
                double estatura = Double.parseDouble(datos[2]);

                System.out.println("Nombre: " + nombre);

                sumaEdad += edad;
                sumaEstatura += estatura;
            }

            double mediaEdad = (double) sumaEdad / totalJugadores;
            double mediaEstatura = sumaEstatura / totalJugadores;

            System.out.println("\nMedia de edad: " + mediaEdad);
            System.out.println("Media de estatura: " + mediaEstatura);

            reader.close();

        } catch (IOException e) {
            System.err.println("Error de E/S: " + e.getMessage());
        }
    }
}
