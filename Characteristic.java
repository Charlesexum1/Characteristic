import java.util.Scanner;
public class Characteristic {
	
	public String characteristic = "";
	public int rating = 0;
	
	public Characteristic() {
		characteristic = "intellect";
		rating = 0;
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
	
	public static void main (String args[]) {
		
		Characteristic demo = new Characteristic();
		demo.setRating(10);
		demo.setRating(11);
		demo.setRating();
		
		}
	
	}
