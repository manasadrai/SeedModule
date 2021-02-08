package com.cg.main.seedexception;
/**
*
* @author manasa
* 
* SeedNotFoundException class that handles the exception raised by the seed module
*/
public class SeedNotFoundException extends RuntimeException {

	public SeedNotFoundException() {

	}

	/**
	 * 
	 * @param message
	 */
	public SeedNotFoundException(String message) {
		super(message);
	}

}
