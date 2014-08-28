/**
 * 
 */
package com.brooks.sample.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * @author tbrooks
 *
 */
public interface ServiceAsync {

	public void getValue(AsyncCallback<String> callback);
}
