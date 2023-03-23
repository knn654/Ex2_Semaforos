import java.util.concurrent.Semaphore;


public class Main {
public static Semaphore semaforo;
	public static void main(String[] args) {
		
		int totalAvioes = 12;
		semaforo = new Semaphore(2);
		
		for (int i = 0; i < totalAvioes; i++) {
			int pista = (int) (Math.random() * 2) + 1;
			Thread decolagem = new Threads(i, semaforo, pista);
			decolagem.start();
		}
	}
}