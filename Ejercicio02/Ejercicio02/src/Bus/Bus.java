package Bus;

public class Bus {
	private int capacidad;
	private int pasajeros;
	private double costoPasaje;
	
	public Bus(int capacidad, int pasejeros, double costoPasaje) {
		this.capacidad = capacidad;
		this.pasajeros = pasejeros;
		this.costoPasaje = costoPasaje;
	}
	
	
	public void subPasa(int x) {
		if(this.pasajeros + x <= this.capacidad) {
			this.pasajeros = this.pasajeros + x;
			System.out.print("Subieron "+ x +" pasajeros");
			if(this.pasajeros == this.capacidad){
				System.out.print(" Bus lleno");
			}
		} else {
			System.out.println("No hay espacio :C");
		}
	}
	
	public double cobroPas() {
		double total = this.pasajeros * this.costoPasaje;
		return total;
	}
	
	public int asientoDisp() {
		return this.capacidad - this.pasajeros;
	}
}
