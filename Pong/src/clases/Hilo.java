package clases;

public class Hilo extends Thread{

	TableroJuego lamina;
	
	public Hilo(TableroJuego lamina) {
		this.lamina=lamina;
	}

	@Override
	public void run() {
		while(true) {
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println("Chale banda el hilo dio error :(");
				e.printStackTrace();
			}
			
			lamina.repaint();
			
		}
		
	}
	
}
