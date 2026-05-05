public class Prestamo extends model.ObligacionFinanciera {
    private double tasaInteres; // Ejemplo: 0.15 para 15%

    public Prestamo(int id, int clienteId, double monto, String descripcion, double tasaInteres) {
        super(id, clienteId, monto, descripcion);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public double calcularTotalAPagar() {
        // El total incluye el interés
        return this.montoOriginal + (this.montoOriginal * this.tasaInteres);
    }

    public double getTasaInteres() { return tasaInteres; }
}