package com.clases;

public abstract class User {

    private User siguienteUsuario;
    private int nivelAcceso;
    private String nombre;

    public String procesarDocumento(Documento documento) {

        String respuesta = "";

        if (this.getNivelAcceso() >= documento.gettipoAcceso()) {

            respuesta += this.getNombre() + documento.getcontenido() + "\n";

        }
        User siguiente = this.getSiguienteUsuario();
        while (siguiente != null) {
            if (siguiente.getNivelAcceso() >= documento.gettipoAcceso()) {
                respuesta += siguiente.getNombre() + documento.getcontenido() + "\n";
            }
            siguiente = siguiente.getSiguienteUsuario();
        }
        System.out.println(respuesta);
        return respuesta;
    }

    public User getSiguienteUsuario() {
        return siguienteUsuario;
    }

    public void setsiguienteUsuario(User user) {
        this.siguienteUsuario = user;
    }

    public int getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(int nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
