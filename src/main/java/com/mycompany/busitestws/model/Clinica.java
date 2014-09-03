package com.mycompany.busitestws.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Karina
 */
@Entity
@Table(name="CLINICA")
@XmlRootElement(name="clinica")
@XmlType(propOrder={"idclinica","nombre","direccion","razonSocial","telefono","imagen","urlImagen","iddistrito"})
public class Clinica {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="IDEspecialidad")
    private int idclinica;
    private String nombre;
    private String direccion;
    private String razonSocial;
    private String telefono;
    private String imagen;
    private String urlImagen;
    private int iddistrito;
}
