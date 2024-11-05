/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploaccesoadatos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abdelhachim
 */
public class EjemploAccesoaDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static void escribir(File f, String linea) {

        try {
            FileWriter fw = new FileWriter(f, true);
            PrintWriter pw = new PrintWriter(fw, true);

            pw.write(linea);

            pw.flush();
            pw.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void leer(File f) {
        try {
            FileReader fr = new FileReader(f);
            int car = fr.read();

            while (car != -1) {
                System.out.println((char) car);
                car = fr.read();

                fr.close();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
