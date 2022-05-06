package com.clases;

public class App {
    public static void main( String[] args ) {

        Documento saludo = new Documento(1, "hola");

        User diputado = new Diputado("Soy un diputado");
        User ministro = new Ministro("Soy un ministro");
        User presidente = new Presidente("Soy un Presidente");

        diputado.setsiguienteUsuario(ministro);
        ministro.setsiguienteUsuario(presidente);

        diputado.procesarDocumento(saludo);
    }
}
