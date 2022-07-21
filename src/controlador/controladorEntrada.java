package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.ConsultasEntrada;
import modelo.entrada;
import vistas.vistaEntrada;

public class controladorEntrada implements ActionListener{
		
		private entrada modelo;
		private ConsultasEntrada modC;
		private vistaEntrada frame;
		
		
		public controladorEntrada (entrada modelo, ConsultasEntrada modC, vistaEntrada vista) {
		
			this.modelo = modelo;
			this.modC = modC;
			this.frame = vista;
			
			this.frame.btnIngresar.addActionListener(this);
			this.frame.btnActualizar.addActionListener(this);
			this.frame.btnBorrar.addActionListener(this);
			this.frame.btnBuscar.addActionListener(this);
			
		}
		
		
		public void iniciar() {
			
			frame.setTitle("Entradas");
			frame.setLocationRelativeTo(null);
			frame.txtEntradaID.setVisible(true);
			
			
		}
		
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == frame.btnIngresar) {
				
				modelo.setId_Entrada(Integer.parseInt(frame.txtEntradaID.getText()));
				modelo.setId_entrada_producto(Integer.parseInt(frame.txtIdDelProducto.getText()));
				modelo.setCantidad_Entrada(Integer.parseInt(frame.txtCantidad.getText()));
				modelo.setValorcompra_entrada(Integer.parseInt(frame.txtValorDeLaCompra.getText()));
				modelo.setFactura_entrada(frame.txtFactura.getText());
				modelo.setFecha_entrada(Integer.parseInt(frame.txtFecha.getText()));
				
				
				if(modC.registrar(modelo)) {
					
					JOptionPane.showMessageDialog(frame, "Registro guardado");
					limpiar();
				}
				else {
					JOptionPane.showMessageDialog(frame, "error al guardar");
				limpiar();
				}
				
				
			}
			if (e.getSource() == frame.btnActualizar) {
				modelo.setId_Entrada(Integer.parseInt(frame.txtEntradaID.getText()));
				modelo.setId_entrada_producto(Integer.parseInt(frame.txtIdDelProducto.getText()));
				modelo.setCantidad_Entrada(Integer.parseInt(frame.txtCantidad.getText()));
				modelo.setValorcompra_entrada(Integer.parseInt(frame.txtValorDeLaCompra.getText()));
				modelo.setFactura_entrada(frame.txtFactura.getText());
				modelo.setFecha_entrada(Integer.parseInt(frame.txtFecha.getText()));
				

				if (modC.modificar(modelo)) {
					JOptionPane.showMessageDialog(null, "Se modifico correctamente");
					limpiar();
				} else {
					JOptionPane.showMessageDialog(null, "Error al modificar");
					limpiar();
				}
			}

			if (e.getSource() == frame.btnBorrar) {
				modelo.setId_Entrada(Integer.parseInt(frame.txtEntradaID.getText()));

				if (modC.eliminar(modelo)) {
					JOptionPane.showMessageDialog(null, "Se elimino correctamente");
					limpiar();
				} else {
					JOptionPane.showMessageDialog(null, "Error al eliminar");
					limpiar();
				}
			}

			if (e.getSource() == frame.btnBuscar) {
				modelo.setId_Entrada(Integer.parseInt(frame.txtEntradaID.getText()));;

				if (modC.buscar(modelo)) {

					
					frame.txtEntradaID.setText(String.valueOf(modelo.getId_Entrada()));
					frame.txtIdDelProducto.setText(String.valueOf(modelo.getId_entrada_producto()));
					frame.txtCantidad.setText(String.valueOf(modelo.getCantidad_Entrada()));
					frame.txtFactura.setText(String.valueOf(modelo.getFactura_entrada()));
					frame.txtFecha.setText(String.valueOf(modelo.getFecha_entrada()));
					frame.txtValorDeLaCompra.setText(String.valueOf(modelo.getValorcompra_entrada()));

				} else {
					JOptionPane.showMessageDialog(null, "No se encontro el registro");
					limpiar();
				}
			}

		}
		
		public void limpiar() {
			frame.txtEntradaID.setText(null);
			frame.txtIdDelProducto.setText(null);
			frame.txtCantidad.setText(null);
			frame.txtValorDeLaCompra.setText(null);
			frame.txtFactura.setText(null);
			frame.txtFecha.setText(null);
		}
}
