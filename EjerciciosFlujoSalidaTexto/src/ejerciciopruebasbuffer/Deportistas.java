/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopruebasbuffer;

/**
 *
 * @author artur
 */
public class Deportistas {
    String nombre;
    int edad;
    double peso;
    double altura;
    
    public Deportistas(String nombre, int edad, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }
    @Override
    public String toString(){
        return "Nombre: " + nombre + "\tEdad: " + edad + "\tPeso: " + altura + peso + "\tAltura: " + altura;
    }
}
