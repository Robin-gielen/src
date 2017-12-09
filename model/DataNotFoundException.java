package model;

public class DataNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Parameterless Constructor
    public DataNotFoundException() {}

    // Constructor that accepts a message
    public DataNotFoundException(String message)
    {
       super(message);
    }
}
