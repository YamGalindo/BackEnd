package dao;

import modelo.Odontologo;

import java.sql.*;
import java.util.ArrayList;


public class OdontologoDao implements Dao<Odontologo>{


    @Override
    public Odontologo guardar(Odontologo odontologo) {
        Connection connection = null;
        try {
            connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO odontologos (numeroMatricula, nombre, apellido) VALUES (?,?,?)");
            preparedStatement.setString(1, odontologo.getNumeroMatricula());
            preparedStatement.setString(2, odontologo.getNombre());
            preparedStatement.setString(3, odontologo.getApellido());
            preparedStatement.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
            }
            catch (SQLException t){
                t.printStackTrace();
            }
            return odontologo;

        }
    }

    public ArrayList<Odontologo> consultar(){
        Connection connection = null;
        Odontologo odontologo = null;
        ArrayList<Odontologo> odontologos = new ArrayList<Odontologo>();

        try{
            connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM ODONTOLOGOS");

            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                odontologo = new Odontologo(rs.getInt(1), rs.getString(2),rs.getString(3), rs.getString(4));
                odontologos.add(odontologo);
            }
            return odontologos;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
            }
            catch (SQLException t){
                t.printStackTrace();
            }
        }
        return null;
    }

    public static Connection getConnection()throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/Parcial","Yam","");
    }
}
