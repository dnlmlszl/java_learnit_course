package enumerations;

public enum MessageType {
	A(Priority.HIGH),
	B(Priority.MEDIUM),
	C(Priority.LOW),
	D(Priority.LOW);
	
	private Priority priority;
	
	private MessageType(Priority priority) {
		this.priority = priority;
	}
	public Priority getPriority() {
		return this.priority;
	}
	public static MessageType fromString(String type) {
        switch (type.toUpperCase()) {
            case "A":
                return A;
            case "B":
                return B;
            case "C":
                return C;
            case "D":
                return D;
            default:
                return null;
        }
    }

}
