package com.mycompany.busitestws.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Karina
 */

@Entity
@Table(name="ESPECIALIDAD")
@XmlRootElement(name="especialidad")
@XmlType(propOrder={"idespecialidad","nombre","area","descripcion"})
public class Especialidad {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="IDEspecialidad")
    private int idespecialidad;
    @Column(name="Nombre")
    private String nombre;
    @Column(name="Area")
    private String area;
    @Column(name="Descripcion")
    private String descripcion;

    @XmlElement
    public int getIdespecialidad() {
        return idespecialidad;
    }

    public void setIdespecialidad(int idespecialidad) {
        this.idespecialidad = idespecialidad;
    }

    @XmlElement
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlElement
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @XmlElement
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
