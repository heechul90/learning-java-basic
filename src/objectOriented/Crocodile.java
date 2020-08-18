package objectOriented;

public class Crocodile extends Animal implements Predator, Barkable {
	public String getFood() {
		return "chicken";
	}
	
	public void bark() {
		System.out.println("гого!");
	}
}
