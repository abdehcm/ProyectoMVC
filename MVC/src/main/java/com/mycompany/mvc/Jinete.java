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
@XmlType(propOrder = {"nombre", "apellidos", "sexo", "fechaNacimiento", "fechaIncorporacion", "altura", "manoDominante", "rangoMilitar", "ocupacion"})
public class Jinete {

    int id;
    String nombre, apellidos, sexo, fechaNacimiento, fechaIncorporacion,
            manoDominante, rangoMilitar, ocupacion;
    Double altura;
    
    public Jinete() {
        
    }

    public Jinete(int id, String nombre, String apellidos, String sexo, String fechaNacimiento,
            String fechaIncorporacion, String manoDominante, String rangoMilitar,
            String ocupacion, Double altura) {
        
        this.id = id;
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

    @Override
    public String toString() {
        return "\t\t<jinete id=" + id + ">\n \t\t\t<nombre>" + nombre + "</nombre>\n \t\t\t<apellidos>" + apellidos + "</apellidos> \n \t\t\t<sexo>" + sexo + "</sexo>\n \t\t\t<fecha_nacimiento=" + fechaNacimiento + "</fecha_nacimiento>\n \t\t\t<fecha_incorporacion>" + fechaIncorporacion + "</fecha_incorporacion>\n \t\t\t<mano_dominante>" + manoDominante + "</mano_dominante>\n \t\t\t<rango_militar>" + rangoMilitar + "</rango_militar>\n \t\t\t<ocupacion>" + ocupacion + "</ocupacion>\n \t\t\t<altura>" + altura + "</altura>\n \t\t</jinete>\n";
    }

}
