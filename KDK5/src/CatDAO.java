import java.util.ArrayList;

public class CatDAO {

	private ArrayList<Cat> cats = new ArrayList<Cat>();
	
		
	public void addNewCat(Cat cat){
		cats.add(cat);
	}
	public ArrayList<Cat> getCats() {
		return cats;
	}
	public void setCats(ArrayList<Cat> cats) {
		this.cats = cats;
	}
	
	@Override
	public String toString() {
		return "CatDAO [cats=" + cats + "]";
	}
	
}
