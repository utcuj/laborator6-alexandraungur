
public class TestGhiozdan {

	public static void main(String[] args) {
		Ghiozdan ghiozdan = new Ghiozdan();
		
		Caiet caiet1= new Caiet("matematica");
		Caiet caiet2= new Caiet("romana");
		Caiet caiet3= new Caiet("engleza");
		Manual manual1=new Manual("engleza");
		Manual manual2= new Manual("matematica");
		Caiet caiet4= new Caiet();
		
		ghiozdan.add(caiet1);
		ghiozdan.add(caiet2);
		ghiozdan.add(caiet3);
		ghiozdan.add(manual1);
		ghiozdan.add(manual2);
		ghiozdan.add(caiet4);
		
		System.out.println("Numar de rechizite: "+ ghiozdan.getNrRechizite());
		ghiozdan.listItems();
		
		System.out.println("Numar de manuale: "+ ghiozdan.getNrManuale());
		ghiozdan.listManual();
		
		System.out.println("Numar de caiete: "+ ghiozdan.getNrCaiete());
		ghiozdan.listCaiet();
		
		
		
		
		
		

	}

}
