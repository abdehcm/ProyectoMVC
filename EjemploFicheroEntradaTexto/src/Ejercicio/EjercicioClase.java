/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author alu_tarde
 */
public class EjercicioClase {

    public static void main(String[] args) {
        FileReader inFile = null;
        BufferedReader inBufferFile = null;
        String texto = "";
        double numreal;
        double suma = 0;
        double media;

        try {
            inBufferFile = new BufferedReader(new FileReader("numerosReales.txt"));

            texto = inBufferFile.readLine();
            System.out.println(texto);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {

            try {

                if (inBufferFile != null) {
                    inBufferFile.close();
                }

            } catch (IOException e2) {
                System.out.println(e2.getMessage());
            }

        }

        String[] texto2 = texto.split(" ");

        for (int i = 0; i < texto2.length; i++) {
            numreal = Double.parseDouble(texto2[i]);
            suma = suma + numreal;
        }

        media = suma / texto2.length;

        System.out.println("La suma es: " + suma);
        System.out.println("La media es: " + media);

    }

}
