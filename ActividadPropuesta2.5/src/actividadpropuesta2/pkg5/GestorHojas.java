/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadpropuesta2.pkg5;


import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author alumnadotarde
 */
public class GestorHojas extends Thread {

    private static CopyOnWriteArrayList<String> lista = new CopyOnWriteArrayList<>();

    @Override
    public void run() {
        while (true) {
            if (lista.size() >= 10) {
                lista.remove(0); // Eliminación segura
            } else if (lista.size() < 10) {
                lista.add(new String("Texto")); // Adición segura
            }
            for (String string : lista) {
                // Recorriendo la lista (seguro para lectura concurrente)
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            lista.add(new String("Texto")); // Inicialización segura
        }
        for (int i = 0; i < 100; i++) {
            new GestorHojas().start();
        }
    }
}