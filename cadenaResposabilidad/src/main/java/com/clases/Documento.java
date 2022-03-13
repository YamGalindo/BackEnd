package com.clases;

public class Documento {
    
    private int tipoAcceso;
    private String contenido;

    public Documento(int tipoAcceso, String contenido){

        this.tipoAcceso = tipoAcceso;
        this.contenido = contenido;

    }

    public int gettipoAcceso(){
        return this.tipoAcceso;
    }
    
    public String getcontenido(){

        return this.contenido;

    }

}
