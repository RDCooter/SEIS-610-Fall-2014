package edu.stthomas.seis610.util;

/**
 * Generic exception class that can be used to process various exception conditions that can be generated by the GP.
 * 
 * @author Robert Driesch cooter Nov 7, 2014 5:04:05 PM
 */
public class GPException extends Exception {

	private static final long serialVersionUID = 1L;

	public GPException(String msg) {
		super(msg);
	}
}
