import baseDatos.BD;

import dao.OdontologoDao;
import modelo.Odontologo;
import service.OdontologoService;

public class Main {
    public static void main(String[] args)throws Exception {

        OdontologoService odontologoService = new OdontologoService(new OdontologoDao());
        BD.crearBD();

        Odontologo odontologo = new Odontologo("123123","Pepe", "Perez");
        odontologoService.guardar(odontologo);
        Odontologo odontologo1 = new Odontologo("122123","Pedro", "Perez");
        odontologoService.guardar(odontologo1);

        System.out.println(odontologoService.consultar());

    }
}
