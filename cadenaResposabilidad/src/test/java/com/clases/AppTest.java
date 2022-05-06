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


        Assert.assertEquals("xd hola\nxd2 hola\nxd3 hola\n",user1.procesarDocumento(documento));
    }

    @Test
    public void probarProcesarDocumentosAccesLvl2(){
        Documento unPocoMasSeguro  = new Documento(2, "Cuasi-clasificado");

        User diputado = new Diputado("Soy dipudato");
        User ministro1 = new Ministro("Soy ministro1");
        User presidente = new Presidente("Soy el presidente");
        User ministro2 = new Ministro("Soy ministro2");

        String esperado = "Soy ministro1 Cuasi-clasificado\n"
            + "Soy el presidente Cuasi-clasificado\n"
            + "Soy ministro2 Cuasi-clasificado\n";

        diputado.setsiguienteUsuario(ministro1);
        ministro1.setsiguienteUsuario(presidente);
        presidente.setsiguienteUsuario(ministro2);

        Assert.assertEquals(esperado, diputado.procesarDocumento(unPocoMasSeguro));
    }


}
