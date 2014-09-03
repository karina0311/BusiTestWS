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
@Table(name="BLOQUE")
@XmlRootElement(name="bloque")
@XmlType(propOrder={"idbloque","fecha","horaInicio","horafin","estado","idhorario","idcita"})
public class Bloque {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="IDBloque")
    private int idbloque;
    @Column(name="Fecha")
    private Date fecha;
    @Column(name="Hora_Inicio")
    private Date horaInicio;
    @Column(name="Hora_Fin")
    private Date horaFin;
    @Column(name="Estado")
    private int estado;
    @Column(name="IDHorario")
    private int idhorario;
    @Column(name="IDCita")
    private int idcita;

    @XmlElement
    public int getIdbloque() {
        return idbloque;
    }

    public void setIdbloque(int idbloque) {
        this.idbloque = idbloque;
    }

    @XmlElement
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
    public int getIdcita() {
        return idcita;
    }

    public void setIdcita(int idcita) {
        this.idcita = idcita;
    }
    
    
}
