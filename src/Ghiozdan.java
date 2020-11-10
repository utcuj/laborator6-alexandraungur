
public class Ghiozdan {
	private Rechizita [] rechizite = new Rechizita[10];
	private int i=0;
	
	public void add(Rechizita rechizita) {
		rechizite[i++]=rechizita;
	}
	
	public void listItems() {
		for(Rechizita r: rechizite) {
			if(r!=null)
				System.out.println(r.getNume());
			else
				break;
		}
	}
	
	public void listManual() {
		for(Rechizita r: rechizite) {
			if(r==null)
				break;
			if(r instanceof Manual)
				System.out.println(r.getNume());
		}
	}
	
	public void listCaiet() {
		
		for(Rechizita r: rechizite) {
			if(r==null)
				break;
			if(r instanceof Caiet)
				System.out.println(r.getNume());
	}
}
	
	public int getNrRechizite() {
		int count=0;
		for(Rechizita r: rechizite) {
			if(r!=null)
				count++;
			else
				break;
			
		}
		return count;
	}
	
	public int getNrManuale() {
		int count=0;
		for(Rechizita r: rechizite) {
			if(r==null)
				break;
			
			if(r instanceof Manual)
					count++;
		}
			return count;
}
	
	public int getNrCaiete() {
		int count=0;
		for(Rechizita r: rechizite) {
			if(r==null)
				break;
			
			if(r instanceof Caiet)
					count++;
		}
		return count;
	}

}
