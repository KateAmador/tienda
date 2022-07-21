


import controlador.controladorEntrada;
import modelo.ConsultasEntrada;
import modelo.entrada;
import vistas.vistaEntrada;

public class Iniciar {

	

	public static void main(String[] args) {
		entrada modelo = new entrada();
		ConsultasEntrada modC = new ConsultasEntrada();
		vistaEntrada frm = new vistaEntrada();
		
		controladorEntrada control = new controladorEntrada(modelo, modC, frm);
		control.iniciar();
		frm.setVisible(true);

	}

}
