package clases;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public class Raqueta {

	public Raqueta(int x , int y) {
		
		this.x=x;
		this.y=y;
	}
	
	public Rectangle2D getRaqueta() {
		return new Rectangle2D.Double(x,y,ANCHO,ALTO);
		
	}
	//Revisa si no estan en el limite de la pantalla y si no es asi sube o baja la raqueta dependiendo de su la tecla pulsada es w,s,UP,DOWN
	public void moverR1(Rectangle limites) {
		if(EventosTeclado.w && y > limites.getMinY()) {
			y--;
			
		}
		if(EventosTeclado.s && y < limites.getMaxY() - ALTO) {
			y++;
			
		}
	}
	
	public void moverR2(Rectangle limites) {
		if(EventosTeclado.up && y > limites.getMinY()) {
			y--;
			
		}
		if(EventosTeclado.down && y < limites.getMaxY() - ALTO) {
			y++;
			
		}
	}
	
	private int  x,y;
	private static final int ANCHO=10,ALTO=60;
}
