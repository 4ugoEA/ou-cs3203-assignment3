
public class main {

	public static void main(String[] args) {
		int[] t = {1, 2, 3, 4, 5};
		
		System.out.println(ArraySum(t));

	}
	
	public static int ArraySum(int[] a) {
		int result = 0;
		
		for(int i = 0; i < a.length; i++) {
			result += a[i];
		}
		
		return result;
	}

}
