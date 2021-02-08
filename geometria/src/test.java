import static org.junit.Assert.*;

import org.junit.Test;

public class test {
	Circulo_JASL circulo = new Circulo_JASL(-3.0,"Circulo");
	
	@Test
	public void testArea() {
		double resultado = circulo.area();
		double esperado = 28.2743338823;
		assertEquals(esperado, resultado, 0.001);
	}

	@Test
	public void testPerimetro() {
		double resultado = circulo.perimetro();
		double esperado = -18.8495559215;
		assertEquals(esperado, resultado, 0.1);
	}

	

}
