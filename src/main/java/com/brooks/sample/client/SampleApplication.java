/**
 * 
 */
package com.brooks.sample.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * @author tbrooks
 *
 */
public class SampleApplication implements EntryPoint {

	@Override
	public void onModuleLoad() {
		RootPanel rootPanel = RootPanel.get();
		rootPanel.add(new Label("Hello World"));
	}

}
