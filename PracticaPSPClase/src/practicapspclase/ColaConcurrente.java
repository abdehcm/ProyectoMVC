/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicapspclase;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author alumnadotarde
 */
public class ColaConcurrente implements Runnable {

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
    private static Queue<Integer> cola = new LinkedList<Integer>();

    @Override
    public void run() {
        cola.add(10);
        for (Integer i : cola) {
            System.out.print(i + ":");
        }
        System.out.println("Tamaño cola:" + cola.size());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new ColaNoConcurrente()).start();
        }
    }

}
