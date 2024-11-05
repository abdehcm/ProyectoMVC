/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
/*Solicitar al usuario 5 numeros enteros y guardarlos en una tabla*/
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] tabla = new int[5];

        System.out.println("Introduce 5 números enteros");
        for (int i = 0; i < 5; i++) {
            tabla[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(tabla));
        System.out.println("Fin");

        /*
        String numeros = "87 9 23 1 5";
        for (int i = 0; i < 5; i++) {
            tabla[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(tabla));
        System.out.println("Fin");*/
    }

}