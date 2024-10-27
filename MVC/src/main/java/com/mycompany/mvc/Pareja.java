/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author alumnadotarde
 */
@XmlRootElement(name = "parejas")
@XmlType(propOrder = { "id_dragon", "id_jinete", "fecha_inicio", "fecha_fin" })
class Pareja {
    int idDragon, idJinete;
    String fechaInicio, fechaFin;
    
    public Pareja() {
        
    }

    public Pareja(int idDragon, int idJinete, String fechaInicio, String fechaFin) {
        this.idDragon = idDragon;
        this.idJinete = idJinete;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    
    @XmlElement(name = "id_dragon")
    public int getIdDragon() {
        return idDragon;
    }

    public void setIdDragon(int idDragon) {
        this.idDragon = idDragon;
    }
    
    @XmlElement(name = "id_jinete")
    public int getIdJinete() {
        return idJinete;
    }

    public void setIdJinete(int idJinete) {
        this.idJinete = idJinete;
    }
    
    @XmlElement(name = "fecha_inicio")
    public String getFechaInicio() {
        return fechaInicio;
    }
    
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    @XmlElement(name = "fecha_fin")
    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    
}
