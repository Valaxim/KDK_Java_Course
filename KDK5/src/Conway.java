
/*import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Conway {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println("Podaj imie kota:");
        cat.setName(getUserInput());

        System.out.println("Podaj imie opiekuna:");
        cat.setBabysitter(getUserInput());

        SimpleDateFormat myDate = new SimpleDateFormat("yyyy MM dd");
        do {
            System.out.println("Podaj date: yyyy mm dd: ");
            try {
                //kot.setDataUrodzenia(sdf.parse(getUserInput()));
                cat.setDate((Calendar) myDate.parse(getUserInput()));
            }catch (ParseException e) {
                System.out.println("Nic sie nie stalo");
            }
        } while (cat.getDate()==null);


        do {
            System.out.println("Podaj floata: ");
            try {
                cat.setWeight(Float.parseFloat(getUserInput()));
            }catch (NumberFormatException e) {
                System.out.println("Nic sie nie stalo");
            }
        } while (cat.getWeight()==0.0);



        cat.introducing();
    }


    static Scanner inputScanner = new Scanner(System.in);
    public static String getUserInput() {
        return inputScanner.nextLine().trim();
    }
}

*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Conway {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Cat kot = new Cat();

		System.out.print("Podaj imię kota: ");
		kot.setImie(getUserInput());

	/*	SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		do {
			System.out.print("Podaj datę urodzenia kota w formacie RRRR.MM.DD: ");
			try {
				kot.setDataUrodzenia(sdf.parse(getUserInput()));
			} catch (ParseException pe) {
				System.out.println("Coś jest nie tak z formatem daty! Przykładowa data: 2014.01.05");
			}
		} while (kot.getDataUrodzenia() == null);
	 */
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
		//System.out.println("data" + kot.getDataUrodzenia());
		
		CatDAO CatArray = new CatDAO();
		for(int i=0;i<5;i++)
			CatArray.addNewCat(kot);		
		System.out.println(CatArray);
		
	}

	public static String getUserInput() {
		return sc.nextLine().trim();
	}

}
