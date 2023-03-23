import java.util.concurrent.Semaphore;


public class Main {
public static Semaphore semaforo;
	public static void main(String[] args) {
		
		int totalAvioes = 12;
		semaforo = new Semaphore(1);
		
		for (int i = 0; i < totalAvioes; i++) {
			int pista = (int) (Math.random() * 2) + 1;
			if(pista == 1) {
				Thread decolagemNorte = new Threads(i, semaforo, pista);
				decolagemNorte.start(); 
			} else {
				Thread decolagemSul = new Threads2(i, semaforo, pista);
				decolagemSul.start();
			}
		}
	}
}