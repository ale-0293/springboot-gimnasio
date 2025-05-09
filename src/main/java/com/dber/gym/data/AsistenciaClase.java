package com.dber.gym.data;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "asistencia_clase")
public class AsistenciaClase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private LocalDateTime fechaAsistencia;

    @Column
    private Boolean presente;

    // Relationships
    // 4- Cada AsistenciaClase se refiere a un Miembro y una Clase específica. (intermedia)
    @ManyToOne
    @JoinColumn(name = "miembro_id")
    private Miembro miembro;

    @ManyToOne
    @JoinColumn(name = "clase_id")
    private Clase clase;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getFechaAsistencia() {
        return fechaAsistencia;
    }

    public void setFechaAsistencia(LocalDateTime fechaAsistencia) {
        this.fechaAsistencia = fechaAsistencia;
    }

    public Boolean getPresente() {
        return presente;
    }

    public void setPresente(Boolean presente) {
        this.presente = presente;
    }

}
