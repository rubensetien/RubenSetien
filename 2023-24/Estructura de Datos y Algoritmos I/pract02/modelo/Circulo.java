package pract02.modelo;

/**
 * Circulo con las coordenadas de su centro y su radio.
 * 
 * @author Metodos de Programacion (UC) y <TODO: nombre alumno>
 * @version sep-2023
 */
public class Circulo {
	// radio del circulo.
	private final int radio;
	
	// coordenada x del centro del circulo.
	private final double centroX;
	
	// coordenada y del centro del circulo.
	private final double centroY;
	
	// TODO: atributo color (Apartado 2)
	
	// TODO: atributos velocidadX y velocidadY (Apartado 3)
	
	/**
	 * Construye un circulo.
	 * @param radio radio del circulo.
	 * @param centroX coordenada x del centro del circulo.
	 * @param centroY coordenada y del centro del circulo.
	 */
	public Circulo(int radio, double centroX, double centroY) {
		this.radio = radio;
		this.centroX = centroX;
		this.centroY = centroY;
		// TODO: inicializacion atributo color (Apartado 2)	
		// TODO: inicializacion atributos velocidadX y velocidadY (Apartado 3)
	}

	/**
	 * Retorna el radio del circulo.
	 * @return el radio del circulo.
	 */
	public int radio() {
		return radio;
	}
	
	/**
	 * Retorna la coordenada x del centro del circulo.
	 * @return la coordenada x del centro del circulo.
	 */
	public double centroX() {
		return centroX;
	}

	/**
	 * Retorna la coordenada y del centro del circulo.
	 * @return la coordenada y del centro del circulo.
	 */
	public double centroY() {
		return centroY;
	}
	
	// TODO: otros metodos (Apartados 2 y 3)
	// El observador del atributo color debe llamarse exactamente "color()" para
	// que el programa funcione correctamente.
}
