
/**
 * @author Juan Alberto Selfa Leal
 * @version 1.2
 */
public class Rectangulo_JASL extends FiguraGeometrica_JASL {
	private double l1;
	private double l2;
	
	/**
	 * M�todo constructor para el c�lculo de la figura geom�trica rect�ngulo
	 * @param tipoFigura
	 * @param lG Es el primer par�metro para asignarlo a l1.
	 * @param lP Es el segundo par�metro para asignarlo a l2.
	 */
	public Rectangulo_JASL(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	/**
	 *Este m�todo sirve para calcular el area del rect�ngulo.
	 *@return double devuelve el resultado de multiplicar l1 por l2.
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * M�todo para calcular el perimetro del rect�ngulo-
	 * @return devuelve el resultado de la suma de cada lado multiplicado por dos.
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
