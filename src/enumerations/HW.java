package enumerations;

import java.util.Scanner;

public class HW {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		MessageType messageType = null;
		
		while (true) {
			System.out.println("Enter message type (A, B, C, D):");
			String input = scanner.nextLine();
			
			if (input.isEmpty()) break;
			
			messageType = MessageType.fromString(input);
			
			if (messageType == null) {
				System.out.println("Invalid message type. Please enter A, B, C or D.");
				continue;
			}
		}
		
		System.out.println("Message type priority: " + messageType.getPriority());
        

	}

}
