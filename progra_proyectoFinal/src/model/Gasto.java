
public class Gasto extends Movimiento {

    public Gasto(double monto, String descripcion) {
        super(monto, descripcion);
    }

    @Override
    public double procesarSaldo(double saldoActual) {
        return saldoActual - monto; // RESTA dinero
    }
}