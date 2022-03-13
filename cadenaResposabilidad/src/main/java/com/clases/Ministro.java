package com.clases;

public class Ministro extends User{

    private int nivelAcceso = 2;

    public Ministro(String nombre) {
        setNivelAcceso(this.nivelAcceso);
        setNombre(nombre);

    }

    @Override
    public String procesarDocumento(Documento documento) {
        return super.procesarDocumento(documento);
    }

}
