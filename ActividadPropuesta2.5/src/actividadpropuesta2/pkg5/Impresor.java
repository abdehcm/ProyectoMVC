package actividadpropuesta2.pkg5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumnadotarde
 */
public class Impresor extends Thread {

    private int contador;
    private static int acumulador;

    private void ajustaContador() {
        contador -= 500;
    }

    private void ajustaAcumulador() {
        contador -= 500;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            contador++;
            acumulador++;
            if (contador == 600) {
                ajustaContador();
            }

            if (acumulador == 600) {
                ajustaAcumulador();
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Impresor().start();
        }
    }

}
