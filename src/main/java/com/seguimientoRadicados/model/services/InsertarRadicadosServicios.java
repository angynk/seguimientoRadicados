package com.seguimientoRadicados.model.services;

import com.seguimientoRadicados.view.util.PathFiles;
import com.seguimientoRadicados.view.util.ProcessorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;

@Service("InsertarRadicadosServicios")
public class InsertarRadicadosServicios {

    @Autowired
    private ProcessorUtils processorUtils;

    public String copyFile(String fileName, InputStream in) {
        processorUtils.copyFile(fileName,in, PathFiles.PATH);
        return fileName;
    }
}
