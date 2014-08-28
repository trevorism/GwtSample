/**
 * 
 */
package com.brooks.sample.server;

import com.brooks.groovy.Messanger;
import com.brooks.sample.client.Service;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * @author tbrooks
 *
 */


public class ServiceImpl extends RemoteServiceServlet implements Service{

	private static final long serialVersionUID = 1L;

	@Override
	public String getValue() {
		return new Messanger().getMessage();
	}

}
