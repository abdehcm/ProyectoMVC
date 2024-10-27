/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author alumnadotarde
 */
@XmlRootElement(name = "jinete")
@XmlType(propOrder = {"nombre", "apellidos", "sexo", "fecha_nacimiento", "fecha_incorporacion", "altura", "mano_dominante", "rango militar", "ocupacion"})
public class Jinete {

    int id;
    String nombre, apellidos, sexo, fechaNacimiento, fechaIncorporacion,
            manoDominante, rangoMilitar, ocupacion;
    Double altura;
    
    public Jinete() {
        
    }

    public Jinete(String nombre, String apellidos, String sexo, String fechaNacimiento,
            String fechaIncorporacion, String manoDominante, String rangoMilitar,
            String ocupacion, Double altura) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIncorporacion = fechaIncorporacion;
        this.manoDominante = manoDominante;
        this.rangoMilitar = rangoMilitar;
        this.ocupacion = ocupacion;
        this.altura = altura;
    }
    
    @XmlAttribute(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @XmlElement(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @XmlElement(name = "apellidos")
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    @XmlElement(name = "sexo")
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    @XmlElement(name = "fecha_nacimiento")
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    @XmlElement(name = "fecha_incorporacion")
    public String getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(String fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }
    @XmlElement(name = "mano_dominante")
    public String getManoDominante() {
        return manoDominante;
    }

    public void setManoDominante(String manoDominante) {
        this.manoDominante = manoDominante;
    }
    
    @XmlElement(name = "rango_militar")
    public String getRangoMilitar() {
        return rangoMilitar;
    }

    public void setRangoMilitar(String rangoMilitar) {
        this.rangoMilitar = rangoMilitar;
    }
    
    @XmlElement(name = "ocupacion")
    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    
    @XmlElement(name = "altura")
    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

}
