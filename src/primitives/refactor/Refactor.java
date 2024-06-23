package primitives.refactor;

public class Refactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RefactoringDemo r = new RefactoringDemo();
		extracted(r);

	}

	private static void extracted(RefactoringDemo r) {
		incrementing(r);
		incrementing(r);
		decrementing(r);
		int counter;
		getValue(r);
		makeItZero(r);
		getValue(r);
		someMethod();
	}

	private static void makeItZero(RefactoringDemo r) {
		r.setCount();
	}

	private static void getValue(RefactoringDemo r) {
		int counter = r.getCount();
		System.out.println(counter);
	}

	private static void decrementing(RefactoringDemo r) {
		r.decrement();
	}

	private static void incrementing(RefactoringDemo r) {
		r.increment();
	}
	
	public static void someMethod() {
		// TODO Auto-generated method stub
		System.out.println("Hello world!"); 

	}

}
