/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
/*Pide por teclado el nombre, la edad y la estatura de un deportista. 
Introduce los datos en una sola linea y leelos con un objeto scanner
y muestra el resultado por pantalla*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in).useLocale(Locale.US);
        
        System.out.println("Intoduce nombre, edad y estatura del deportista: ");
        String nombre = sc.next();
        int edad = sc.nextInt();
        double estatura = sc.nextDouble();
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: "+ estatura);
    }
    
}
