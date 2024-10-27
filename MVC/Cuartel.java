/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author alumnadotarde
 */
@XmlRootElement(name = "cuartel")
@XmlType(propOrder = {"nombre", "direccion", "provincia", "dragones", "jinetes", "parejas"})

public class Cuartel {

    String nombre;
    String direccion;
    String provincia;
    ArrayList<Dragon> listaDragones;
    ArrayList<Jinete> listaJinetes;
    ArrayList<Pareja> listaParejas;

    public Cuartel() {

    }

    public Cuartel(String nombre, String direccion, String provincia, ArrayList<Dragon> listaDragones, ArrayList<Jinete> listaJinetes, ArrayList<Pareja> listaParejas) {
        
        this.nombre = nombre;
        this.direccion = direccion;
        this.provincia = provincia;
        this.listaDragones = listaDragones;
        this.listaJinetes = listaJinetes;
        this.listaParejas = listaParejas;
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
    @XmlElementWrapper(name = "dragones")
    @XmlElement(name = "dragon")
    public ArrayList<Dragon> getDragones() {
        return listaDragones;
    }

    public void setDragones(ArrayList<Dragon> dragones) {
        this.listaDragones = dragones;
    }
    @XmlElementWrapper(name = "jinetes")
    @XmlElement(name = "jinete")
    public ArrayList<Jinete> getJinetes() {
        return listaJinetes;
    }

    public void setJinetes(ArrayList<Jinete> jinetes) {
        this.listaJinetes = jinetes;
    }
    
    @XmlElementWrapper(name = "parejas")
    @XmlElement(name = "pareja")
    public ArrayList<Pareja> getParejas() {
        return listaParejas;
    }

    public void setParejas(ArrayList<Pareja> parejas) {
        this.listaParejas = parejas;
    }

}
