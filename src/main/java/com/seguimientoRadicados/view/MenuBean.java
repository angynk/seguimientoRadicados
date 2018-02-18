package com.seguimientoRadicados.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import java.io.IOException;

@ManagedBean(name="menu")
@SessionScoped
public class MenuBean {

    public void refreshInsertarRadicados(){
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        try {
            ec.redirect(ec.getRequestContextPath()
                    + "/secured/insertarRadicados.xhtml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void refreshTramitarRadicados(){
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        try {
            ec.redirect(ec.getRequestContextPath()
                    + "/secured/tramitarRadicados.xhtml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void refreshConsultarDatos(){
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        try {
            ec.redirect(ec.getRequestContextPath()
                    + "/secured/configTareas.xhtml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
