package com.clases;

public class Presidente extends User{

    private int nivelAcceso = 3;

    public Presidente(String nombre) {
        setNivelAcceso(this.nivelAcceso);
        setNombre(nombre);

    }

    @Override
    public String procesarDocumento(Documento documento) {
        return super.procesarDocumento(documento);
    }
}
