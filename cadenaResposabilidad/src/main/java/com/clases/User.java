package com.clases;

public abstract class User {

    private User siguienteUsuario;
    private int nivelAcceso;
    private String nombre;

    public User(String nombre, int nivelAcceso){
        this.nombre = nombre;
        this.nivelAcceso = nivelAcceso;
    }

    public String procesarDocumento(Documento documento) {

        String respuesta = "";

        if (this.hasAcceso(documento)) {

            respuesta += this.getNombreConDocumento(documento);

        }
        User siguiente = this.getSiguienteUsuario();
        while (siguiente != null) {
            if (siguiente.hasAcceso(documento)) {
                respuesta += siguiente.getNombreConDocumento(documento);
            }
            siguiente = siguiente.getSiguienteUsuario();
        }

        return respuesta;
    }

    private boolean hasAcceso(Documento documento){
        return this.getNivelAcceso() >= documento.gettipoAcceso();
    }

    private String getNombreConDocumento(Documento documento){
        return this.getNombre() + " " + documento.getcontenido() + "\n";
    }

    private User getSiguienteUsuario() {
        return siguienteUsuario;
    }

    public void setsiguienteUsuario(User user) {
        this.siguienteUsuario = user;
    }

    private int getNivelAcceso() {
        return nivelAcceso;
    }

    private String getNombre() {
        return nombre;
    }

}
