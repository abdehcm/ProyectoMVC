/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author alumnadotarde
 */
public class CuartelModelo {

    public static Cuartel leerXML() throws JAXBException {

        File f = new File("escuadrones.xml");

        JAXBContext context = JAXBContext.newInstance(Cuartel.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        Cuartel cuartel = (Cuartel) unmarshaller.unmarshal(f);

        return cuartel;

    }

    public void mostrarContenido() throws JAXBException {

        Cuartel cuartel = leerXML();

        ArrayList<Dragon> listaDragones = cuartel.getDragones();
        ArrayList<Jinete> listaJinetes = cuartel.getJinetes();
        ArrayList<Pareja> listaParejas = cuartel.getParejas();

        System.out.println("<cuartel>");
        System.out.println("\t<nombre>" + cuartel.getNombre() + "</nombre>");
        System.out.println("\t<direccion>" + cuartel.getDireccion() + "</direccion>");
        System.out.println("\t<provincia>" + cuartel.getProvincia() + "</provincia>");

        System.out.println("\t<dragones>");

        for (Dragon d : listaDragones) {
            System.out.print(d.toString());
        }

        System.out.println("\t</dragones>");
        System.out.println("\t<jinetes>");

        for (Jinete j : listaJinetes) {
            System.out.print(j.toString());
        }

        System.out.println("\t</jinetes>");
        System.out.println("\t<parejas>");

        for (Pareja p : listaParejas) {
            System.out.print(p.toString());
        }
        System.out.println("\t</parejas>");
        System.out.println("</cuartel>");

    }

    public void añadirDragon(Dragon dragon) throws JAXBException, IOException {

        Cuartel cuartel = leerXML();

        // Se crea una nueva lista que contiene la información previa
        ArrayList<Dragon> listaDragones = cuartel.getDragones();

        listaDragones.add(dragon);

        // Actualizamos la lista de dragones al introducir como parámetro la nueva lista con el elemento nuevo:
        cuartel.setDragones(listaDragones);

        actualizarArchivo(cuartel);

    }

    public void añadirJinete(Jinete jinete) throws JAXBException, IOException {

        Cuartel cuartel = leerXML();

        // Se crea una nueva lista que contiene la información previa
        ArrayList<Jinete> listaJinetes = cuartel.getJinetes();

        listaJinetes.add(jinete);

        // Actualizamos la lista de jinetes al introducir como parámetro la nueva lista con el elemento nuevo:
        cuartel.setJinetes(listaJinetes);

        actualizarArchivo(cuartel);

    }

    public void añadirPareja(Pareja pareja) throws JAXBException, IOException {

        Cuartel cuartel = leerXML();

        // Se crea una nueva lista que contiene la información previa
        ArrayList<Pareja> listaParejas = cuartel.getParejas();

        listaParejas.add(pareja);

        // Actualizamos la lista de parejas al introducir como parámetro la nueva lista con el elemento nuevo:
        cuartel.setParejas(listaParejas);

        actualizarArchivo(cuartel);

    }
    
    public ArrayList<Integer> idDeDragones() throws JAXBException, IOException {

        Cuartel cuartel = leerXML();

        // Se crea una nueva lista que contiene la información previa
        ArrayList<Dragon> listaDragones = cuartel.getDragones();
        ArrayList<Integer> idDeDragones = null;
        

        for (Dragon d : listaDragones) {
            idDeDragones.add(d.getId());

            }
        return idDeDragones;

    }


    public boolean comprobarDragonPorId(int id) throws JAXBException, IOException {

        Cuartel cuartel = leerXML();

        // Se crea una nueva lista que contiene la información previa
        ArrayList<Dragon> listaDragones = cuartel.getDragones();

        boolean resultado = false;

        for (Dragon d : listaDragones) {
            if (d.id == id) {
                resultado = true;
            }
        }

        return resultado;

    }

    public boolean comprobarJinetePorId(int id) throws JAXBException, IOException {

        Cuartel cuartel = leerXML();

        // Se crea una nueva lista que contiene la información previa
        ArrayList<Jinete> listaJinetes = cuartel.getJinetes();

        boolean resultado = false;

        for (Jinete j : listaJinetes) {
            if (j.id == id) {
                resultado = true;
            }
        }

        return resultado;

    }

    public boolean comprobarParejaPorId(int idDragon, int idJinete) throws JAXBException, IOException {

        Cuartel cuartel = leerXML();

        // Se crea una nueva lista que contiene la información previa
        ArrayList<Pareja> listaParejas = cuartel.getParejas();

        boolean resultado = false;

        for (Pareja p : listaParejas) {
            if ((p.idDragon == idDragon) && (p.idJinete == idJinete)) {
                resultado = true;
            }
        }

        return resultado;

    }

    public void eliminarDragonPorId(int id) throws JAXBException, IOException {

        Cuartel cuartel = leerXML();

        // Se crea una nueva lista que contiene la información previa
        ArrayList<Dragon> listaDragones = cuartel.getDragones();

        boolean resultado = false;

        for (Dragon d : listaDragones) {
            if (d.id == id) {
                listaDragones.remove(d);
                resultado = true;
            }
        }

        if (resultado) {
            System.out.println("El dragón se ha eliminado con éxito.");
        } else {
            System.out.println("No se encuentra un dragón con ese Id.");
        }

        // Actualizamos la lista de dragones al introducir como parámetro la nueva lista con el elemento nuevo:
        cuartel.setDragones(listaDragones);

        actualizarArchivo(cuartel);

    }

    public void eliminarJinetePorId(int id) throws JAXBException, IOException {

        Cuartel cuartel = leerXML();

        // Se crea una nueva lista que contiene la información previa
        ArrayList<Jinete> listaJinetes = cuartel.getJinetes();

        boolean resultado = false;

        for (Jinete j : listaJinetes) {
            if (j.id == id) {
                listaJinetes.remove(j);
                resultado = true;
            }
        }

        if (resultado) {
            System.out.println("El jinete se ha eliminado con éxito.");
        } else {
            System.out.println("No se encuentra un jinete con ese Id.");
        }

        // Actualizamos la lista de jinetes al introducir como parámetro la nueva lista con el elemento nuevo:
        cuartel.setJinetes(listaJinetes);

        actualizarArchivo(cuartel);

    }

    public void eliminarParejaPorId(int idDragon, int idJinete) throws JAXBException, IOException {

        Cuartel cuartel = leerXML();

        // Se crea una nueva lista que contiene la información previa
        ArrayList<Pareja> listaParejas = cuartel.getParejas();

        boolean resultado = false;

        for (Pareja p : listaParejas) {
            if ((p.idDragon == idDragon) && (p.idJinete == idJinete)) {
                listaParejas.remove(p);
                resultado = true;
            }
        }

        if (resultado) {
            System.out.println("La pareja se ha eliminado con éxito.");
        } else {
            System.out.println("No se encuentra una pareja con esos Id.");
        }

        // Actualizamos la lista de parejas al introducir como parámetro la nueva lista con el elemento nuevo:
        cuartel.setParejas(listaParejas);

        actualizarArchivo(cuartel);

    }

  /*  public void modificarDragonPorId(int id) throws JAXBException, IOException {

        Cuartel cuartel = leerXML();

        // Se crea una nueva lista que contiene la información previa
        ArrayList<Dragon> listaDragones = cuartel.getDragones();

        boolean resultado = false;

        for (Dragon d : listaDragones) {
            if (d.id == id) {
                
            }
        }


        // Actualizamos la lista de dragones al introducir como parámetro la nueva lista con el elemento nuevo:
        cuartel.setDragones(listaDragones);

        actualizarArchivo(cuartel);

    }
*/
    public String consultarPorId(int id) throws JAXBException, IOException {

        Cuartel cuartel = leerXML();

        // Se crean dos nuevas listas que contienen la información previa
        ArrayList<Dragon> listaDragones = cuartel.getDragones();
        ArrayList<Jinete> listaJinetes = cuartel.getJinetes();

        String resultado = "No se ha encontrado ningún resultado";

        for (Dragon d : listaDragones) {
            if (d.id == id) {
                resultado = "Existe un dragón con los siguientes datos: " + d.toString();
            }
        }

        for (Jinete j : listaJinetes) {
            if (j.id == id) {
                resultado = "Existe un jinete con los siguientes datos: " + j.toString();

            }
        }

        return resultado;
    }

    private void actualizarArchivo(Cuartel cuartel) throws PropertyException, JAXBException, IOException {

        // Actualizamos el XML con los cambios realizados sobre el archivo con los otros métodos
        // Creamos un contexto de JAXB
        JAXBContext context = JAXBContext.newInstance(Cuartel.class);

        // Creamos un Marshaller para escribir en el XML
        Marshaller marshaller = context.createMarshaller();
        // Establecemos el formato
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        // Establecemos la codificación (la codificación predeterminada es // utf-8)       
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        // Si se debe omitir la información del encabezado xml, no se omite // por defecto (falso)
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, false);
        marshaller.marshal(cuartel, new FileWriter("escuadrones.xml", StandardCharsets.UTF_8));
        // Se crea el archivo XML

    }

}
