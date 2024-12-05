/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadpropuesta27;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author alumnadotarde
 */
public class GestorHojas extends Thread {

    /**
     * @param args the command line arguments
     */
    //Uso CopyOnWriteArrayList para que cada vez que se modifique la lista
    //se creara una nueva copia y asi no tenemos probelmas de concurrencia
    // Instancio una lista de tipo String 
    private static List<String> lista = new CopyOnWriteArrayList<>();

    // Con el metodo RUN  es donde empieza la ejecucion del hilo
    @Override
    public void run() {
        // Un bucle infinito para la ejecucion del hilo
        while (true) {
            // Si la lista es mayor que 10 se elimina el primer elemento
            if (lista.size() > 10) {
                lista.remove(0);
                //Si el tamaño de la lista es menor que 10 se agrega un nuevo elemento
            } else if (lista.size() < 10) {
                lista.add(new String("Texto"));
            }
            //Se recorre la lista e imprime el valor actual de la lista
            for (String string : lista) {
                System.out.println(string);
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        // Inicializo la lista con 10 elementos
        for (int i = 0; i < 10; i++) {
            lista.add(new String("Texto" + i));
        }

        // Aqui se crean e inician los hilos que ejecutaran el metodo RUN
        for (int i = 0; i < 10; i++) {
            new GestorHojas().start();
        }

    }

}
