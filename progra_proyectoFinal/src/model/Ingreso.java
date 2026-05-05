public class Ingreso extends Movimiento {

    public Ingreso(double monto, String descripcion) {
        super(monto, descripcion);
    }

    @Override
    public double procesarSaldo(double saldoActual) {
        return saldoActual + monto; // SUMA dinero
    }
}