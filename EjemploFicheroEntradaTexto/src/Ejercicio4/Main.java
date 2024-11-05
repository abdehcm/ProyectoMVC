/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
/*Crear con un editor de texto un archivo con un conjunto de numeros reales, 
abrirlo con un flujo de texto para lectura y leerlo linea a linea. 
Convertir las cadenas leidas en numeros de tipo double por medio de scanner 
y mostrar al final la suma de todos ellos*/
public class Main {

    public static void main(String[] args) {
        BufferedReader in = null;
        double[] tabla = new double[5];

        try {
            in = new BufferedReader(new FileReader("conjuntoNumerosReales.txt"));
            Scanner s;
            double numero;
            double suma = 0;
            String linea = in.readLine();
            while (linea != null) {
                s = new Scanner(linea).useLocale(Locale.US);
                if (s.hasNextDouble()) {
                    numero = s.nextDouble();
                    suma += numero;
                }
                linea = in.readLine();
            }
            System.out.println("Suma: " + suma);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage() );
                }
            }
        }
    }
}
