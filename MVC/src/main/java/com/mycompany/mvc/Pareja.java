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
@XmlRootElement(name = "pareja")
@XmlType(propOrder = { "idDragon", "idJinete", "fechaInicio", "fechaFin" })
public class Pareja {
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

    @Override
    public String toString() {
        return "\t\t<pareja>\n \t\t\t<id_dragon>" + idDragon + "</id_dragon>\n \t\t\t<id_jinete>" + idJinete + "</id_jinete>\n \t\t\t<fecha_inicio>" + fechaInicio + "</fecha_inicio>\n \t\t\t<fecha_fin>" + fechaFin + "</fecha_fin>\n \t\t</pareja>\n";
    }
}
