import java.util.Scanner;

public class BankovniRacun {

	private String ime;
	private String prezime;
	private double stanjeRacuna;

	Scanner scanner = new Scanner(System.in);

	public BankovniRacun(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
		this.stanjeRacuna = 0.0;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public double getStanjeRacuna() {
		return stanjeRacuna;
	}

	protected void staviNaRacun() {
		System.out.print("\nKorisnik " + ime + ": unesite iznos koji zelite da postavite na racun: ");
		double iznos = scanner.nextDouble();

		if (iznos > 0) {
			stanjeRacuna = stanjeRacuna + iznos;
			System.out.println("Korisnik: " + ime + " " + prezime + ". Stanje na racunu je uvecano za " + stanjeRacuna
					+ " dinara.");
		} else {
			System.out.println("Transakcija nije moguca.");
		}
	}

	protected void podigniSaRacuna() {
		System.out.print("\nKorisnik " + ime + ": unesite iznos koji zelite da podignete: ");
		double iznos = scanner.nextDouble();

		if (iznos > 0 && iznos <= stanjeRacuna) {
			stanjeRacuna = stanjeRacuna - iznos;
			System.out.println(ime + ", uspesno ste podigli " + iznos + " dinara.");
			System.out.println("Preostali iznos na racunu: " + stanjeRacuna);
		} else {
			System.out.println("Transakcija nije moguca.");
		}
	}

	protected void stampajStanje() {
		System.out.println("\nStanje na racunu " + ime + " " + prezime + " iznosi: " + stanjeRacuna);
	}

	protected void transfer(BankovniRacun primalac) {
		System.out.println("Koliko novca zelite da uplatite?");
		System.out.print("Iznos: ");
		double iznos = scanner.nextDouble();

		if (iznos <= 0 || iznos > stanjeRacuna) {
			System.out.println("Nije moguce izvrsiti transakciju!");
		} else {

			primalac.stanjeRacuna = primalac.stanjeRacuna + iznos;
			stanjeRacuna = stanjeRacuna - iznos;

			System.out.println("Stanje racuna korisnika " + primalac.ime + " " + primalac.prezime + " je "
					+ primalac.stanjeRacuna);
			System.out.println("Stanje racuna korisnika " + ime + " " + prezime + " je " + stanjeRacuna);
		}
	}
}
