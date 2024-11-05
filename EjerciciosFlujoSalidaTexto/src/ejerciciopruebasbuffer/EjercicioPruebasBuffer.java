/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopruebasbuffer;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author artur
 */
public class EjercicioPruebasBuffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        try (BufferedWriter outEdad = new BufferedWriter(new FileWriter("edades.txt"))){
            FileReader in = new FileReader("Prueba.txt");
            Scanner s = new Scanner(in).useLocale(Locale.US);
            int edad;
            double peso, estatura;
            //Deportista dep[] = new Deportista[3];

            while (s.hasNext()) {
                String nombre = s.next();
                edad = s.nextInt();
                peso = s.nextDouble();
                estatura = s.nextDouble();
                Deportistas d1 = new Deportistas(nombre, edad, peso, estatura);
                System.out.println(d1.toString());

                outEdad.write(nombre + "\t" + edad);
                outEdad.newLine();

            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
