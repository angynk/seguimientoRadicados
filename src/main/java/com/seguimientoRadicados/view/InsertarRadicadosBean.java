package com.seguimientoRadicados.view;

import com.seguimientoRadicados.model.services.InsertarRadicadosServicios;
import org.primefaces.model.UploadedFile;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.IOException;

@ManagedBean(name="insertarBean")
@ViewScoped
public class InsertarRadicadosBean {

    private UploadedFile file;

    @ManagedProperty(value="#{InsertarRadicadosServicios}")
    private InsertarRadicadosServicios insertarRadicadosServicios;

    @ManagedProperty("#{MessagesView}")
    private MessagesView messagesView;

    public InsertarRadicadosBean() {
    }

    public void cargarDatos(){
        if(file!=null){
            try {
                String nombre = insertarRadicadosServicios.copyFile(file.getFileName(),file.getInputstream());
            } catch (IOException e) {
                messagesView.error("Error en la carga del archivo",e.getMessage());
            }
        }
    }

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public InsertarRadicadosServicios getInsertarRadicadosServicios() {
        return insertarRadicadosServicios;
    }

    public void setInsertarRadicadosServicios(InsertarRadicadosServicios insertarRadicadosServicios) {
        this.insertarRadicadosServicios = insertarRadicadosServicios;
    }

    public MessagesView getMessagesView() {
        return messagesView;
    }

    public void setMessagesView(MessagesView messagesView) {
        this.messagesView = messagesView;
    }
}
