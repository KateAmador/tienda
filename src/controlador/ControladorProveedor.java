package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.ConsultasProveedor;
import modelo.Proveedor;
import vistas.ProveedorVista;

public class ControladorProveedor implements ActionListener {

	private Proveedor modelo;
	private ConsultasProveedor modeloP;
	private ProveedorVista frm;

	public ControladorProveedor(Proveedor modelo, ConsultasProveedor modeloP, ProveedorVista vista) {

		// Igualar las variables con los parametros
		this.modelo = modelo;
		this.modeloP = modeloP;
		this.frm = vista;
		// declarar actions de cada boton
		this.frm.btnAgregar.addActionListener(this);
		this.frm.btnModificar.addActionListener(this);
		this.frm.btnEliminar.addActionListener(this);
		this.frm.btnBuscar.addActionListener(this);
		this.frm.btnLimpiar.addActionListener(this);

	}

	public void iniciar() {

		frm.setTitle("Customers");
		frm.setLocationRelativeTo(null);
		frm.txtProveedorId.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == frm.btnAgregar) {
			modelo.setProveedorId(Integer.parseInt(frm.txtProveedorId.getText()));
			modelo.setEmpresa(frm.txtEmpresa.getText());
			modelo.setNombre(frm.txtNombre.getText());
			modelo.setApellido(frm.txtApellido.getText());
			modelo.setTelefono(frm.txtTelefono.getText());

			if (modeloP.registrar(modelo)) {
				JOptionPane.showMessageDialog(null, "Ingresado correctamente");
				limpiar();
			} else {
				JOptionPane.showMessageDialog(null, "Error al guardar");
				limpiar();
			}
		}

		if (e.getSource() == frm.btnModificar) {
			modelo.setProveedorId(Integer.parseInt(frm.txtProveedorId.getText()));
			modelo.setEmpresa(frm.txtEmpresa.getText());
			modelo.setNombre(frm.txtNombre.getText());
			modelo.setApellido(frm.txtApellido.getText());
			modelo.setTelefono(frm.txtTelefono.getText());
			// modelo.setCustomerID(frm.txt_customerID.getText());

			if (modeloP.modificar(modelo)) {
				JOptionPane.showMessageDialog(null, "Se modifico correctamente");
				limpiar();
			} else {
				JOptionPane.showMessageDialog(null, "Error al modificar");
				limpiar();
			}
		}

		if (e.getSource() == frm.btnEliminar) {
			modelo.setProveedorId(Integer.parseInt(frm.txtProveedorId.getText()));

			if (modeloP.eliminar(modelo)) {
				JOptionPane.showMessageDialog(null, "Se elimino correctamente");
				limpiar();
			} else {
				JOptionPane.showMessageDialog(null, "Error al eliminar");
				limpiar();
			}
		}

		if (e.getSource() == frm.btnBuscar) {
			modelo.setProveedorId(Integer.parseInt(frm.txtProveedorId.getText()));

			if (modeloP.buscar(modelo)) {

				frm.txtProveedorId.setText(String.valueOf(modelo.getProveedorId()));
				frm.txtEmpresa.setText(String.valueOf(modelo.getEmpresa()));
				frm.txtNombre.setText(String.valueOf(modelo.getNombre()));
				frm.txtApellido.setText(String.valueOf(modelo.getApellido()));
				frm.txtTelefono.setText(String.valueOf(modelo.getTelefono()));

			} else {
				JOptionPane.showMessageDialog(null, "No se encontro el registro");
				limpiar();
			}
		}

		if (e.getSource() == frm.btnLimpiar) {
			limpiar();
		}
	}

	public void limpiar() {

		frm.txtProveedorId.setText(null);
		frm.txtEmpresa.setText(null);
		frm.txtNombre.setText(null);
		frm.txtApellido.setText(null);
		frm.txtTelefono.setText(null);
	}

}