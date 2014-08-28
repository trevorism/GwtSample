/**
 * 
 */
package com.brooks.sample.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * @author tbrooks
 *
 */
public class SampleApplication implements EntryPoint {

	@Override
	public void onModuleLoad() {
		ServiceAsync serviceAsync = GWT.create(Service.class);
		final VerticalPanel vp = new VerticalPanel();
		RootPanel rootPanel = RootPanel.get();
		rootPanel.add(vp);
		vp.add(new Label("Hi"));
		
		serviceAsync.getValue(new AsyncCallback<String>() {
			
			@Override
			public void onSuccess(String result) {
				vp.add(new Label(result));
			}
			
			@Override
			public void onFailure(Throwable caught) {
				vp.add(new Label("FAILURE"));
				
			}
		});
		
	}

}
