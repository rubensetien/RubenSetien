package pract02.gui;

import pract02.modelo.Circulo;

/**
 * Programa principal que permite dibujar y mover circulos
 * en una ventana.
 * 
 * @author Metodos de Programacion (UC) y <TODO: nombre alumno>
 * @version feb-2021
 */
public class GUIMueveCirculos {
	// dimensiones de la ventana
	private static final int ANCHO_VENTANA_PIXELS = 400;
	private static final int ALTO_VENTANA_PIXELS = 500;

	// intervalo de refresco (en segundos)
	private static final double INTERVALO_REFRESCO = 0.05;
	
	/**
	 * Programa principal.
	 * 
	 * @param args argumentos del main (no usados).
	 */
	public static void main(String[] args) {
		// crea la ventana de dibujo.
		VentanaCirculos ventanaCirculos =
				new VentanaCirculos(ANCHO_VENTANA_PIXELS, ALTO_VENTANA_PIXELS);
		
		// crea un circulo y le anhade a la ventana.
		Circulo circulo1 = new Circulo(20, 50, 50);		
		ventanaCirculos.anhadeCirculo(circulo1);
		// TODO: anhade mas circulos (Apartado 1)

		// dibuja el contenido de la ventana
		// TODO: lazo infinito (Apartado 3)
		ventanaCirculos.redibuja(INTERVALO_REFRESCO);
	}

}
