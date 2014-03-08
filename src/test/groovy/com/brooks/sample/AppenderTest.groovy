/**
 * 
 */
package com.brooks.sample;

import org.junit.Test;

import com.brooks.sample.client.Appender;

/**
 * @author tbrooks
 *
 */
class AppenderTest {
	
	@Test
	void testAppend(){
		Appender appender = new Appender("hello", "world")
		assert 'helloworld' == appender.appendedString
	}
}
