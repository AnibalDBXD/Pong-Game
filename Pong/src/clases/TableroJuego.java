package clases;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import clases.Pelota;
import javax.swing.JPanel;

public class TableroJuego extends JPanel{
	//Creamos los objetos
	Pelota pelota=new Pelota(0,0);
	Raqueta raqueta1=new Raqueta(10,200);
	Raqueta raqueta2=new Raqueta(764,200);
	
	
	public TableroJuego() {
		setBackground(Color.BLACK);
		// Pintamos el fondo
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D) g;
		
		//Dibujamos y coloreamos la pelota
		g2.setColor(Color.WHITE);
		dibujar(g2);
		actualizar();
		//Pintamos la pelota y con el Hilo actualizamos el tablero
	}

	public void dibujar(Graphics2D g) {
		
		//Dibujamos el puntaje y la linea central
		g.drawString(String.valueOf(pelota.puntaje1), 380-40, 20);
		g.drawString(String.valueOf(pelota.puntaje2), 380+40, 20);
		
		g.drawLine(380, 500, 380, 0);
		
		//Dibujamos la pelota y las raquetas
		g.fill(pelota.getPelota());
		g.fill(raqueta1.getRaqueta());
		g.fill(raqueta2.getRaqueta());
		
		//Coloca mi twitter en la esquina  @AnibalDBXD
		
		g.drawString("TW:@AnibalDBXD", 0, 12);
		
	}
	//Actualizamos el movimiento de la pelota y raquetas, para ver si la pelota colisiona con la raqueta, tambien actualizamos los movimientos de las raquetas
	public void actualizar() {
		pelota.mover(getBounds() , colision(raqueta1.getRaqueta()) , colision(raqueta2.getRaqueta()) );
		
		raqueta1.moverR1(getBounds());
		
		raqueta2.moverR2(getBounds());
		
	}
	// devuelve true o false si a ocurrido una colision
	private boolean colision(Rectangle2D r) {
		return pelota.getPelota().intersects(r);
	}
	//Bucle para repintar 
	public void iterarJuego() {
		while(true) {
			repaint();
			try {
				Thread.sleep(6);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	
}

