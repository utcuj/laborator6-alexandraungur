
public class GandacPuturos extends Gandac{
	
	public void move() {
		System.out.println("Se plimba");
	}
	
	public GandacPuturos() {
		
		//super();
		move();
		System.out.println("Constructor gandac puturos");
	}
	
	private static int nrPicioare= getNrPicioare();
	
	public static int  getNrPicioare() {
		System.out.println("Are 5 picioare");
		return 5;
	}
}
