/**
 * 
 */
package com.brooks.sample.client;

/**
 * @author tbrooks
 *
 */
public class Appender {
	private final String appendedString;
	
	public Appender(String one, String two){
		appendedString = one + two;
	}

	public String getAppendedString() {
		return appendedString;
	}
	
}
