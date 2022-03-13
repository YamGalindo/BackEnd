package com.clases;

public class Diputado extends User{

    private int nivelAcceso = 1;

    public Diputado(String nombre) {
        setNivelAcceso(this.nivelAcceso);
        setNombre(nombre);
    }

    @Override
    public String procesarDocumento(Documento documento) {
        return super.procesarDocumento(documento);
    }
}

