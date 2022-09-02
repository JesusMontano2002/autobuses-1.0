import java.util.Date;

public class Insidencia {
    Date fecha;
    Double costo;
    String descripcion;
    String tipo;
    //metodo constructor
    public Insidencia(Date fecha,Double costo, String descripcion, String tipo ){
        this.fecha = fecha;
        this.costo = costo;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }
}
