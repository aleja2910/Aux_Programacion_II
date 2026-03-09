package Minecraft;

public class Main {

	public static void main(String[] args) {
		ServerMinecraft s1 = new ServerMinecraft();
		
		s1.agregajugador("Steve", 120);
		s1.agregajugador("Alex", 50);
		s1.agregajugador("Herobrine", 200);
		
		s1.verStacks();
		
		s1.masDiamantes();
		
		System.out.println("El total de diamantes: "+ s1.diamantestotal());
	}

}
