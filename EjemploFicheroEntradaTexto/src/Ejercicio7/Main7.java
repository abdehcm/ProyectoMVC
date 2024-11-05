/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
/*Escribe un texto en un archivo de texto linea a linea leidas de teclado
hasta que introduzca la cadena fin*/
public class Main7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("texto.txt"))) {
            String linea;

            System.out.println("Escribe líneas de texto (escribe 'fin' para terminar):");
            while (!(linea = scanner.nextLine()).equalsIgnoreCase("fin")) {
                writer.write(linea);
                writer.newLine();
            }
            System.out.println("Texto guardado en 'texto.txt'.");

        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
