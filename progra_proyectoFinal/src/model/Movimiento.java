import java.time.LocalDate;

public abstract class Movimiento {
    protected double monto;
    protected LocalDate fecha;
    protected String descripcion;

    public Movimiento(double monto, String descripcion) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.fecha = LocalDate.now(); // Toma la fecha actual del sistema
    }

    // Método abstracto: Decide si suma o resta al saldo
    public abstract double procesarSaldo(double saldoActual);

    // Getters
    public double getMonto() { return monto; }
    public String getDescripcion() { return descripcion; }
    public LocalDate getFecha() { return fecha; }
}