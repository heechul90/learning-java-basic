package objectOriented;

public class Crocodile extends Predator implements Barkable {
	public String getFood() {
		return "chicken";
	}
	
	public void bark() {
		System.out.println("гого!");
	}
}
