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

@XmlRootElement(name = "dragon")
@XmlType(propOrder = {"nombre", "apellidos", "sexo", "raza", "fechaEclosion", "fechaIncorporacion", "alzada", "largura", "envergadura", "alcanceLlamarada" })
public class Dragon {
    
    int id;
    String nombre, apellidos, sexo, raza, fechaEclosion, fechaIncorporacion;
    Double alzada, largura, envergadura, alcanceLlamarada;
    
    public Dragon() {
        
    }

    public Dragon(int id, String nombre, String apellidos, String sexo, String raza,
            String fechaEclosion, String fechaIncorporacion, Double alzada,
            Double largura, Double envergadura, Double alcanceLlamarada) {
        
        this.id = id;
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
    
    @XmlElement(name = "raza")
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    @XmlElement(name = "fecha_eclosion")
    public String getFechaEclosion() {
        return fechaEclosion;
    }

    public void setFechaEclosion(String fechaEclosion) {
        this.fechaEclosion = fechaEclosion;
    }
    
    @XmlElement(name = "fecha_incorporacion")
    public String getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(String fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }
    
    @XmlElement(name = "alzada")
    public Double getAlzada() {
        return alzada;
    }

    public void setAlzada(Double alzada) {
        this.alzada = alzada;
    }
    
    @XmlElement(name = "largura")
    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }
    
    @XmlElement(name = "envergadura")
    public Double getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(Double envergadura) {
        this.envergadura = envergadura;
    }
    @XmlElement(name = "alcance_llamarada")
    public Double getAlcanceLlamarada() {
        return alcanceLlamarada;
    }

    public void setAlcanceLlamarada(Double alcanceLlamarada) {
        this.alcanceLlamarada = alcanceLlamarada;
    }

    @Override
    public String toString() {
        return "\t\t<dragon id=" + id + ">\n \t\t\t<nombre>" + nombre + "</nombre>\n \t\t\t<apellidos>" + apellidos + "</apellidos> \n \t\t\t<sexo>" + sexo + "</sexo>\n \t\t\t<raza>" + raza + "</raza> \n\t\t\t<fecha_eclosion>" + fechaEclosion + "</fecha_eclosion>\n \t\t\t<fecha_incorporacion>" + fechaIncorporacion + "</fecha_incorporacion>\n\t\t\t<alzada>" + alzada + "</alzada>\n \t\t\t<largura>" + largura + "</largura>\n \t\t\t<envergadura>" + envergadura + "</envergadura> \n \t\t\t<alcance_llamarada>" + alcanceLlamarada + "</alcance_llamarada>\n \t\t</dragon>\n";
    }
    

}
