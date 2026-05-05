package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private int id;
    private String nombre;
    private String password;
    private double dinero; // Saldo actual

    // Listas Polimórficas: Guardan cualquier tipo de hijo (Deuda/Prestamo o Ingreso/Gasto)
    private List<ObligacionFinanciera> misObligaciones;
    private List<Movimiento> historialMovimientos;

    public Cliente(int id, String nombre, String password, double dinero) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.dinero = dinero;

        // Es MUY importante inicializar las listas en el constructor
        this.misObligaciones = new ArrayList<>();
        this.historialMovimientos = new ArrayList<>();
    }

    // --- Lógica de Negocio ---

    // Este método recibe 'Movimiento', así que acepta tanto Ingreso como Gasto
    public void registrarMovimiento(Movimiento nuevoMovimiento) {
        // 1. Lo guardamos en el historial
        this.historialMovimientos.add(nuevoMovimiento);

        // 2. Actualizamos el saldo automáticamente usando polimorfismo
        // El objeto 'nuevoMovimiento' sabe si debe sumar o restar
        this.dinero = nuevoMovimiento.procesarSaldo(this.dinero);
    }

    // Agrega Deudas o Préstamos a la lista
    public void agregarObligacion(ObligacionFinanciera obligacion) {
        this.misObligaciones.add(obligacion);
    }

    // --- Getters ---
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getPassword() { return password; }
    public double getDinero() { return dinero; }

    public List<ObligacionFinanciera> getMisObligaciones() { return misObligaciones; }
    public List<Movimiento> getHistorialMovimientos() { return historialMovimientos; }
}