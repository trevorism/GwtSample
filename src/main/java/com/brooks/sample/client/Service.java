/**
 * 
 */
package com.brooks.sample.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * @author tbrooks
 *
 */
@RemoteServiceRelativePath("service")
public interface Service extends RemoteService{

	public String getValue();
}
