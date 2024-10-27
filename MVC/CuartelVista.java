/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc;

import java.util.Scanner;

/**
 *
 * @author alumnadotarde
 */
public class CuartelVista {

    static Dragon crearDragon() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el Id del nuevo dragón: ");
        int id = sc.nextInt();
        System.out.println("Introduzca el nombre del nuevo dragón: ");
        String nombre = sc.nextLine();
        System.out.println("Introduzca los apellidos del nuevo dragón: ");
        String apellidos = sc.nextLine();
        System.out.println("Introduzca el sexo del nuevo dragón: ");
        String sexo = sc.nextLine();
        System.out.println("Introduzca la raza del nuevo dragón: ");
        String raza = sc.nextLine();
        System.out.println("Introduzca la fecha de eclosión del nuevo dragón: ");
        String fechaEclosion = sc.nextLine();
        System.out.println("Introduzca la fecha de incorporación del nuevo dragón: ");
        String fechaIncorporacion = sc.nextLine();
        System.out.println("Introduzca la alzada del nuevo dragón: ");
        double alzada = sc.nextDouble();
        System.out.println("Introduzca la largura del nuevo dragón: ");
        double largura = sc.nextDouble();
        System.out.println("Introduzca la envergadura del nuevo dragón: ");
        double envergadura = sc.nextDouble();
        System.out.println("Introduzca el alcance de llamarada del nuevo dragón: ");
        double alcanceLlamarada = sc.nextDouble();
        

        Dragon dragon = new Dragon(id, nombre, apellidos, sexo, raza, fechaEclosion, fechaIncorporacion, alzada, largura, envergadura, alcanceLlamarada);
        
        return dragon;
        
    }

}
