package com.seguimientoRadicados.view;

import com.seguimientoRadicados.model.entity.Radicado;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ManagedBean(name="tramitarBean")
@ViewScoped
public class TramitarRadicadosBean {

    private boolean verBusqueda;
    private boolean verResultados;
    private Date fechaInicio;
    private Date fechaFin;
    private List<Radicado> radicadosLista;
    private Radicado radicadoSeleccionado;


    public TramitarRadicadosBean() {
    }

    @PostConstruct
    public void init() {
        verBusqueda = true;
        verResultados = false;
    }

    public void buscarRadicados(){
        verBusqueda = false;
        verResultados = true;
        radicadoSeleccionado = new Radicado();
        radicadosLista = new ArrayList<>();
        radicadosLista.add(new Radicado(1245878,"Activo"));
        radicadosLista.add(new Radicado(2221,"Archivado"));
        radicadosLista.add(new Radicado(858911,"Activo"));
        radicadosLista.add(new Radicado(858911,"Activo"));
        radicadosLista.add(new Radicado(858911,"Activo"));
        radicadosLista.add(new Radicado(858911,"Activo"));
        radicadosLista.add(new Radicado(858911,"Activo"));
        radicadosLista.add(new Radicado(858911,"Activo"));
        radicadosLista.add(new Radicado(858911,"Activo"));
        radicadosLista.add(new Radicado(858911,"Activo"));
        radicadosLista.add(new Radicado(858911,"Activo"));
        radicadosLista.add(new Radicado(858911,"Activo"));
        radicadosLista.add(new Radicado(858911,"Activo"));
        radicadosLista.add(new Radicado(858911,"Activo"));
    }

    public boolean isVerBusqueda() {
        return verBusqueda;
    }

    public void setVerBusqueda(boolean verBusqueda) {
        this.verBusqueda = verBusqueda;
    }

    public boolean isVerResultados() {
        return verResultados;
    }

    public void setVerResultados(boolean verResultados) {
        this.verResultados = verResultados;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<Radicado> getRadicadosLista() {
        return radicadosLista;
    }

    public void setRadicadosLista(List<Radicado> radicadosLista) {
        this.radicadosLista = radicadosLista;
    }

    public Radicado getRadicadoSeleccionado() {
        return radicadoSeleccionado;
    }

    public void setRadicadoSeleccionado(Radicado radicadoSeleccionado) {
        this.radicadoSeleccionado = radicadoSeleccionado;
    }
}
