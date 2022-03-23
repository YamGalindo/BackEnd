package service;

import dao.Dao;

import modelo.Odontologo;


import java.util.ArrayList;

public class OdontologoService {
    private Dao<Odontologo> odontologoDao;

    public OdontologoService(Dao<Odontologo> odontologoDao){
        this.odontologoDao = odontologoDao;
    }

    public Odontologo guardar(Odontologo odontologo){
        return odontologoDao.guardar(odontologo);

    }

    public ArrayList<Odontologo> consultar(){
        return odontologoDao.consultar();
    }
}
