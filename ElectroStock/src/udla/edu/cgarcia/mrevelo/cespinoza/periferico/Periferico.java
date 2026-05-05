package udla.edu.cgarcia.mrevelo.cespinoza.periferico;
import udla.edu.cgarcia.mrevelo.cespinoza.Inventario;

public class Periferico extends Inventario {

    private TipoPeriferico tipoPeriferico;
    private Conexion conexion;
    private int warrantyMonts;


    /**Generamos los constructores*/
    public Periferico() {
    }

    // Constructor principal
    public Periferico(String name, String provider, int stock, double price,
                      TipoPeriferico tipo, Conexion conexion, int warrantyMonths) {
        super(name, provider, stock);
        setPrice(price);
        this.tipoPeriferico = tipo;
        this.conexion = conexion;
        this.warrantyMonts = warrantyMonths;
    }

    // Constructor secundario, diferente firma (por ejemplo sin price)
    public Periferico(String name, String provider, int stock,
                      TipoPeriferico tipo, Conexion conexion, int warrantyMonths) {
        super(name, provider, stock);
        this.tipoPeriferico = tipo;
        this.conexion = conexion;
        this.warrantyMonts = warrantyMonths;
    }



    /**Generamos los metodos de JAVA*/

    public TipoPeriferico getTipoPeriferico() {
        return tipoPeriferico;
    }

    public void setTipoPeriferico(TipoPeriferico tipoPeriferico) {
        this.tipoPeriferico = tipoPeriferico;
    }

    public Conexion getConexion() {
        return conexion;
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }

    public int getWarrantyMonts() {
        return warrantyMonts;
    }

    public void setWarrantyMonts(int warrantyMonts) {
        this.warrantyMonts = warrantyMonts;
    }


    /**Generamos metodos propios*/
    /**El override permite que se sobreescriba la informacion que viene de la clase Inventario*/
    @Override
        public String toString() {

        /**se llama al toString de la clase Inventario*/
        return super.toString() +
                /**Se añaden los atributos de periferico*/
                " | Tipo Periférico: " + getTipoPeriferico() +
                " | Conexión: " + getConexion() +
                " | Garantía: " + getWarrantyMonts() + " meses";
    }

}
