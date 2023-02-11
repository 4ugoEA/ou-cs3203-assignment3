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
//<<<<<<< Upstream, based on origin/master
		System.out.println("Reverse Array: " + ReverseArray(t).toString());
//=======
		
		//Checkedout Commit #3, created new branch part10
		//Reformated some lines
//>>>>>>> e950e6d part10 commit, added some comments, adjusted some line spacing

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
//<<<<<<< Upstream, based on origin/master
	
	public static ArrayList<Integer> ReverseArray(ArrayList<Integer> t) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i = t.size() - 1; i >= 0; i--) {
			result.add(t.get(i));
		}
		
		return result;
	}
	

//=======
//>>>>>>> e950e6d part10 commit, added some comments, adjusted some line spacing
}
