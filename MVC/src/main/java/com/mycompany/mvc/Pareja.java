/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc;

/**
 *
 * @author alumnadotarde
 */
class Pareja {
    int idDragon, idJinete;
    String fechaInicio, fechaFin;

    public Pareja(int idDragon, int idJinete, String fechaInicio, String fechaFin) {
        this.idDragon = idDragon;
        this.idJinete = idJinete;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public int getIdDragon() {
        return idDragon;
    }

    public void setIdDragon(int idDragon) {
        this.idDragon = idDragon;
    }

    public int getIdJinete() {
        return idJinete;
    }

    public void setIdJinete(int idJinete) {
        this.idJinete = idJinete;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    
}
