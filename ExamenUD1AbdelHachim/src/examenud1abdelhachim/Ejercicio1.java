/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenud1abdelhachim;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author alumnadotarde
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            cifradoCesar("/home/alumnadotarde/NetBeansProjects/ExamenUD1AbdelHachim","mensajeCifrado.txt", 5);
            System.out.println("Se ha cifrado correctamente");
        }catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public static void cifradoCesar(String directorio, String nomArch, int n) {
        String mensajeOriginal = "";

        try (BufferedReader br = new BufferedReader(new FileReader("mensaje.txt"))) {
            StringBuilder sb = new StringBuilder();
            String linea;
            while ((linea = br.readLine()) != null) {
                sb.append(linea).append("\n");
            }
            mensajeOriginal = sb.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }

        StringBuilder mensajeCifrado = new StringBuilder();

        for (char charActual : mensajeOriginal.toCharArray()) {
            if (Character.isLetter(charActual)) {
                char base = Character.isUpperCase(charActual) ? 'A' : 'a';
                char nuevaLetra = (char) ((charActual - base + n) % 26 + base);
                mensajeCifrado.append(nuevaLetra);
            } else {
                mensajeCifrado.append(charActual);
            }
        }
        

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(directorio + "/" + nomArch))) {
            bw.write(mensajeCifrado.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
