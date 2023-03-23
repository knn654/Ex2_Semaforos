import java.util.concurrent.Semaphore;

public class Threads extends Thread {
	private int numAviao, tipoPista;
	private Semaphore semaforo;

	public Threads(int numAviao, Semaphore semaforo, int tipoPista) {
		this.numAviao = numAviao;
		this.semaforo = semaforo;
		this.tipoPista = tipoPista;
	}

	public void run() {
		if (tipoPista == 1) {
			System.out.println("Avião #" + numAviao + "| Pista: Norte");
			norte();
		} else {
			System.out.println("Avião #" + numAviao + "| Pista: Sul");
			sul();
		}

	}

	public void sul() {
		try {
			semaforo.acquire();
			decolagemSul();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			semaforo.release();
		}

	}

	public void norte() {
		try {
			semaforo.acquire();
			decolagemNorte();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			semaforo.release();
		}
	}

	public void decolagemNorte() {
		System.out.println("Iniciando manobra do avião #" + numAviao + "| Pista: Norte");
		System.out.println("Manobrando avião #" + numAviao + "...");
		int tempoEspera = (int) (Math.random() * 401) + 300;
		try {
			Thread.sleep(tempoEspera);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Taxiando avião #" + numAviao + "...");
		tempoEspera = (int) (Math.random() * 501) + 500;
		try {
			Thread.sleep(tempoEspera);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Avião #" + numAviao + " decolando...");
		tempoEspera = (int) (Math.random() * 301) + 100;
		try {
			Thread.sleep(tempoEspera);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Avião #" + numAviao + " se afastando...");
		tempoEspera = (int) (Math.random() * 501) + 300;
		try {
			Thread.sleep(tempoEspera);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Pista norte liberada.");
	}

	public void decolagemSul() {
		System.out.println("Iniciando manobra do avião #" + numAviao + "| Pista: Sul");
		System.out.println("Manobrando avião #" + numAviao + "...");
		int tempoEspera = (int) (Math.random() * 401) + 300;
		try {
			Thread.sleep(tempoEspera);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Taxiando avião #" + numAviao + "...");
		tempoEspera = (int) (Math.random() * 501) + 500;
		try {
			Thread.sleep(tempoEspera);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Avião #" + numAviao + " decolando...");
		tempoEspera = (int) (Math.random() * 301) + 100;
		try {
			Thread.sleep(tempoEspera);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Avião #" + numAviao + " se afastando...");
		tempoEspera = (int) (Math.random() * 501) + 300;
		try {
			Thread.sleep(tempoEspera);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Pista sul liberada.");
	}

}
