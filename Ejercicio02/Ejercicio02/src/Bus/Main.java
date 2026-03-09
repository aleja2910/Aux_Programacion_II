package Bus;

public class Main {

	public static void main(String[] args) {
		
		Bus b1 = new Bus(50,0,1.50);
		
		b1.subPasa(20);
		
		System.out.println("\nSe cobro "+ b1.cobroPas() +"bs");
		
		System.out.println("Asientos disponibles: "+ b1.asientoDisp());
	}

}
