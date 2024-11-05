/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author alu_tarde
 */
/*FileWriter(String nombreArchivo) -> pisa lo que esta
  FileWriter(String nombreArchivo, boolean append) -> para escribir sobre lo que esta
  BufferedWriter
    -> void write (int caracter)
    -> void write (String cad)
    -> void newLine()
    -> void flush --> forzar vaciado de buffer
    -> void close()*/

 /*Vamos a guardar primera linea caracter a caracter, la segunda sentencia a sentencia-*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("textoEjercicio6.txt"))) {
            
            // Carácter por carácter
            System.out.println("Ingresa la primera línea carácter por carácter:");
            String primeraLinea = scanner.nextLine();
            for (char c : primeraLinea.toCharArray()) {
                writer.write(c);
            }
            writer.newLine();
            
            //Sentencia por sentencia
            System.out.println("Ingresa la segunda línea sentencia por sentencia. Escribe 'fin' para terminar:");
            String sentencia;
            while (!(sentencia = scanner.nextLine()).equalsIgnoreCase("fin")) {
                writer.write(sentencia);
                writer.newLine();
            }
            
            System.out.println("Texto guardado en 'textoEjercicio6.txt'.");
            
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}

