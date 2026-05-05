
public class Deuda extends model.ObligacionFinanciera {

    public Deuda(int id, int clienteId, double monto, String descripcion) {
        super(id, clienteId, monto, descripcion);
    }

    @Override
    public double calcularTotalAPagar() {
        // En una deuda simple, el total es igual al monto original
        return this.montoOriginal;
    }
}