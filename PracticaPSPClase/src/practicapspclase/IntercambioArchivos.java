/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicapspclase;

/**
 *
 * @author alumnadotarde
 */
public class IntercambioArchivos {

    public static void main(String[] args) {
        // Crear las instancias de TareaA y TareaB
        TareaA tareaA = new TareaA("archivoA.txt");
        TareaB tareaB = new TareaB("archivoB.txt");

        // Escribir información inicial en cada archivo
        tareaA.escribirArchivo("Contenido de Tarea A");
        tareaB.escribirArchivo("Contenido de Tarea B");

        // Intercambiar el contenido entre ambos archivos
        tareaA.intercambiarContenido(tareaB);

        // Mostrar el contenido de cada archivo después del intercambio
        System.out.println("Contenido de archivoA.txt después del intercambio:");
        System.out.println(tareaA.leerArchivo());

        System.out.println("Contenido de archivoB.txt después del intercambio:");
        System.out.println(tareaB.leerArchivo());
    }

}
