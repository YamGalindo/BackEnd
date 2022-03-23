package baseDatos;

import java.sql.Connection;
import java.sql.DriverManager;

public class BD {
    public static void crearBD() throws Exception{
        Connection conection = null;
        try{
            Class.forName("org.h2.Driver").newInstance();
            conection = DriverManager.getConnection(
                    "jdbc:h2:~/Parcial;INIT=RUNSCRIPT FROM 'create.sql'","Yam","");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            conection.close();
        }
    }
}
