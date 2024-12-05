/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadpropuesta2.pkg5;

/**
 *
 * @author alumnadotarde
 */
public class ActividadPropuesta25 {

    public static void main(String[] args) {

        // Crear y arrancar los cinco hilos
        for (int i = 1; i <= 5; i++) {
            MiHilo hilo = new MiHilo("Hilo-" + i);
            hilo.start();
        }

    }

}
