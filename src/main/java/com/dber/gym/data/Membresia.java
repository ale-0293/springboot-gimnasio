package com.dber.gym.data;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "membresia")
public class Membresia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String tipo;

    @Column
    private String precio;

    @Column
    private LocalDate fechaInicio;

    @Column
    private LocalDate fechaFin;

    @Column
    private Boolean activa;

    // Relationships
    // 1- Un Miembro puede tener muchas membresías y una Membresía activa. (uno a muchos)
    @ManyToOne
    @JoinColumn(name = "miembro_id")
    private Miembro miembro;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Boolean getActiva() {
        return activa;
    }

    public void setActiva(Boolean activa) {
        this.activa = activa;
    }

}
