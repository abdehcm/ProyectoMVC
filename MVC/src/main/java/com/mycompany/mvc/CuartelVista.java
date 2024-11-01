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

    static Jinete crearJinete() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el Id del nuevo jinete: ");
        int id = sc.nextInt();
        System.out.println("Introduzca el nombre del nuevo jinete: ");
        String nombre = sc.nextLine();
        System.out.println("Introduzca los apellidos del nuevo jinete: ");
        String apellidos = sc.nextLine();
        System.out.println("Introduzca el sexo del nuevo jinete: ");
        String sexo = sc.nextLine();
        System.out.println("Introduzca la fecha de nacimiento del nuevo jinete: ");
        String fechaNacimiento = sc.nextLine();
        System.out.println("Introduzca la fecha de incorporación del nuevo jinete: ");
        String fechaIncorporacion = sc.nextLine();
        System.out.println("Introduzca la mano dominante del nuevo jinete: ");
        String manoDominante = sc.nextLine();
        System.out.println("Introduzca el rango militar del nuevo jinete: ");
        String rangoMilitar = sc.nextLine();
        System.out.println("Introduzca la ocupación del nuevo jinete: ");
        String ocupacion = sc.nextLine();
        System.out.println("Introduzca la altura del nuevo jinete: ");
        double altura = sc.nextDouble();

        Jinete jinete = new Jinete(id, nombre, apellidos, sexo, fechaNacimiento, fechaIncorporacion, manoDominante, rangoMilitar, ocupacion, altura);

        return jinete;

    }

    static Pareja crearPareja() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el Id del dragón: ");
        int idDragon = sc.nextInt();
        System.out.println("Introduzca el Id del jinete: ");
        int idJinete = sc.nextInt();
        System.out.println("Introduzca la fecha de inicio de la pareja: ");
        String fechaInicio = sc.nextLine();
        System.out.println("Introduzca la fecha de fin de la pareja: ");
        String fechaFin = sc.nextLine();

        Pareja pareja = new Pareja(idDragon, idJinete, fechaInicio, fechaFin);

        return pareja;

    }

}
