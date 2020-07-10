package clases;

import javax.swing.JFrame;


public class Ventana extends JFrame{
// Creamos la ventana 
	public Ventana() {
		
		setTitle("Pong");
		
		setSize(ANCHO, ALTO);
		
		setLocationRelativeTo(null); // Ubicando la ventana en el centro de la pantalla 
		
		setResizable(false);
		//añadimos la lamina (TableroJuego)
		lamina=new TableroJuego();
		
		add(lamina);
		// añadimos el Keylistener para los eventos de teclado 
		addKeyListener(new EventosTeclado());
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lamina.iterarJuego();
	}
	
	private TableroJuego lamina;
	private final int ANCHO=800,ALTO=500;
	private Hilo hilo;
}
