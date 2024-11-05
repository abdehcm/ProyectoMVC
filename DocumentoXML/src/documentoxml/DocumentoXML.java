/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package documentoxml;

/**
 *
 * @author abdelhachim
 */
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class DocumentoXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            // 1. Crear una instancia de DocumentBuilderFactory
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

            // 2. Crear un DocumentBuilder
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            // 3. Crear un nuevo documento (vacío)
            Document doc = dBuilder.newDocument();

            // 4. Crear el elemento raíz (root element)
            Element rootElement = doc.createElement("biblioteca");
            doc.appendChild(rootElement);

            // 5. Crear elementos hijo y añadirlos al documento
            Element libro = doc.createElement("libro");
            rootElement.appendChild(libro);

            // Añadir atributos al libro
            libro.setAttribute("id", "1");

            // Añadir el elemento "titulo"
            Element titulo = doc.createElement("titulo");
            titulo.appendChild(doc.createTextNode("El Quijote"));
            libro.appendChild(titulo);

            // Añadir el elemento "autor"
            Element autor = doc.createElement("autor");
            autor.appendChild(doc.createTextNode("Miguel de Cervantes"));
            libro.appendChild(autor);

            // Añadir el elemento "precio"
            Element precio = doc.createElement("precio");
            precio.appendChild(doc.createTextNode("19.99"));
            libro.appendChild(precio);

            // 6. Escribir el contenido del XML en un archivo
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            // Opciones de salida (formato)
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");  // Indentación del XML
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("biblioteca.xml"));

            // Transformar el documento a archivo
            transformer.transform(source, result);

            System.out.println("Archivo XML creado exitosamente!");

        } catch (ParserConfigurationException | TransformerException e) {
            e.printStackTrace();
        }
    }

}
