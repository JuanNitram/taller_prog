package Tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import logica.Datos;
import logica.controladores.CtrlPropuesta;
import logica.controladores.CtrlUsuario;

public class DatosTest {

	@Test
	public void test() {
		
		Datos d = new Datos();
		CtrlPropuesta cp = CtrlPropuesta.getInstance();
		CtrlUsuario cu = CtrlUsuario.getInstance();
		
		//assertEquals(cu.listarProponentes().size(),9);
		//assertEquals(cu.listarColaboradores().size(),11);
		//assertEquals(cp.listarPropuestas().size(),8);
		//assertEquals(cp.listarColaboraciones().size(),17);
		
	}

}
