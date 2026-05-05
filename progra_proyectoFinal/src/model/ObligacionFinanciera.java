package model;

public abstract class ObligacionFinanciera {
    // Usamos protected para que las clases hijas puedan acceder a estas variables
    protected int id;
    protected int clienteId;
    protected double montoOriginal;
    protected String descripcion;
    protected boolean pagado;

    public ObligacionFinanciera(int id, int clienteId, double montoOriginal, String descripcion) {
        this.id = id;
        this.clienteId = clienteId;
        this.montoOriginal = montoOriginal;
        this.descripcion = descripcion;
        this.pagado = false; // Por defecto no está pagada
    }

    // Método abstracto: Las hijas DEBEN implementar cómo se calcula el total
    public abstract double calcularTotalAPagar();

    // Getters y Setters necesarios

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public double getMontoOriginal() {
        return montoOriginal;
    }

    public void setMontoOriginal(double montoOriginal) {
        this.montoOriginal = montoOriginal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }
}