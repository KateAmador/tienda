package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Label;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.DropMode;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FacturaVista extends JFrame {

	public JPanel contentPane;
	public JTextField FacturaID;
	public JTextField ClienteID;
	public JTextField cantidad;
	public JTextField total;
	public JTextField fecha;
	public JButton btnGuardar;
	public JButton btnBuscar;
	public JButton Borrar;
	public JButton Actualizar;
	public JLabel lbl_aviso;
	public JLabel aviso1;
	public JLabel aviso2;
	public JLabel aviso3;
	public JLabel aviso4;
	public JLabel aviso5;
	
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FacturaVista frame = new FacturaVista();
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
	public FacturaVista() {
		setBackground(Color.WHITE);
		setTitle("Factura\r\n");


		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 470, 475);

		

		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 0, 521, 492);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		lbl_aviso = new JLabel("porfavor llene todos los campos");
		lbl_aviso.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbl_aviso.setForeground(Color.RED);
		lbl_aviso.setBounds(220, 58, 208, 28);
		lbl_aviso.setVisible(false);
		panel_2.add(lbl_aviso);
		
		
		Borrar = new JButton("Borrar");
		Borrar.setBackground(Color.WHITE);
		Borrar.setBounds(319, 390, 89, 23);
		panel_2.add(Borrar);
		
		JLabel Factura_ID = new JLabel("Factura_ID");
		Factura_ID.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		Factura_ID.setBounds(22, 100, 64, 14);
		panel_2.add(Factura_ID);
		
		JLabel Cliente_ID = new JLabel("Cliente_fk");
		Cliente_ID.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		Cliente_ID.setBounds(22, 156, 56, 14);
		panel_2.add(Cliente_ID);
		
		JLabel Cantidad = new JLabel("Cantidad");
		Cantidad.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		Cantidad.setBounds(22, 216, 46, 14);
		panel_2.add(Cantidad);
		
		JLabel Total = new JLabel("Total");
		Total.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		Total.setBounds(22, 279, 39, 14);
		panel_2.add(Total);
		
		JLabel Fecha = new JLabel("Fecha");
		Fecha.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		Fecha.setBounds(22, 346, 56, 14);
		panel_2.add(Fecha);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBackground(Color.WHITE);
		btnGuardar.setBounds(22, 390, 89, 23);
		panel_2.add(btnGuardar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBackground(Color.WHITE);
		btnBuscar.setBounds(220, 390, 89, 23);
		panel_2.add(btnBuscar);
		
		Actualizar = new JButton("Actualizar");
		Actualizar.setBackground(Color.WHITE);
		Actualizar.setBounds(121, 390, 89, 23);
		panel_2.add(Actualizar);
		
		FacturaID = new JTextField();
		FacturaID.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char validacion = e.getKeyChar();
				if(Character.isLetter(validacion)) {
					e.consume();
					aviso1.setVisible(true);
				}
			}
		});
		FacturaID.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(FacturaID.getText().trim().isEmpty()) {
					lbl_aviso.setVisible(true);
				}else {
					lbl_aviso.setVisible(false);
				}
			}
		});
		FacturaID.setBackground(Color.WHITE);
		FacturaID.setDropMode(DropMode.INSERT);
		FacturaID.setBounds(96, 97, 206, 20);
		panel_2.add(FacturaID);
		FacturaID.setColumns(10);
		ClienteID = new JTextField();
		ClienteID.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				char validacion = e.getKeyChar();
				if(Character.isLetter(validacion)) {
					e.consume();
					aviso2.setVisible(true);
				}
			}
		});
		ClienteID.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(ClienteID.getText().trim().isEmpty()) {
					lbl_aviso.setVisible(true);
				}else {
					lbl_aviso.setVisible(true);
				}
			}
		});
		ClienteID.setBackground(Color.WHITE);
		ClienteID.setColumns(10);
		ClienteID.setBounds(96, 153, 206, 20);
		panel_2.add(ClienteID);
		
		total = new JTextField();
		total.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char validacion = e.getKeyChar();
				if(Character.isLetter(validacion)) {
					e.consume();
					aviso3.setVisible(true);
				}
			}
		});
		total.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(total.getText().trim().isEmpty()) {
					lbl_aviso.setVisible(true);
				} else {
					lbl_aviso.setVisible(false);
						
				}
					
			}
		});
		total.setBackground(Color.WHITE);
		total.setColumns(10);
		total.setBounds(96, 276, 206, 20);
		panel_2.add(total);
		
		fecha = new JTextField();
		fecha.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char validacion = e.getKeyChar();
				if(Character.isLetter(validacion)) {
					e.consume();
					aviso4.setVisible(true);
				}
			
			}
		});
		fecha.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(fecha.getText().trim().isEmpty()) {
					lbl_aviso.setVisible(true);
				} else {
					lbl_aviso.setVisible(false);
				}
			}
		});
		fecha.setBackground(Color.WHITE);
		fecha.setColumns(10);
		fecha.setBounds(103, 343, 206, 20);
		panel_2.add(fecha);
		
		cantidad = new JTextField();
		cantidad.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char validacion = e.getKeyChar();
				if(Character.isLetter(validacion)) {
					e.consume();
					aviso5.setVisible(true);
				}
			
			}
		});
		cantidad.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(cantidad.getText().trim().isEmpty()) {
					lbl_aviso.setVisible(true);
				} else {
					lbl_aviso.setVisible(false);
				}
			}
		});
		cantidad.setBackground(Color.WHITE);
		cantidad.setColumns(10);
		cantidad.setBounds(96, 213, 206, 20);
		panel_2.add(cantidad);
		
		JLabel lblNewLabel = new JLabel("Factura");
		lblNewLabel.setBounds(10, 11, 149, 52);
		panel_2.add(lblNewLabel);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 44));
		
		aviso1 = new JLabel("Solo Numeros");
		aviso1.setForeground(Color.RED);
		aviso1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		aviso1.setBounds(312, 100, 81, 14);
		panel_2.add(aviso1);
		aviso1.setVisible(false);
		
		aviso2 = new JLabel("Solo Numeros");
		aviso2.setForeground(Color.RED);
		aviso2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		aviso2.setBounds(312, 156, 81, 14);
		panel_2.add(aviso2);
		aviso2.setVisible(false);
		
		
		aviso3 = new JLabel("Solo Numeros");
		aviso3.setForeground(Color.RED);
		aviso3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		aviso3.setBounds(312, 216, 81, 14);
		panel_2.add(aviso3);
		aviso3.setVisible(false);
		
		
		aviso4 = new JLabel("Solo Numeros");
		aviso4.setForeground(Color.RED);
		aviso4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		aviso4.setBounds(312, 279, 81, 14);
		panel_2.add(aviso4);
		aviso4.setVisible(false);
		
		aviso5 = new JLabel("Solo Numeros");
		aviso5.setForeground(Color.RED);
		aviso5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		aviso5.setBounds(319, 346, 89, 14);
		panel_2.add(aviso5);
		aviso5.setVisible(false);
		
	}	
	public void validaciones() {
		if(FacturaID.getText().trim().isEmpty() || ClienteID.getText().trim().isEmpty() || cantidad.getText().trim().isEmpty() || total.getText().trim().isEmpty() || fecha.getText().trim().isEmpty()) {
			
			JOptionPane.showMessageDialog(null, "Porfavor llene todos los campos ","Error", JOptionPane.WARNING_MESSAGE);
		}
	}

}
