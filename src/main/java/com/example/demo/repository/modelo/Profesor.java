package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="profesor")
public class Profesor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_profesor")
    @SequenceGenerator(name = "seq_profesor", sequenceName = "seq_profesor", allocationSize = 1)
    @Column(name = "prof_id")
    private Integer id;

    @Column(name = "prof_nombre")
    private String nombre;

    @Column(name = "prof_apellido")
    private String apellido;

    @Column(name = "prof_fecha_nacimiento")
    private LocalDateTime fechaNacimiento;

    @Column(name = "prof_sueldo")
    private BigDecimal sueldo;

    @Column(name = "prof_cedula")
    private String cedula;

    //Getters y Setters
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public BigDecimal getSueldo() {
        return sueldo;
    }
    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }

    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    
}
