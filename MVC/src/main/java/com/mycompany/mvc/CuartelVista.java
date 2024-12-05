/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.xml.bind.JAXBException;

/**
 *
 * @author alumnadotarde
 */
public class CuartelVista {

    //Añadimos un Scanner como atributo de la clase para facilitar su manejo en los métodos.
    private Scanner sc;

    public CuartelVista() {
        this.sc = new Scanner(System.in);
    }

    public Scanner getSc() {
        return sc;
    }

    public int mostrarMenu() throws JAXBException, InputMismatchException {
        
        //Menú pricipal del programa, con todas las opciones disponibles.
        //Cada operación que requiere un intercambio de variables va al controlador con un código de retorno

        System.out.println("Seleccione una opción:"
                + "\n(1) Mostrar el contenido del XML"
                + "\n(2) Añadir un nuevo elemento"
                + "\n(3) Eliminar un elemento"
                + "\n(4) Modificar un elemento"
                + "\n(5) Realizar un consulta"
                + "\n(6) Salir del programa");

        int id = sc.nextInt();

        switch (id) {
            case 1:
                return 1;
            case 2:
                System.out.println("¿Qué desea añadir?"
                        + "\n(1) Añadir un dragón"
                        + "\n(2) Añadir un jinete"
                        + "\n(3) Añadir una pareja");
                id = sc.nextInt();
                switch (id) {
                    case 1:
                        return 21;
                    case 2:
                        return 22;
                    case 3:
                        return 23;
                    default:
                        mostrarMenu();
                }
            case 3:
                System.out.println("¿Qué desea eliminar?"
                        + "\n(1) Eliminar un dragón"
                        + "\n(2) Eliminar un jinete"
                        + "\n(3) Eliminar una pareja");
                id = sc.nextInt();
                switch (id) {
                    case 1:
                        return 31;
                    case 2:
                        return 32;
                    case 3:
                        return 33;
                    default:
                        mostrarMenu();
                }
            case 4:
                System.out.println("¿Qué desea modificar?"
                        + "\n(1) Modificar un dragón"
                        + "\n(2) Modificar un jinete"
                        + "\n(3) Modificar una pareja"
                        + "\n(4) Modificar el nombre del cuartel"
                        + "\n(5) Modificar la dirección del cuartel"
                        + "\n(6) Modificar la provincia del cuartel");
                id = sc.nextInt();
                switch (id) {
                    case 1:
                        return 41;
                    case 2:
                        return 42;
                    case 3:
                        return 43;
                    case 4:
                        return 44;
                    case 5:
                        return 45;
                    case 6:
                        return 46;
                    default:
                        mostrarMenu();
                }
            case 5:
                System.out.println("¿Qué desea consultar?"
                        + "\n(1) Consultar si existe un dragón o jinete"
                        + "\n(2) Consultar si un dragón o jinete están emparejados"
                        + "\n(3) Consultar nombres y apellidos de los dragones"
                        + "\n(4) Consultar nombres y apellidos de los jinetes"
                        + "\n(5) Consultar dragones por sexo"
                        + "\n(6) Consultar dragones por raza"
                        + "\n(7) Consultar dragón con mayores proporciones (alzada x largura x envergadura)"
                        + "\n(8) Consultar dragón con mayor alcalce de llamarada"
                        + "\n(9) Consultar jinetes por su mano dominante"
                        + "\n(10) Consultar jinetes por su rango militar");
                id = sc.nextInt();
                switch (id) {
                    case 1:
                        return 51;
                    case 2:
                        return 52;
                    case 3:
                        return 53;
                    case 4:
                        return 54;
                    case 5:
                        return 55;
                    case 6:
                        return 56;
                    case 7:
                        return 57;
                    case 8:
                        return 58;
                    case 9:
                        return 59;
                    case 10:
                        return 510;
                    default:
                        mostrarMenu();
                }

            case 6:
                System.out.println("El programa ha terminado");
                System.exit(0);
            default:
                mostrarMenu();
        }
        return id;
    }

    public void mensaje(String texto) {
        System.out.println(texto);
    }

    public Dragon crearDragon() {

        System.out.println("Introduzca el Id del nuevo dragón: ");
        int id = sc.nextInt();
        System.out.println("Introduzca el nombre del nuevo dragón: ");
        String nombre = sc.nextLine();
        sc.nextLine();
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

    public Jinete crearJinete() {

        System.out.println("Introduzca el Id del nuevo jinete: ");
        int id = sc.nextInt();
        System.out.println("Introduzca el nombre del nuevo jinete: ");
        String nombre = sc.nextLine();
        sc.nextLine();
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

    public Pareja crearPareja() {

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

    public Dragon modificarDragon(int id) {

        System.out.println("Introduzca el nombre del nuevo dragón: ");
        String nombre = sc.nextLine();
        sc.nextLine();

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

    public Jinete modificarJinete(int id) {

        System.out.println("Introduzca el nombre del nuevo jinete: ");
        String nombre = sc.nextLine();
        sc.nextLine();

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

    public Pareja modificarPareja(int idDragon, int idJinete) {

        System.out.println("Introduzca el Id del dragón: ");
        idDragon = sc.nextInt();
        System.out.println("Introduzca el Id del jinete: ");
        idJinete = sc.nextInt();
        System.out.println("Introduzca la fecha de inicio de la pareja: ");
        String fechaInicio = sc.nextLine();
        System.out.println("Introduzca la fecha de fin de la pareja: ");
        String fechaFin = sc.nextLine();

        Pareja pareja = new Pareja(idDragon, idJinete, fechaInicio, fechaFin);

        return pareja;

    }
}
