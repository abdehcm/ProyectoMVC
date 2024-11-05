/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenud1abdelhachim;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author alumnadotarde
 */
public class Ejercicio3 {

    public static void main(String[] args) throws TransformerConfigurationException, TransformerException {
        try {

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();

            Element rootElement = doc.createElement("empleados");
            doc.appendChild(rootElement);

            Element empleado = doc.createElement("empleado");
            rootElement.appendChild(empleado);
            empleado.setAttribute("id", "1");
            //Empleado 1
            Element nombre = doc.createElement("nombre");
            nombre.appendChild(doc.createTextNode("Juan"));
            empleado.appendChild(nombre);

            Element edad = doc.createElement("edad");
            edad.appendChild(doc.createTextNode("23"));
            empleado.appendChild(edad);

            Element meses_trabajados = doc.createElement("meses_trabajados");
            meses_trabajados.appendChild(doc.createTextNode("7"));
            empleado.appendChild(meses_trabajados);

            Element puesto = doc.createElement("puesto");
            puesto.appendChild(doc.createTextNode("Cocinero/a"));
            empleado.appendChild(puesto);

            Element sueldo = doc.createElement("sueldo");
            sueldo.appendChild(doc.createTextNode("18000"));
            empleado.appendChild(sueldo);

            //Empleado 2
            empleado = doc.createElement("empleado");
            rootElement.appendChild(empleado);
            empleado.setAttribute("id", "2");

            nombre = doc.createElement("nombre");
            nombre.appendChild(doc.createTextNode("Lucas"));
            empleado.appendChild(nombre);

            edad = doc.createElement("edad");
            edad.appendChild(doc.createTextNode("28"));
            empleado.appendChild(edad);

            meses_trabajados = doc.createElement("meses_trabajados");
            meses_trabajados.appendChild(doc.createTextNode("31"));
            empleado.appendChild(meses_trabajados);

            puesto = doc.createElement("puesto");
            puesto.appendChild(doc.createTextNode("Encargado/a"));
            empleado.appendChild(puesto);

            sueldo = doc.createElement("sueldo");
            sueldo.appendChild(doc.createTextNode("26000"));
            empleado.appendChild(sueldo);

            //Empleado 3
            empleado = doc.createElement("empleado");
            rootElement.appendChild(empleado);
            empleado.setAttribute("id", "3");

            nombre = doc.createElement("nombre");
            nombre.appendChild(doc.createTextNode("María"));
            empleado.appendChild(nombre);

            edad = doc.createElement("edad");
            edad.appendChild(doc.createTextNode("34"));
            empleado.appendChild(edad);

            meses_trabajados = doc.createElement("meses_trabajados");
            meses_trabajados.appendChild(doc.createTextNode("7"));
            empleado.appendChild(meses_trabajados);

            puesto = doc.createElement("puesto");
            puesto.appendChild(doc.createTextNode("Comunity Manager"));
            empleado.appendChild(puesto);

            sueldo = doc.createElement("sueldo");
            sueldo.appendChild(doc.createTextNode("30000"));
            empleado.appendChild(sueldo);

            //Empleado 4
            empleado = doc.createElement("empleado");
            rootElement.appendChild(empleado);
            empleado.setAttribute("id", "4");

            nombre = doc.createElement("nombre");
            nombre.appendChild(doc.createTextNode("Luisa"));
            empleado.appendChild(nombre);

            edad = doc.createElement("edad");
            edad.appendChild(doc.createTextNode("33"));
            empleado.appendChild(edad);

            meses_trabajados = doc.createElement("meses_trabajados");
            meses_trabajados.appendChild(doc.createTextNode("2"));
            empleado.appendChild(meses_trabajados);

            puesto = doc.createElement("puesto");
            puesto.appendChild(doc.createTextNode("Camarero/a"));
            empleado.appendChild(puesto);

            sueldo = doc.createElement("sueldo");
            sueldo.appendChild(doc.createTextNode("16000"));
            empleado.appendChild(sueldo);

            //Empleado 5
            empleado = doc.createElement("empleado");
            rootElement.appendChild(empleado);
            empleado.setAttribute("id", "5");

            nombre = doc.createElement("nombre");
            nombre.appendChild(doc.createTextNode("Francisco"));
            empleado.appendChild(nombre);

            edad = doc.createElement("edad");
            edad.appendChild(doc.createTextNode("27"));
            empleado.appendChild(edad);

            meses_trabajados = doc.createElement("meses_trabajados");
            meses_trabajados.appendChild(doc.createTextNode("37"));
            empleado.appendChild(meses_trabajados);

            puesto = doc.createElement("puesto");
            puesto.appendChild(doc.createTextNode("Camarero/a"));
            empleado.appendChild(puesto);

            sueldo = doc.createElement("sueldo");
            sueldo.appendChild(doc.createTextNode("18000"));
            empleado.appendChild(sueldo);

            //Empleado 6
            empleado = doc.createElement("empleado");
            rootElement.appendChild(empleado);
            empleado.setAttribute("id", "6");

            nombre = doc.createElement("nombre");
            nombre.appendChild(doc.createTextNode("Paula"));
            empleado.appendChild(nombre);

            edad = doc.createElement("edad");
            edad.appendChild(doc.createTextNode("23"));
            empleado.appendChild(edad);

            meses_trabajados = doc.createElement("meses_trabajados");
            meses_trabajados.appendChild(doc.createTextNode("9"));
            empleado.appendChild(meses_trabajados);

            puesto = doc.createElement("puesto");
            puesto.appendChild(doc.createTextNode("Cocinero/a"));
            empleado.appendChild(puesto);

            sueldo = doc.createElement("sueldo");
            sueldo.appendChild(doc.createTextNode("16000"));
            empleado.appendChild(sueldo);

            //Empleado 7
            empleado = doc.createElement("empleado");
            rootElement.appendChild(empleado);
            empleado.setAttribute("id", "7");

            nombre = doc.createElement("nombre");
            nombre.appendChild(doc.createTextNode("Rodrigo"));
            empleado.appendChild(nombre);

            edad = doc.createElement("edad");
            edad.appendChild(doc.createTextNode("31"));
            empleado.appendChild(edad);

            meses_trabajados = doc.createElement("meses_trabajados");
            meses_trabajados.appendChild(doc.createTextNode("12"));
            empleado.appendChild(meses_trabajados);

            puesto = doc.createElement("puesto");
            puesto.appendChild(doc.createTextNode("Camarero/a"));
            empleado.appendChild(puesto);

            sueldo = doc.createElement("sueldo");
            sueldo.appendChild(doc.createTextNode("17000"));
            empleado.appendChild(sueldo);

            //empleado 8
            empleado = doc.createElement("empleado");
            rootElement.appendChild(empleado);
            empleado.setAttribute("id", "8");

            nombre = doc.createElement("nombre");
            nombre.appendChild(doc.createTextNode("Sofía"));
            empleado.appendChild(nombre);

            edad = doc.createElement("edad");
            edad.appendChild(doc.createTextNode("24"));
            empleado.appendChild(edad);

            meses_trabajados = doc.createElement("meses_trabajados");
            meses_trabajados.appendChild(doc.createTextNode("40"));
            empleado.appendChild(meses_trabajados);

            puesto = doc.createElement("puesto");
            puesto.appendChild(doc.createTextNode("Cocinero/a"));
            empleado.appendChild(puesto);

            sueldo = doc.createElement("sueldo");
            sueldo.appendChild(doc.createTextNode("19000"));
            empleado.appendChild(sueldo);
            

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            transformer.setOutputProperty(OutputKeys.INDENT, "yes");  // Indentación del XML
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("BarMiguel.xml"));
            transformer.transform(source, result);
            //transformer.transform(source, result);

            System.out.println("Archivo XML creado exitosamente!");

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

    }

}
