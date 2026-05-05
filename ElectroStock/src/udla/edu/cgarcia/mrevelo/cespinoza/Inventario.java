package udla.edu.cgarcia.mrevelo.cespinoza;

public class Inventario {
    private int id;
    private String name;
    private String provider;
    private  int stock;
    private  int minStock;
    private  int maxStock;
    private  double price;
    private static int contID=1;


    /**Genero los constructores*/

    public Inventario() {
    }

    public Inventario(String name, String provider, int stock, int minStock, int maxStock, double price) {
        this.id = contID++;
        this.name = name;
        this.provider = provider;
        this.stock = stock;
        this.minStock = minStock;
        this.maxStock = maxStock;
        this.price = price;
    }

    public Inventario(String name, String provider, int stock, int minStock, int maxStock) {
        this.id = contID++;
        this.name = name;
        this.provider = provider;
        this.stock = stock;
        this.minStock = minStock;
        this.maxStock = maxStock;
    }

    public Inventario(String name, String provider, int stock) {
        this.id = contID++;
        this.name = name;
        this.provider = provider;
        this.stock = stock;
    }

    public Inventario(String name, String provider) {
        this.id = contID++;
        this.name = name;
        this.provider = provider;
    }

    /**Genero los metodos de JAVA*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getMinStock() {
        return minStock;
    }

    public void setMinStock(int minStock) {
        this.minStock = minStock;
    }

    public int getMaxStock() {
        return maxStock;
    }

    public void setMaxStock(int maxStock) {
        this.maxStock = maxStock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**Genero mis metdos propios*/

    /**Se imprime la informacion*/
    @Override
    public String toString() {
        return "ID: " + getId() +
                " | Nombre: " + getName() +
                " | Proveedor: " + getProvider() +
                " | Stock: " + getStock() +
                " | Min Stock: " + getMinStock() +
                " | Max Stock: " + getMaxStock() +
                " | Precio: $" + getPrice();
    }


}
