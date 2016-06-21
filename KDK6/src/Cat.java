import java.util.Date;
import java.util.Scanner;

public class Cat {

	static Scanner sc = new Scanner(System.in);
	private String imie;
	private Date dataUrodzenia;
	private Float waga;
	private String imieOpiekuna;

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public Date getDataUrodzenia() {
		return dataUrodzenia;
	}

	public void setDataUrodzenia(Date dataUrodzenia) {
		this.dataUrodzenia = dataUrodzenia;
	}

	public Float getWaga() {
		return waga;
	}

	public void setWaga(Float waga) {
		this.waga = waga;
	}

	public String getImieOpiekuna() {
		return imieOpiekuna;
	}

	public void setImieOpiekuna(String imieOpiekuna) {
		this.imieOpiekuna = imieOpiekuna;
	}

	@Override
	public String toString() {
		return " \n Cat [imie=" + imie + ", waga=" + waga + ", imieOpiekuna=" + imieOpiekuna + "]";
	}

	public Cat addNewCat() {

		Cat kot = new Cat();
		System.out.print("Podaj imię kota: ");
		kot.setImie(getUserInput());

		do {
			System.out.print("Podaj wagę kota: ");
			try {
				kot.setWaga(Float.valueOf(getUserInput()));
			} catch (NumberFormatException nfe) {
				System.out.println("Coś jest nie tak z formatem wagi! Przykładowa waga: 10.0");
			}
		} while (kot.getWaga() == null);

		System.out.print("Podaj kto jest opiekunem kota: ");
		kot.setImieOpiekuna(getUserInput());
		System.out.println("Dziękuję, teraz wiem o kocie naprawdę wszystko!");
		return kot;
	}

	public static String getUserInput() {
		return sc.nextLine().trim();
	}
}