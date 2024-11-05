/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicapspclase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author alumnadotarde
 */
public class TareaA {

    private String nombreArchivo;

    public TareaA(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;

    }
    
    // Método para escribir información en el archivo
    public void escribirArchivo(String contenido) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write(contenido);
            System.out.println("Contenido escrito en " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    // Método para leer el contenido del archivo
    public String leerArchivo() {
        StringBuilder contenido = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return contenido.toString();
    }

    // Método para intercambiar el contenido con TareaB
    public void intercambiarContenido(TareaB otraClase) {
        String contenidoA = this.leerArchivo();
        String contenidoB = otraClase.leerArchivo();

        this.escribirArchivo(contenidoB);
        otraClase.escribirArchivo(contenidoA);
        System.out.println("Contenido intercambiado entre " + this.nombreArchivo + " y " + otraClase.getNombreArchivo());
    }
}
