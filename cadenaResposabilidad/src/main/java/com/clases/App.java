package com.clases;

public class App {
    public static void main( String[] args ) {

        Documento documento = new Documento(1, "hola");

        User user1 = new Diputado("xd");
        User user2 = new Ministro("xd2");
        User user3 = new Presidente("xd3");

        user1.setsiguienteUsuario(user2);
        user2.setsiguienteUsuario(user3);


        user1.procesarDocumento(documento);
    }
}
