package clases;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public class Pelota {
	
	public Pelota(int x , int y) {
		this.x=x;
		this.y=y;
		
	}
	public Rectangle2D getPelota() {
		return new Rectangle2D.Double(x,y,ANCHO,ALTO);
	}
	
	public void mover(Rectangle limites , boolean colisionR1 , boolean colisionR2) {
		//Movimiento de la pelota
		x+=dx;
		y+=dy;
		//Si ocurre una colision con la raqueta 1 cambia de sentido 
		if(colisionR1) {
			dx=-dx;
			x=25;
		}
		//Si ocurre una colision con la raqueta 2 cambia de sentido 
		if(colisionR2) {
			dx=-dx;
			x=745;
		}
		
		// Al tocar una de las paredes suma un punto y mueve la pelota al centro
		if(x>limites.getMaxX()) {
			x=380;
			y=250;
			
			puntaje1++;
		}
		
		if(x<limites.getMaxX() - limites.getMaxX()) {
			x=380;
			y=250;
			
			puntaje2++;
		}
		//Cambia de direccion si toca el suelo
		if(y>limites.getMaxY()) {
			dy=-dy;
			
		}
		
		//Si toca el techo cambia de direccion
		if(y<0) {dy=-dy;}
		
		
	}
	
	private int x;
	private int y;
	
	private int dx=1,dy=1;
	
	private final int ANCHO=15 , ALTO=15;
	
	public int puntaje1=0,puntaje2=0;
}
