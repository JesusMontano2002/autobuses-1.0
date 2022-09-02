import java.util.List;

public class Linea {
    String nombre;
    List<Autobus> autobuses;
    //Metodo constructor
    public Linea(String nombre,List<Autobus> autobuses ){
        this.nombre = nombre;
        this.autobuses = autobuses;
    }
}
