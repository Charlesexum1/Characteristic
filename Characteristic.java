import java.util.Scanner;
public class Characteristic {
	
	public String characteristic = "";
	public int rating = 0;
	
	public Characteristic() {
		Scanner keys = new Scanner(System.in);
		characteristic = keys.next();
		rating = keys.nextInt();
		}
	public Characteristic(String chara, int newRating) {
		characteristic = chara;
		rating = newRating;
		}	
		
	private boolean isValid(int newRating) {
		return (newRating > 0 && newRating <= 10);
		}
	
	private void setRating(int newRating) {
		if (this.isValid(newRating)) {
			rating = newRating;
			}
		else {
			System.out.println("Rating should be between 1 and 10");
			}	
		}
	private void setRating(){
		
		Scanner keys = new Scanner(System.in);
		System.out.println("Please input an integer between 1 and 10");
		int input = keys.nextInt();
		while (!this.isValid(input)) {
			System.out.println("Enter a number between 1-10...");
			input = keys.nextInt();
			}
		rating = input;	
		
		}	
		
	public int getRating() {
		return rating;
		}		
	
	public String getDescription() {
		return "Awareness is key";
		}	
	
	public double getCompatabilityMeasure(Characteristic otherRating) {
		return 1 - ((Math.pow(this.rating - otherRating.rating, 2)) / 81);
		}
	public boolean isMatch(Characteristic other) {
		if (this.characteristic.equals(other.characteristic)) {
			return true;
			}
		else {
			return false;	
			}
		}
	public double getCompatability(Characteristic another) {
		if (this.isMatch(another)) {
			return this.getCompatabilityMeasure(another);
			}
		else {
			return 0;
			}	
		}		
	
	public static void main (String args[]) {
		
		Characteristic demo1 = new Characteristic("int", 7);
		Characteristic demo2 = new Characteristic("int", 9);
		Characteristic demo3 = new Characteristic("str", 9);
		System.out.println(demo1.getCompatability(demo2));
		System.out.println(demo1.getCompatability(demo3));
		
		}
	
	}

