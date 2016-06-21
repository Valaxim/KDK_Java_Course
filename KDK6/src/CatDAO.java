import static java.lang.System.exit;

import java.util.ArrayList;

public class CatDAO {

	private ArrayList<Cat> cats = new ArrayList<Cat>();

	public void addNewCat(Cat cat) {
		cats.add(cat);
	}

	public ArrayList<Cat> getCats() {
		return cats;
	}

	@Override
	public String toString() {
		return "CatDAO [cats=" + cats + "]";
	}

	public void showAllCats() {
		System.out.println(cats);
	}

	public void showOneCat(int k) {
		try {
			System.out.println(cats.get(k - 1));
		} catch (Exception e) {
			System.out.println("Nie ma kota o podanym numerze");
		}
	}

	public void run() {
		boolean GameFinished = false;
		while (GameFinished != true) {
			System.out.println("Opcja nr 1: Dodaj nowego kota");
			System.out.println("Opcja nr 2: Zobacz wszystkie koty");
			System.out.println("Opcja nr 3: Zobacz wybranego kota");
			System.out.println("Opcja nr 4: Wyjscie");
			int mode = ReadInt.createIntegerNumber();
			switch (mode) {
			case 1:
				Cat cat = new Cat();
				cat = cat.addNewCat();
				addNewCat(cat);
				break;
			case 2:
				showAllCats();
				break;
			case 3:
				System.out.println("Jaki nr kota chcesz zobaczyć? (numeracja od 1) : ");
				int k = ReadInt.createIntegerNumber();
				showOneCat(k);
				break;
			case 4:
				GameFinished = runFinished();
				break;
			}

		}		
		exit(0);
	}

	public boolean runFinished() {
		return true;
	}
}
