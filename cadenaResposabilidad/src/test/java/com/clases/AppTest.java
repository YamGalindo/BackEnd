package com.clases;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    @Test
    public void probarProcesarDocumentosAccesLvl1(){
        Documento documento = new Documento(1, "hola");

        User user1 = new Diputado("xd");
        User user2 = new Ministro("xd2");
        User user3 = new Presidente("xd3");

        user1.setsiguienteUsuario(user2);
        user2.setsiguienteUsuario(user3);


        Assert.assertEquals("xdhola\nxd2hola\nxd3hola\n",user1.procesarDocumento(documento));
    }


}
