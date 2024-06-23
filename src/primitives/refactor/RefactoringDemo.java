package primitives.refactor;

public class RefactoringDemo extends Refactor {
	private int counter;
	
	public RefactoringDemo() {
		this.counter = 0;
	}
	
	public void increment() {
        counter++;
        
    }
	
	public void decrement() {
		counter--;
	}
	
	public void setCount() {
		counter = 0;
	}

    public int getCount() {
        return counter;
    }

}
