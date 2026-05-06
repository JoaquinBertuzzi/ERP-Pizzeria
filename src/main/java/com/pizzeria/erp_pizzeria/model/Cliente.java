package com.pizzeria.erp_pizzeria.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name= "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private int telefono;
    private LocalDateTime horaRecogida;

    public Cliente(int id, String nombre, int telefono, LocalDateTime horaRecogida) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.horaRecogida = horaRecogida;
    }

    public Cliente() {}

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public LocalDateTime getHoraRecogida() {
        return horaRecogida;
    }
    public void setHoraRecogida(LocalDateTime horaRecogida) {
        this.horaRecogida = horaRecogida;
    }
}
