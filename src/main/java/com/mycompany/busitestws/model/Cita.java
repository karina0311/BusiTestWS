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
@Table(name="CITA")
@XmlRootElement(name="cita")
@XmlType(propOrder={"idcita","horaInicio","horaFin","observaciones","estado","idhorario","fecha","idpaciente","idbloque"})
public class Cita {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="IDCita")
    private int idcita;
    @Column(name="Hora_Inicio")
    private Date horaInicio;
    @Column(name="Hora_Fin")
    private Date horaFin;
    @Column(name="Observaciones")
    private String observaciones;
    @Column(name="Estado")
    private int estado;
    @Column(name="IDHorario")
    private int idhorario;
    @Column(name="Fecha")
    private Date fecha;
    @Column(name="IDPaciente")
    private int idpaciente;
    @Column(name="IDBloque")
    private int idbloque;

    @XmlElement
    public int getIdcita() {
        return idcita;
    }

    public void setIdcita(int idcita) {
        this.idcita = idcita;
    }

    @XmlElement
    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    @XmlElement
    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    @XmlElement
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @XmlElement
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @XmlElement
    public int getIdhorario() {
        return idhorario;
    }

    public void setIdhorario(int idhorario) {
        this.idhorario = idhorario;
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
    public int getIdbloque() {
        return idbloque;
    }

    public void setIdbloque(int idbloque) {
        this.idbloque = idbloque;
    }
}
