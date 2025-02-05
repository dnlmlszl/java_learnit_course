package Methods;

public class VariableArguments {

	public static void main(String[] args) {
		
		System.out.println(sum(1, 2, 3, 4, 5));
		System.out.println(sum(5));

	}
	
	private static int sum(int i1, int i2) {
		return 1 + i2;
	}
	
	private static int sum(int i1, int i2, int i3) {
		return i1 + i2 + i3;
	}
	
	private static int sum(int... ints) {
		int sum = 0;
		
		for (int i : ints) {
			sum += i;
		}
		
		return sum;
	}
	
	private static void varArgs(String s, int... i) {
		
	}

}
