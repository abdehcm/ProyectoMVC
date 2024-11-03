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
import java.util.concurrent.CopyOnWriteArrayList;
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

    // Establecemos un objeto de tipo Cuartel como atributo de la clase para que todos los métodos lo tengan disponible.
    Cuartel cuartel;

    public CuartelModelo() throws JAXBException {

        //El atributo cuartel toma los datos del XML cuando se construye el objeto en el controlador
        cuartel = leerXML();
    }

    public Cuartel getCuartel() {
        return cuartel;
    }

    public void setCuartel(Cuartel cuartel) throws JAXBException, PropertyException, IOException {
        this.cuartel = cuartel;
        
        //Actualizamos el contenido del XML cada vez que se modifique el objeto Cuartel.
        
        actualizarXML();
    }

    public static Cuartel leerXML() throws JAXBException {

        // Lee el arhivo XML, crea un contexto y devuelve un objeto Cuartel.
        File f = new File("escuadrones.xml");

        JAXBContext context = JAXBContext.newInstance(Cuartel.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        Cuartel cuartel = (Cuartel) unmarshaller.unmarshal(f);

        return cuartel;

    }

    public void mostrarContenido() throws JAXBException {

        //Se extraen las listas de objetos.
        CopyOnWriteArrayList<Dragon> listaDragones = cuartel.getDragones();
        CopyOnWriteArrayList<Jinete> listaJinetes = cuartel.getJinetes();
        CopyOnWriteArrayList<Pareja> listaParejas = cuartel.getParejas();

        //Se imprimen por pantalla los objetos de manera equivalente al XML leído.
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

        // Se crea una nueva lista que contiene la información previa
        CopyOnWriteArrayList<Dragon> listaDragones = cuartel.getDragones();

        listaDragones.add(dragon);

        // Actualizamos la lista de dragones al introducir como parámetro la nueva lista con el elemento nuevo:
        cuartel.setDragones(listaDragones);

        //Guardamos los cambios en el XML.
        actualizarXML();

    }

    public void añadirJinete(Jinete jinete) throws JAXBException, IOException {

        // Se crea una nueva lista que contiene la información previa
        CopyOnWriteArrayList<Jinete> listaJinetes = cuartel.getJinetes();

        listaJinetes.add(jinete);

        // Actualizamos la lista de jinetes al introducir como parámetro la nueva lista con el elemento nuevo:
        cuartel.setJinetes(listaJinetes);

        //Guardamos los cambios en el XML.
        actualizarXML();

    }

    public void añadirPareja(Pareja pareja) throws JAXBException, IOException {

        // Se crea una nueva lista que contiene la información previa
        CopyOnWriteArrayList<Pareja> listaParejas = cuartel.getParejas();

        listaParejas.add(pareja);

        // Actualizamos la lista de parejas al introducir como parámetro la nueva lista con el elemento nuevo:
        cuartel.setParejas(listaParejas);

        //Guardamos los cambios en el XML.
        actualizarXML();

    }

    public boolean comprobarDragonPorId(int id) throws JAXBException, IOException {

        // Se crea una nueva lista que contiene la información previa
        CopyOnWriteArrayList<Dragon> listaDragones = cuartel.getDragones();

        // Se comprueba si ya existe un dragón con ese id.
        boolean resultado = false;

        for (Dragon d : listaDragones) {
            if (d.id == id) {
                resultado = true;
            }
        }

        return resultado;

    }

    public boolean comprobarJinetePorId(int id) throws JAXBException, IOException {

        // Se crea una nueva lista que contiene la información previa
        CopyOnWriteArrayList<Jinete> listaJinetes = cuartel.getJinetes();

        // Se comprueba si ya existe un jinete con ese id.
        boolean resultado = false;

        for (Jinete j : listaJinetes) {
            if (j.id == id) {
                resultado = true;
            }
        }

        return resultado;

    }

    public boolean comprobarParejaPorId(int idDragon, int idJinete) throws JAXBException, IOException {

        // Se crea una nueva lista que contiene la información previa
        CopyOnWriteArrayList<Pareja> listaParejas = cuartel.getParejas();

        // Se comprueba si ya existe una pareja con ese id.
        boolean resultado = false;

        for (Pareja p : listaParejas) {
            if ((p.idDragon == idDragon) && (p.idJinete == idJinete)) {
                resultado = true;
            }
        }

        return resultado;

    }

    public void eliminarDragonPorId(int id) throws JAXBException, IOException {

        // Se crea una nueva lista que contiene la información previa
        CopyOnWriteArrayList<Dragon> listaDragones = cuartel.getDragones();

        for (Dragon d : listaDragones) {
            if (d.getId() == id) {
                listaDragones.remove(d);
            }
        }

        // Actualizamos la lista de dragones al introducir como parámetro la nueva lista con el elemento eliminado:
        cuartel.setDragones(listaDragones);

        //Guardamos los cambios en el XML.
        actualizarXML();

    }

    public void eliminarJinetePorId(int id) throws JAXBException, IOException {

        // Se crea una nueva lista que contiene la información previa
        CopyOnWriteArrayList<Jinete> listaJinetes = cuartel.getJinetes();

        for (Jinete j : listaJinetes) {
            if (j.id == id) {
                listaJinetes.remove(j);
            }
        }

        // Actualizamos la lista de jinetes al introducir como parámetro la nueva lista con el elemento eliminado:
        cuartel.setJinetes(listaJinetes);

        //Guardamos los cambios en el XML.
        actualizarXML();

    }

    public void eliminarParejaPorId(int idDragon, int idJinete) throws JAXBException, IOException {

        // Se crea una nueva lista que contiene la información previa
        CopyOnWriteArrayList<Pareja> listaParejas = cuartel.getParejas();

        for (Pareja p : listaParejas) {
            if ((p.idDragon == idDragon) && (p.idJinete == idJinete)) {
                listaParejas.remove(p);
            }
        }

        // Actualizamos la lista de parejas al introducir como parámetro la nueva lista con el elemento eliminado:
        cuartel.setParejas(listaParejas);

        actualizarXML();

    }
    
    public String consultarPorId(int id) throws JAXBException, IOException {

        // Se crean dos nuevas listas que contienen la información previa
        CopyOnWriteArrayList<Dragon> listaDragones = cuartel.getDragones();
        CopyOnWriteArrayList<Jinete> listaJinetes = cuartel.getJinetes();

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

    private void actualizarXML() throws PropertyException, JAXBException, IOException {

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
