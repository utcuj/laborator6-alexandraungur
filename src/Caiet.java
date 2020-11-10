
public class Caiet extends Rechizita{

	public Caiet(String eticheta) {
		super(eticheta);
		// TODO Auto-generated constructor stub
	}
	
	public Caiet() {
		this("necunoscut");
	}

	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return "Caiet " + eticheta;
	}

}
