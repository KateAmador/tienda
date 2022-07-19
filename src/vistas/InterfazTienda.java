package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JSeparator;

public class InterfazTienda extends JFrame {

	private JPanel contentPane;
	private JTextField txtIDEntrada;
	private JTextField txtIdDelProducto;
	private JTextField txtCantidad;
	private JTextField txtFactura;
	private JTextField txtFecha;
	private JTextField txtValorDeLaCompra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazTienda frame = new InterfazTienda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterfazTienda() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblPanel = new JLabel("");
		// lblPanel.setIcon(new ImageIcon(InterfazTienda.class.getResource("/icons/panel
		// 2.jpg")));
		lblPanel.setBounds(0, 0, 220, 461);
		contentPane.add(lblPanel);

		JLabel lblEntrada = new JLabel("Entrada");
		lblEntrada.setFont(new Font("Modern No. 20", Font.ITALIC, 20));
		lblEntrada.setBounds(462, 11, 86, 38);
		contentPane.add(lblEntrada);

		JLabel lblIDEntrada = new JLabel("ID_Entrada");
		lblIDEntrada.setFont(new Font("Modern No. 20", Font.PLAIN, 17));
		lblIDEntrada.setBounds(247, 86, 111, 14);
		contentPane.add(lblIDEntrada);

		JLabel lblIDProducto = new JLabel("ID Producto");
		lblIDProducto.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		lblIDProducto.setBounds(247, 140, 86, 30);
		contentPane.add(lblIDProducto);

		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		lblCantidad.setBounds(247, 200, 86, 25);
		contentPane.add(lblCantidad);

		JLabel lblFactura = new JLabel("Factura");
		lblFactura.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		lblFactura.setBounds(247, 257, 86, 25);
		contentPane.add(lblFactura);

		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		lblFecha.setBounds(247, 318, 86, 25);
		contentPane.add(lblFecha);

		JLabel lblValorDeCompra = new JLabel("Valor de Compra");
		lblValorDeCompra.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		lblValorDeCompra.setBounds(247, 364, 111, 25);
		contentPane.add(lblValorDeCompra);

		txtIDEntrada = new JTextField();
		txtIDEntrada.setBorder(null);
		txtIDEntrada.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		txtIDEntrada.setText("Id de la entrada");
		txtIDEntrada.setForeground(Color.LIGHT_GRAY);
		txtIDEntrada.setBounds(368, 85, 122, 20);
		contentPane.add(txtIDEntrada);
		txtIDEntrada.setColumns(10);

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(367, 108, 134, 13);
		contentPane.add(separator);

		txtIdDelProducto = new JTextField();
		txtIdDelProducto.setText("Id del producto");
		txtIdDelProducto.setForeground(Color.LIGHT_GRAY);
		txtIdDelProducto.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		txtIdDelProducto.setColumns(10);
		txtIdDelProducto.setBorder(null);
		txtIdDelProducto.setBounds(368, 145, 122, 20);
		contentPane.add(txtIdDelProducto);

		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(367, 168, 134, 13);
		contentPane.add(separator_1);

		txtCantidad = new JTextField();
		txtCantidad.setText("Cantidad");
		txtCantidad.setForeground(Color.LIGHT_GRAY);
		txtCantidad.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		txtCantidad.setColumns(10);
		txtCantidad.setBorder(null);
		txtCantidad.setBounds(368, 202, 122, 20);
		contentPane.add(txtCantidad);

		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBounds(368, 224, 134, 13);
		contentPane.add(separator_1_1);

		txtFactura = new JTextField();
		txtFactura.setText("Factura");
		txtFactura.setForeground(Color.LIGHT_GRAY);
		txtFactura.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		txtFactura.setColumns(10);
		txtFactura.setBorder(null);
		txtFactura.setBounds(367, 259, 122, 20);
		contentPane.add(txtFactura);

		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setForeground(Color.BLACK);
		separator_1_1_1.setBounds(368, 282, 134, 13);
		contentPane.add(separator_1_1_1);

		txtFecha = new JTextField();
		txtFecha.setText("Fecha");
		txtFecha.setForeground(Color.LIGHT_GRAY);
		txtFecha.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		txtFecha.setColumns(10);
		txtFecha.setBorder(null);
		txtFecha.setBounds(368, 320, 122, 20);
		contentPane.add(txtFecha);

		JSeparator separator_1_1_1_1 = new JSeparator();
		separator_1_1_1_1.setForeground(Color.BLACK);
		separator_1_1_1_1.setBounds(367, 341, 134, 13);
		contentPane.add(separator_1_1_1_1);

		txtValorDeLaCompra = new JTextField();
		txtValorDeLaCompra.setText("Valor de la Compra");
		txtValorDeLaCompra.setForeground(Color.LIGHT_GRAY);
		txtValorDeLaCompra.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		txtValorDeLaCompra.setColumns(10);
		txtValorDeLaCompra.setBorder(null);
		txtValorDeLaCompra.setBounds(368, 367, 122, 20);
		contentPane.add(txtValorDeLaCompra);

		JSeparator separator_1_1_1_1_1 = new JSeparator();
		separator_1_1_1_1_1.setForeground(Color.BLACK);
		separator_1_1_1_1_1.setBounds(368, 391, 134, 13);
		contentPane.add(separator_1_1_1_1_1);

		JLabel lblBarra = new JLabel("");
		//lblBarra.setIcon(new ImageIcon(InterfazTienda.class.getResource("/icons/fondo3.jpg")));
		lblBarra.setBackground(new Color(240, 255, 240));
		lblBarra.setBounds(219, 0, 565, 49);
		contentPane.add(lblBarra);

		JPanel btnIngresar = new JPanel();
		btnIngresar.setBounds(247, 410, 80, 25);
		contentPane.add(btnIngresar);

		JLabel lblIngresar = new JLabel("Ingresar");
		lblIngresar.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		btnIngresar.add(lblIngresar);

		JPanel btnBorrar = new JPanel();
		btnBorrar.setBounds(368, 410, 80, 25);
		contentPane.add(btnBorrar);

		JLabel lblBorrar = new JLabel("Borrar");
		lblBorrar.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		btnBorrar.add(lblBorrar);

		JPanel btnBuscar = new JPanel();
		btnBuscar.setBounds(498, 410, 80, 25);
		contentPane.add(btnBuscar);

		JLabel lblBuscar = new JLabel("Buscar");
		lblBuscar.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		btnBuscar.add(lblBuscar);

		JPanel btnActualizar = new JPanel();
		btnActualizar.setBounds(607, 410, 80, 25);
		contentPane.add(btnActualizar);

		JLabel lblActualizar = new JLabel("Actualizar");
		lblActualizar.setFont(new Font("Modern No. 20", Font.PLAIN, 15));
		btnActualizar.add(lblActualizar);
	}
}
