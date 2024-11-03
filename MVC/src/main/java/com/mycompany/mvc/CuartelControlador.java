/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc;

import java.io.IOException;
import javax.xml.bind.JAXBException;

/**
 *
 * @author alumnadotarde
 */
public class CuartelControlador {

    //Se toman como atributos objetos de las otras dos clases para manejarlos.
    private final CuartelModelo modelo;
    private final CuartelVista vista;

    public CuartelControlador(CuartelModelo modelo, CuartelVista vista) {

        //El constructor inicializa los valores de ambod atributos de la clase
        this.modelo = modelo;
        this.vista = vista;
    }

    // Método para iniciar el flujo de la aplicación
    public void start() throws IOException, JAXBException {

        //Generamos un bucle infinito para que el menú siga apareciendo al final de toda acción hasta que se elija salir del programa.
        while (true) {

            int seleccion = vista.mostrarMenu();

            switch (seleccion) {
                case 1:
                    modelo.mostrarContenido();
                    break;
                case 21:
                    Dragon dragon = vista.crearDragon();
                    int idDragon = dragon.getId();
                    if (modelo.comprobarDragonPorId(idDragon)) {
                        vista.mensaje("Ya existe un dragón con ese Id");
                    } else {
                        modelo.añadirDragon(dragon);
                    }
                    break;
                case 22:
                    Jinete jinete = vista.crearJinete();
                    int idJinete = jinete.getId();
                    if (modelo.comprobarJinetePorId(idJinete)) {
                        vista.mensaje("Ya existe un jinete con ese Id");
                    } else {
                        modelo.añadirJinete(jinete);
                    }
                    break;
                case 23:
                    Pareja pareja = vista.crearPareja();
                    int idParejaDragon = pareja.getIdDragon();
                    int idParejaJinete = pareja.getIdJinete();
                    if (modelo.comprobarParejaPorId(idParejaDragon, idParejaJinete)) {
                        vista.mensaje("Ya existe una pareja con ese dragón y jinete");
                    } else {
                        modelo.añadirPareja(pareja);
                    }
                    break;
                case 31:
                    vista.mensaje("¿Cuál es el id del dragón que desea eliminar?");
                    int idDragonParaEliminar = vista.getSc().nextInt();

                    if (modelo.comprobarDragonPorId(idDragonParaEliminar)) {
                        modelo.eliminarDragonPorId(idDragonParaEliminar);
                        vista.mensaje("El dragón se ha eliminado correctamente");
                    } else {
                        vista.mensaje("No existe un dragón con ese Id");
                    }
                    break;
                case 32:
                    vista.mensaje("¿Cuál es el id del jinete que desea eliminar?");
                    int idJineteParaEliminar = vista.getSc().nextInt();

                    if (modelo.comprobarJinetePorId(idJineteParaEliminar)) {
                        modelo.eliminarJinetePorId(idJineteParaEliminar);
                        vista.mensaje("El jinete se ha eliminado correctamente");
                    } else {
                        vista.mensaje("No existe un jinete con ese Id");
                    }
                    break;
                case 33:
                    vista.mensaje("¿Cuál es el id del dragón emparejado que desea eliminar?");

                    int idDragonEmparejadoParaEliminar = vista.getSc().nextInt();

                    vista.mensaje("¿Cuál es el id del jinete emparejado que desea eliminar?");

                    int idJineteEmparejadoParaEliminar = vista.getSc().nextInt();

                    if (modelo.comprobarParejaPorId(idDragonEmparejadoParaEliminar, idJineteEmparejadoParaEliminar)) {
                        modelo.eliminarParejaPorId(idDragonEmparejadoParaEliminar, idJineteEmparejadoParaEliminar);
                        vista.mensaje("La pareja se ha eliminado correctamente");
                    } else {
                        vista.mensaje("No existe una pareja con esos identificadores");
                    }
                    break;
                case 41:
                    vista.mensaje("¿Cuál es el id del dragón que desea modificar?");
                    int idDragonParaModificar = vista.getSc().nextInt();

                    if (modelo.comprobarDragonPorId(idDragonParaModificar)) {
                        Dragon dragonModificado = vista.modificarDragon(idDragonParaModificar);
                        modelo.eliminarDragonPorId(idDragonParaModificar);
                        modelo.añadirDragon(dragonModificado);

                        vista.mensaje("El dragón se ha modificado correctamente");
                    } else {
                        vista.mensaje("No existe un dragón con ese Id");
                    }
                    break;
                case 42:
                    vista.mensaje("¿Cuál es el id del jinete que desea modificar?");
                    int idJineteParaModificar = vista.getSc().nextInt();

                    if (modelo.comprobarJinetePorId(idJineteParaModificar)) {
                        Jinete jineteModificado = vista.modificarJinete(idJineteParaModificar);
                        modelo.eliminarJinetePorId(idJineteParaModificar);
                        modelo.añadirJinete(jineteModificado);

                        vista.mensaje("El jinete se ha modificado correctamente");

                    } else {
                        vista.mensaje("No existe un jinete con ese Id");
                    }
                    break;
                case 43:
                    vista.mensaje("¿Cuál es el id del dragón emparejado que desea modificar?");

                    int idDragonEmparejadoParaModificar = vista.getSc().nextInt();

                    vista.mensaje("¿Cuál es el id del jinete emparejado que desea modificar?");

                    int idJineteEmparejadoParaModificar = vista.getSc().nextInt();

                    if (modelo.comprobarParejaPorId(idDragonEmparejadoParaModificar, idJineteEmparejadoParaModificar)) {
                        Pareja parejaModificada = vista.modificarPareja(idDragonEmparejadoParaModificar, idJineteEmparejadoParaModificar);
                        modelo.eliminarParejaPorId(idDragonEmparejadoParaModificar, idJineteEmparejadoParaModificar);
                        modelo.añadirPareja(parejaModificada);

                        vista.mensaje("La pareja se ha eliminado correctamente");
                    } else {
                        vista.mensaje("No existe una pareja con esos identificadores");
                    }
                    break;
                case 44:

                    //Truco para vaciar el búfer de entrada. Estúpido Java.
                    vista.getSc().nextLine();

                    vista.mensaje("¿Cuál es el nuevo nombre del cuartel?");

                    String nuevoNombre = vista.getSc().nextLine();
                    modelo.getCuartel().setNombre(nuevoNombre);
                    Cuartel cuartelNombre = modelo.getCuartel();
                    modelo.setCuartel(cuartelNombre);
                    break;
                case 45:

                    //Truco para vaciar el búfer de entrada. Estúpido Java.
                    vista.getSc().nextLine();

                    vista.mensaje("¿Cuál es la nueva dirección del cuartel?");

                    String nuevaDireccion = vista.getSc().nextLine();
                    modelo.getCuartel().setDireccion(nuevaDireccion);
                    Cuartel cuartelDireccion = modelo.getCuartel();
                    modelo.setCuartel(cuartelDireccion);
                    break;
                case 46:

                    //Truco para vaciar el búfer de entrada. Estúpido Java.
                    vista.getSc().nextLine();

                    vista.mensaje("¿Cuál es la nueva provincia del cuartel?");

                    String nuevaProvincia = vista.getSc().nextLine();
                    modelo.getCuartel().setProvincia(nuevaProvincia);
                    Cuartel cuartelProvincia = modelo.getCuartel();
                    modelo.setCuartel(cuartelProvincia);
                    break;
                case 51:
                    vista.mensaje("Introduzca un id para saber si está asociado a alguien");

                    int idPosible = vista.getSc().nextInt();
                    String respuesta = modelo.consultarPorId(idPosible);
                    vista.mensaje(respuesta);
                    break;
                case 52:
                    vista.mensaje("Introduzca el id del dragón para saber si está emparejado");

                    int idDragonPosible = vista.getSc().nextInt();

                    vista.mensaje("Introduzca el id del jinete para saber si está emparejado");

                    int idJinetePosible = vista.getSc().nextInt();

                    if (modelo.comprobarParejaPorId(idDragonPosible, idJinetePosible)) {
                        vista.mensaje("Ambos miembros forman una pareja");
                    } else {
                        vista.mensaje("Ambos miembros no están emparejados");
                    }
                    break;
                case 53:
                    for (Dragon d : modelo.getCuartel().getDragones()) {
                        vista.mensaje(d.getNombre() + d.getApellidos());
                    }
                    break;
                case 54:
                    for (Jinete j : modelo.getCuartel().getJinetes()) {
                        vista.mensaje(j.getNombre() + j.getApellidos());
                    }
                    break;
                case 55:
                    //Truco para vaciar el búfer de entrada. Estúpido Java.
                    vista.getSc().nextLine();

                    vista.mensaje("¿Qué sexo desea consultar ('macho' o 'hembra')?");
                    String sexoConsulta = vista.getSc().nextLine().toLowerCase();

                    while (sexoConsulta.isEmpty()) {
                        vista.mensaje("Por favor, introduzca un sexo correcto");
                        sexoConsulta = vista.getSc().nextLine();
                    }

                    for (Dragon d : modelo.getCuartel().getDragones()) {

                        if (d.getSexo().toLowerCase().equals(sexoConsulta)) {
                            vista.mensaje(d.toString());
                        }
                    }
                    break;
                case 56:
                    //Truco para vaciar el búfer de entrada. Estúpido Java.
                    vista.getSc().nextLine();

                    vista.mensaje("¿Qué raza desea consultar ('aurea', 'argentea', 'zafirina o 'azabache')?");
                    String razaConsulta = vista.getSc().nextLine().toLowerCase();

                    while (razaConsulta.isEmpty() || (!(razaConsulta.equals("aureo")) || (!(razaConsulta.equals("argentea"))) || (!(razaConsulta.equals("zafirina"))) || (!(razaConsulta.equals("azabache"))))) {
                        vista.mensaje("Por favor, introduzca una raza correcta");
                        razaConsulta = vista.getSc().nextLine();
                    }

                    for (Dragon d : modelo.getCuartel().getDragones()) {
                        if (d.getRaza().toLowerCase().equals(razaConsulta)) {
                            vista.mensaje(d.toString());
                        }
                    }
                    break;
                case 57:
                    Dragon dragonAuxiliarProporciones = null;
                    double dragonMasDotado = 0;
                    for (Dragon d : modelo.getCuartel().getDragones()) {

                        double dragonCandidato = d.getAlzada() * d.getEnvergadura() * d.getLargura();

                        if (dragonCandidato > dragonMasDotado) {
                            dragonMasDotado = dragonCandidato;
                            dragonAuxiliarProporciones = d;
                        }

                    }

                    vista.mensaje("El dragón con mayores proporciones es: " + dragonAuxiliarProporciones.getNombre() + "con unas dimensiones de " + dragonMasDotado);

                    break;
                case 58:
                    double dragonMayorAlcance = 0;
                    Dragon dragonAuxiliarAlcance = null;
                    for (Dragon d : modelo.getCuartel().getDragones()) {

                        double dragonCandidato = d.getAlcanceLlamarada();

                        if (dragonCandidato > dragonMayorAlcance) {
                            dragonMayorAlcance = dragonCandidato;
                            dragonAuxiliarAlcance = d;
                        }

                    }
                    vista.mensaje("El dragón con mayor alcance de llamara es: " + dragonAuxiliarAlcance.getNombre() + "con un alcance de " + dragonMayorAlcance);

                    break;
                case 59:
                    //Truco para vaciar el búfer de entrada. Estúpido Java.
                    vista.getSc().nextLine();

                    vista.mensaje("¿Qué mano dominante desea consultar ('D' o 'I')?");
                    String manoConsulta = vista.getSc().nextLine().toUpperCase();

                    while (manoConsulta.isEmpty() || (!(manoConsulta.equals("D")) || (!(manoConsulta.equals("I"))))) {
                        vista.mensaje("Por favor, introduzca una mano dominante correcta");
                        manoConsulta = vista.getSc().nextLine();
                    }

                    for (Jinete j : modelo.getCuartel().getJinetes()) {
                        if (j.getManoDominante().toUpperCase().equals(manoConsulta)) {
                            vista.mensaje(j.toString());
                        }
                    }
                    break;
                case 510:
                    //Truco para vaciar el búfer de entrada. Estúpido Java.
                    vista.getSc().nextLine();

                    vista.mensaje("¿Qué mano dominante desea consultar ('sargento', 'capitan' o 'veterinario')");
                    String rangoConsulta = vista.getSc().nextLine().toLowerCase();

                    while (rangoConsulta.isEmpty() || (!rangoConsulta.equals("sargento") || (!rangoConsulta.equals("capitan")) || (!rangoConsulta.equals("veterinario")))) {
                        vista.mensaje("Por favor, introduzca una mano dominante correcta");
                        rangoConsulta = vista.getSc().nextLine();
                    }

                    for (Jinete j : modelo.getCuartel().getJinetes()) {
                        if (j.getRangoMilitar().equals(rangoConsulta)) {
                            vista.mensaje(j.toString());
                        }
                    }
                    break;
            }

        }

    }

}
