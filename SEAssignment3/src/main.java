import java.util.Scanner;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> t = new ArrayList<Integer>();
		System.out.print("Enter integers, enter a non-integer when done: ");
		
		while(input.hasNextInt()) {
			t.add(input.nextInt());
		}
		input.close();
		
		System.out.println("Sum of Array: " + ArraySum(t));
		System.out.println("Product of Array: " + ArrayProd(t));
		

	}
	
	public static int ArraySum(ArrayList<Integer> t) {
		int result = 0;
		
		for(int i = 0; i < t.size(); i++) {
			result += t.get(i);
		}
		
		return result;
	}
	
	public static int ArrayProd(ArrayList<Integer> t) {
		int result = 1;
		
		for(int i = 0; i < t.size(); i++) {
			result *= t.get(i);
		}
		
		return result;
	}
	
	public static ArrayList<Integer> ReverseArray(ArrayList<Integer> t) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i = t.size() - 1; i >= 0; i--) {
			result.add(t.get(i));
		}
		
		return result;
	}
	

}
