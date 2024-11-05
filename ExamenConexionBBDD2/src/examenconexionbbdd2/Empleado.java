/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenconexionbbdd2;

import java.sql.Date;

/**
 *
 * @author abdelhachim
 */
public class Empleado {
    private int numEmp;
    private String nombre;
    private int edad;
    private int oficina;
    private String puesto;
    private Date contrato;

    public Empleado(int numEmp, String nombre, int edad, int oficina, String puesto, Date contrato) {
        this.numEmp = numEmp;
        this.nombre = nombre;
        this.edad = edad;
        this.oficina = oficina;
        this.puesto = puesto;
        this.contrato = contrato;
    }

    public int getNumEmp() {
        return numEmp;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getOficina() {
        return oficina;
    }

    public String getPuesto() {
        return puesto;
    }

    public Date getContrato() {
        return contrato;
    }

    public void setNumEmp(int numEmp) {
        this.numEmp = numEmp;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setOficina(int oficina) {
        this.oficina = oficina;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setContrato(Date contrato) {
        this.contrato = contrato;
    }

    @Override
    public String toString() {
        return "Empleado: " + "numEmp = " + numEmp + ", nombre = " + nombre +
                ", edad = " + edad + ", oficina = " + oficina + ", puesto = " + 
                puesto + ", contrato = " + contrato + '}';
    }
    
    
    
}
