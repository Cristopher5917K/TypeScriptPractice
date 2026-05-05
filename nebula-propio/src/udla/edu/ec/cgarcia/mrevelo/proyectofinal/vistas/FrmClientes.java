package vista;

import udla.edu.ec.cgarcia.mrevelo.proyectofinal.conexion.ConexionMySQL;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FrmClientes extends JFrame {

    private JTable tabla;
    private DefaultTableModel modelo;

    private JTextField txtNombre;
    private JTextField txtPassword;
    private JTextField txtDinero;
    private JTextField txtInfo;
    private JComboBox<String> cbTipo;

    public FrmClientes() {
        setTitle("Gestión de Clientes");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // ===== FORMULARIO =====
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(20, 20, 80, 25);
        add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(100, 20, 150, 25);
        add(txtNombre);

        JLabel lblPass = new JLabel("Password:");
        lblPass.setBounds(20, 55, 80, 25);
        add(lblPass);

        txtPassword = new JTextField();
        txtPassword.setBounds(100, 55, 150, 25);
        add(txtPassword);

        JLabel lblDinero = new JLabel("Dinero:");
        lblDinero.setBounds(20, 90, 80, 25);
        add(lblDinero);

        txtDinero = new JTextField();
        txtDinero.setBounds(100, 90, 150, 25);
        add(txtDinero);

        JLabel lblInfo = new JLabel("Info:");
        lblInfo.setBounds(20, 125, 80, 25);
        add(lblInfo);

        txtInfo = new JTextField();
        txtInfo.setBounds(100, 125, 150, 25);
        add(txtInfo);

        JLabel lblTipo = new JLabel("Tipo:");
        lblTipo.setBounds(20, 160, 80, 25);
        add(lblTipo);

        cbTipo = new JComboBox<>(new String[]{"CUMPLIDO", "NOTAR"});
        cbTipo.setBounds(100, 160, 150, 25);
        add(cbTipo);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(100, 200, 100, 30);
        add(btnGuardar);

        // ===== TABLA =====
        modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Dinero");
        modelo.addColumn("Tipo");

        tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(300, 20, 360, 300);
        add(scroll);

        // Eventos
        btnGuardar.addActionListener(e -> insertarCliente());

        cargarClientes();
        setLocationRelativeTo(null);
    }

    // =========================
    // INSERTAR CLIENTE
    // =========================
    private void insertarCliente() {

        String sql = "INSERT INTO cliente(nombre, password, dinero, informacion, tipo) VALUES (?, ?, ?, ?, ?)";

        try (Connection con = ConexionMySQL.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, txtNombre.getText());
            ps.setString(2, txtPassword.getText());
            ps.setDouble(3, Double.parseDouble(txtDinero.getText()));
            ps.setString(4, txtInfo.getText());
            ps.setString(5, cbTipo.getSelectedItem().toString());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "✅ Cliente guardado");
            limpiar();
            cargarClientes();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "❌ Error al guardar: " + e.getMessage());
        }
    }

    // =========================
    // CARGAR CLIENTES
    // =========================
    private void cargarClientes() {

        modelo.setRowCount(0);
        String sql = "SELECT id, nombre, dinero, tipo FROM cliente";

        try (Connection con = ConexionMySQL.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Object[] fila = {
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getDouble("dinero"),
                        rs.getString("tipo")
                };
                modelo.addRow(fila);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar clientes");
        }
    }

    private void limpiar() {
        txtNombre.setText("");
        txtPassword.setText("");
        txtDinero.setText("");
        txtInfo.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FrmClientes().setVisible(true));
    }
}
