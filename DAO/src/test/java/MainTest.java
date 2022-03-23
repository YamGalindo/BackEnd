import baseDatos.BD;
import dao.OdontologoDao;
import modelo.Odontologo;
import org.junit.Assert;
import org.junit.Test;
import service.OdontologoService;

public class MainTest {

    @Test
    public void ProbarRetornoConsultar() throws Exception {

        OdontologoService odontologoService = new OdontologoService(new OdontologoDao());
        BD.crearBD();

        Odontologo odontologo = new Odontologo("123123","Pepe", "Perez");
        odontologoService.guardar(odontologo);
        Odontologo odontologo1 = new Odontologo("122123","Pedro", "Perez");
        odontologoService.guardar(odontologo1);

        odontologoService.consultar();


        Assert.assertTrue(odontologoService.consultar() != null);
    }

}
