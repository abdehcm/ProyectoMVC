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

        while (true) {

            int seleccion = vista.mostrarMenu();

            switch (seleccion) {
                case 1:
                    modelo.mostrarContenido();
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
                    System.out.println("¿Cuál es el id del dragón que desea eliminar?");
                    int idDragonParaEliminar = vista.sc.nextInt();

                    if (modelo.comprobarDragonPorId(idDragonParaEliminar)) {
                        modelo.eliminarDragonPorId(idDragonParaEliminar);
                        vista.mensaje("El dragón se ha eliminado correctamente");
                    } else {
                        vista.mensaje("No existe un dragón con ese Id");
                    }
                    break;
                case 32:
                    System.out.println("¿Cuál es el id del jinete que desea eliminar?");
                    int idJineteParaEliminar = vista.sc.nextInt();

                    if (modelo.comprobarJinetePorId(idJineteParaEliminar)) {
                        modelo.eliminarJinetePorId(idJineteParaEliminar);
                        vista.mensaje("El jinete se ha eliminado correctamente");
                    } else {
                        vista.mensaje("No existe un jinete con ese Id");
                    }
                    break;
                case 33:
                    System.out.println("¿Cuál es el id del dragón emparejado que desea eliminar?");

                    int idDragonEmparejadoParaEliminar = vista.sc.nextInt();

                    System.out.println("¿Cuál es el id del jinete emparejado que desea eliminar?");

                    int idJineteEmparejadoParaEliminar = vista.sc.nextInt();

                    if (modelo.comprobarParejaPorId(idDragonEmparejadoParaEliminar, idJineteEmparejadoParaEliminar)) {
                        modelo.eliminarParejaPorId(idDragonEmparejadoParaEliminar, idJineteEmparejadoParaEliminar);
                        vista.mensaje("La pareja se ha eliminado correctamente");
                    } else {
                        vista.mensaje("No existe una pareja con esos identificadores");
                    }
                    break;
            }

        }

        /*

    public void opcionAñadirDragon() throws JAXBException, IOException {
        
        Dragon dragon = CuartelVista.crearDragon();
        
        ArrayList<Integer> idDeDragones = CuartelModelo.idDeDragones();
        
        for (int id : idDeDragones) {
                if (CuartelModelo.comprobarDragonPorId(id)) {
                    System.out.println("El dragón ya existe");
                }
            }

         */
    }

}
