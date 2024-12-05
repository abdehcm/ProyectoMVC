/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mvc;

import java.io.IOException;
import javax.xml.bind.JAXBException;
import javax.xml.bind.PropertyException;

/**
 *
 * @author alumnadotarde
 */
public class MVC {

    public static void main(String[] args) throws JAXBException, PropertyException, IOException {
        
        //Creamos los objetos de las clases del modelo-vista-controlador

        CuartelModelo modelo = new CuartelModelo();
        CuartelVista vista = new CuartelVista();
        CuartelControlador controlador = new CuartelControlador(modelo, vista);

        
        controlador.start();

    }

}
