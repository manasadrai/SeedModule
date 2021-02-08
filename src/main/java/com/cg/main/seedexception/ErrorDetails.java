package com.cg.main.seedexception;


import java.time.LocalDate;
/**
*
* @author manasa
* 
* Error details class is the POJO class for handling error details
* with variables as message, date and details,
* constructors, getters and setters , toString() is declared.
*/
public class ErrorDetails {

	/**
	 * variable declaration
	 */
	private String message;
	private LocalDate date;
	private String details;

	/**
	 * default construction
	 */
	public ErrorDetails() {
		
	}

	/**
	 * parameterized constructor
	 * @param message
	 * @param date
	 * @param details
	 */
	public ErrorDetails(String message, LocalDate date, String details) {
		super();
		this.message = message;
		this.date = date;
		this.details = details;
	}
	/**
	 * getter and setter for message 
	 * @return
	 */
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * getter and setter for date
	 * @return
	 */
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * getter and setter for error details
	 * @return
	 */
	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}
