package com.dber.gym.data;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "miembro")
public class Miembro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private String dui;

    @Column
    private String telefono;

    @Column
    private String direccion;
    
    @Column
    private String genero;

    // Relationships
    // 1- Un Miembro puede tener muchas membresías y una Membresía activa. (uno a muchos)
    @OneToMany(mappedBy = "miembro", cascade = CascadeType.ALL)
    private List<Membresia> membresias;

    // 3- Un Miembro puede asistir a muchas Clases a través de AsistenciaClase. (muchos a muchos) 
    @OneToMany(mappedBy = "miembro", cascade = CascadeType.ALL)
    private List<AsistenciaClase> asistenciasClases;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}