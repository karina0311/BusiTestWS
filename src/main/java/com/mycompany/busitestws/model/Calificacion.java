package com.mycompany.busitestws.model;

import java.util.Date;
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
@Table(name="CALIFICACION")
@XmlRootElement(name="calificacion")
@XmlType(propOrder={"idcalificacion","descripcion","puntuacion","fecha","idpaciente","iddoctor","idtipoCalificacion"})
public class Calificacion {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="IDCalificacion")
    private int idcalificacion;
    @Column(name="Descripcion")
    private String descripcion;
    @Column(name="Puntuacion")
    private int puntuacion;
    @Column(name="Fecha")
    private Date fecha;
    @Column(name="IDPaciente")
    private int idpaciente;
    @Column(name="IDDoctor")
    private int iddoctor;
    @Column(name="IDTipoCalificacion")
    private int idtipoCalificacion;

    @XmlElement
    public int getIdcalificacion() {
        return idcalificacion;
    }

    public void setIdcalificacion(int idcalificacion) {
        this.idcalificacion = idcalificacion;
    }

    @XmlElement
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlElement
    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @XmlElement
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @XmlElement
    public int getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(int idpaciente) {
        this.idpaciente = idpaciente;
    }

    @XmlElement
    public int getIddoctor() {
        return iddoctor;
    }

    public void setIddoctor(int iddoctor) {
        this.iddoctor = iddoctor;
    }

    @XmlElement
    public int getIdtipoCalificacion() {
        return idtipoCalificacion;
    }

    public void setIdtipoCalificacion(int idtipoCalificacion) {
        this.idtipoCalificacion = idtipoCalificacion;
    } 
    
}
