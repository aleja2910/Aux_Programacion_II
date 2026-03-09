package Minecraft;

public class ServerMinecraft {
	private String[] jugadores;
	private int[] diamantes;
	private int contador;
	
	public ServerMinecraft() {
		this.jugadores = new String[10];
		this.diamantes = new int [10];
		this.contador = 0;
	}
	
	public void agregajugador(String x, int y) {
		if (contador < 10) {
			this.jugadores[this.contador] = x;
			this.diamantes[this.contador] = y;
			this.contador++;
		} else {
			System.out.println("Server lleno");
		}
	}
	
	public void verStacks() {
		for (int i = 0; i < this.contador; i++) {
			int s=this.diamantes[i] / 64;
			System.out.println(this.jugadores[i]+" tiene "+ s +" Stacks de diamantes :D");
		}
	}
	
	public void masDiamantes() {
		int m = this.diamantes[0];
		int p = 0;
		for(int i = 1; i < this.contador; i++) {
			if(this.diamantes[i] > m) {
				m = this.diamantes[i];
				p = i;
			}
		}
		System.out.println("Jugador con mas diamantes: "+ this.jugadores[p]);
	}
	
	public int diamantestotal() {
		int sum = 0;
		for(int i = 0; i < this.contador; i++) {
			sum +=this.diamantes[i];
		}
		return sum;
	}
}
