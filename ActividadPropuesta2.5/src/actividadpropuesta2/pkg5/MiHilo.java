/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadpropuesta2.pkg5;

import java.util.Random;

/**
 *
 * @author alumnadotarde
 */
public class MiHilo extends Thread {

    //Instanciamos el Random
    private static final Random random = new Random();

    //Constructor
    public MiHilo(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        while (true) {
            try {
                // Escribe el mensaje con un getName para imprimir el nombre de Hilo
                System.out.println("Soy el bucle " + getName() + " y estoy trabajando.");

                // Suspende el hilo por un tiempo aleatorio entre 1 y 10 seg
                int tiempoEspera = 1000 + random.nextInt(10000); // 1-10 seg en miliseg
                Thread.sleep(tiempoEspera);

            } catch (InterruptedException e) {
                System.out.println(getName() + " fue interrumpido.");
                break; // Con el break si hay interrupción sale del bucle
            }
        }
    }
}
