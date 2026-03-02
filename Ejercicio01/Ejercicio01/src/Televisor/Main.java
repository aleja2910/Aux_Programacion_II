package Televisor;

public class Main {

	public static void main(String[] args) {
		Televisor t1 = new Televisor("Samsung", 1080, "oled");
		Televisor t2 = new Televisor("LG", 2160, "ips");
		System.out.println(t1);
		System.out.println(t2);
	}

}
