/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author alumnadotarde
 */
@XmlRootElement(name = "cuartel")
@XmlType(propOrder = { "nombre", "direccion", "provincia", "dragones", "jinetes", "parejas" })
public class Cuartel {
    
    String nombre;
    String direccion;
    String provincia;
    ArrayList<Dragon> dragones;
    ArrayList<Jinete> jinetes;
    ArrayList<Pareja> parejas;
    
    public Cuartel() {
        
    }

    public Cuartel(String nombre, String direccion, String provincia, ArrayList<Dragon> dragones, ArrayList<Jinete> jinetes, ArrayList<Pareja> parejas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.provincia = provincia;
        this.dragones = dragones;
        this.jinetes = jinetes;
        this.parejas = parejas;
    }
    
    @XmlElement(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @XmlElement(name = "direccion")
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    @XmlElement(name = "provincia")
    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    @XmlElement(name = "dragon")
    public ArrayList<Dragon> getDragones() {
        return dragones;
    }

    public void setDragones(ArrayList<Dragon> dragones) {
        this.dragones = dragones;
    }
    @XmlElement(name = "jinete")
    public ArrayList<Jinete> getJinetes() {
        return jinetes;
    }

    public void setJinetes(ArrayList<Jinete> jinetes) {
        this.jinetes = jinetes;
    }
    @XmlElement(name = "pareja")
    public ArrayList<Pareja> getParejas() {
        return parejas;
    }

    public void setParejas(ArrayList<Pareja> parejas) {
        this.parejas = parejas;
    }
    
    
    
    
    
}
