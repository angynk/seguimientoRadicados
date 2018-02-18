package com.seguimientoRadicados.model.entity;

public class Radicado {

    private Integer numero;
    private String estado;


    public Radicado() {
    }

    public Radicado(Integer numero, String estado) {
        this.numero = numero;
        this.estado = estado;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
