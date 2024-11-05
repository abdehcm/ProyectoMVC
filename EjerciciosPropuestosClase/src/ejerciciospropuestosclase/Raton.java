/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospropuestosclase;

/**
 *
 * @author alumnadotarde
 */
public class Raton implements Runnable {

    /**
     * @param args the command line arguments
     */
    private String nombre;
    private int tiempoAlimentacion;

    public Raton(String nombre, int tiempoAlimentacion) {
        super();
        this.nombre = nombre;
        this.tiempoAlimentacion = tiempoAlimentacion;
    }

    public void comer() {
        try {
            System.out.printf("El raton ha comenzado ha alimentarse%n ", nombre);
            Thread.sleep(tiempoAlimentacion * 1000);
            System.out.printf("El ratón %s ha terminado de alimentarse%n ", nombre);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        comer();
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Raton fievel = new Raton("Fievel", 4);
        Raton jerry = new Raton("Jerri", 5);
        Raton pinky = new Raton("Pinky", 3);
        Raton mickey = new Raton("Mickey", 6);

        /*fievel.comer();
        jerry.comer();
        pinky.comer();
        mickey.comer();*/
        Thread hiloFievel = new Thread(fievel);
        Thread hiloJerry = new Thread(jerry);
        Thread hiloPinky = new Thread(pinky);
        Thread hiloMickey = new Thread(mickey);

        //Con método start
        /*hiloFievel.start();
        hiloJerry.start();
        hiloPinky.start();
        hiloMickey.start();*/
        
        //Con método run
        hiloFievel.run();
        hiloJerry.run();
        hiloPinky.run();
        hiloMickey.run();

    }
}
