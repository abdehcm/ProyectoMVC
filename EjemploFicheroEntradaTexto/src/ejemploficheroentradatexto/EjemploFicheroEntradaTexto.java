/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploficheroentradatexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alu_tarde
 */
public class EjemploFicheroEntradaTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int c;
        String texto = "";
        FileReader in = null;
        BufferedReader inBuffer = null;

        try {
           // in = new FileReader("\home\alu_tarde\NetBeansProject");
            inBuffer = new BufferedReader(in);
            c = (char) in.read();
            while (c != -1) {
                texto = texto + (char) c;
                c = in.read();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error: fichero no encontrado");
        } catch (IOException ex) {
            System.out.println("Error de lectura");
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
      //  BufferedReader in2 = new BufferedReader(new FileReader("\home\textoAbdel"));
        System.out.println(texto);
    }

}
/*Crear con un editor el fichero de textos numerosReales.txt lo creamos en la carpeta 
de Netbeanas actual y escribir en el fichero una serie de numero reales separados por espacios simples
Implementar un programa que accedea a numeroreales.txx , lee los numeros y calcule la suma y la media
aritmetica mostrando los resultados por pantalla*/
