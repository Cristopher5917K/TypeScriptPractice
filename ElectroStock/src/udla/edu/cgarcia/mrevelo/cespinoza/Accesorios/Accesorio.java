package udla.edu.cgarcia.mrevelo.cespinoza.Accesorios;

import udla.edu.cgarcia.mrevelo.cespinoza.Inventario;

public class Accesorio extends Inventario {
    private Tipo tipo;
    private String material;
    private  String color;
    private String compatibilidad;

    /**Generamos los constructores*/
    public Accesorio() {
    }

    public Accesorio(String name, String provider, int stock, double price,
                     Tipo tipo, String material, String color, String compatibilidad) {
        super(name, provider, stock); // ID automático
        setPrice(price);
        this.tipo = tipo;
        this.material = material;
        this.color = color;
        this.compatibilidad = compatibilidad;
    }



    /**Generamos los metodos de JAVA*/
    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCompatibilidad() {
        return compatibilidad;
    }

    public void setCompatibilidad(String compatibilidad) {
        this.compatibilidad = compatibilidad;
    }

    /**Genero metodos propios*/

    /**El override permite que se sobreescriba la informacion que viene de la clase Inventario*/
    @Override
    public String toString() {

        /**se llama al toString de la clase padre*/
        return super.toString() +
                /**Se añaden los atributos de accesorio*/
                " | Tipo: " + getTipo() +
                " | Material: " + getMaterial() +
                " | Color: " + getColor() +
                " | Compatibilidad: " + getCompatibilidad();
    }

}
