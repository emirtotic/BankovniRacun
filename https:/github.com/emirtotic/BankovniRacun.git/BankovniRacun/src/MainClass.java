
public class MainClass {

	public static void main(String[] args) {
		
		BankovniRacun marija = new BankovniRacun("Marija", "Markovic");
		BankovniRacun milos = new BankovniRacun("Milos", "Matic");
		
		marija.staviNaRacun();
		milos.staviNaRacun();
		
		marija.stampajStanje();
		milos.stampajStanje();
		
		marija.transfer(milos);
		
		marija.stampajStanje();
		milos.stampajStanje();
		
		milos.podigniSaRacuna();
		
		

	}

}
