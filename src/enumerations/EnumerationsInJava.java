package enumerations;


public class EnumerationsInJava {

	public static void main(String[] args) {

		Priority priority = Priority.HIGH;
		
		switch (priority) {
		case HIGH:
			System.out.println("High priority");
			break;
		case MEDIUM:
			System.out.println("Medium priority");
			break;
		case LOW:
			System.out.println("Low priority");
			break;
		}
		
		System.out.println("============ Enum valueOf()");
		
		System.out.println("Priority.HIGH == Priority.MEDIUM: " 
				+ (priority == Priority.MEDIUM));	// false

		System.out.println("Priority.HIGH == Priority.HIGH: " 
				+ (priority == Priority.HIGH));	// true


		System.out.println("============ Enum ordinal()");

		System.out.println("Priority.HIGH.ordinal(): " + Priority.HIGH.ordinal());
		System.out.println("Priority.MEDIUM.ordinal(): " + Priority.MEDIUM.ordinal());


		System.out.println("============ Enum iteration");

		Priority[] values = Priority.values();
		for (Priority priority3 : values) {
			System.out.println(priority3);
		}


		System.out.println("============ Enum fields and methods");

		System.out.println("Month.JANUARY.getDaysAmount(): " + Month.JANUARY.getDaysAmount());
		
		
	}

}
