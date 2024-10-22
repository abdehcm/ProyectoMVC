/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc;

/**
 *
 * @author alumnadotarde
 */
class Dragon {

    String nombre, apellidos, sexo, raza, fechaEclosion, fechaIncorporacion;
    Double alzada, largura, envergadura, alcanceLlamarada;

    public Dragon(String nombre, String apellidos, String sexo, String raza,
            String fechaEclosion, String fechaIncorporacion, Double alzada,
            Double largura, Double envergadura, Double alcanceLlamarada) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.raza = raza;
        this.fechaEclosion = fechaEclosion;
        this.fechaIncorporacion = fechaIncorporacion;
        this.alzada = alzada;
        this.largura = largura;
        this.envergadura = envergadura;
        this.alcanceLlamarada = alcanceLlamarada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getFechaEclosion() {
        return fechaEclosion;
    }

    public void setFechaEclosion(String fechaEclosion) {
        this.fechaEclosion = fechaEclosion;
    }

    public String getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(String fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public Double getAlzada() {
        return alzada;
    }

    public void setAlzada(Double alzada) {
        this.alzada = alzada;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(Double envergadura) {
        this.envergadura = envergadura;
    }

    public Double getAlcanceLlamarada() {
        return alcanceLlamarada;
    }

    public void setAlcanceLlamarada(Double alcanceLlamarada) {
        this.alcanceLlamarada = alcanceLlamarada;
    }
    

}
