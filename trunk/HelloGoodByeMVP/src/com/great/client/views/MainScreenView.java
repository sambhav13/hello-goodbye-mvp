package com.great.client.views;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.great.client.activity.MainScreenActivity.Display;

public class MainScreenView extends Composite implements Display {
	Label lnkHello = new Label();
	Label lnkGoodbye = new Label();
	public MainScreenView(){
		HorizontalPanel panel = new HorizontalPanel();
		panel.setSpacing(10);
		lnkHello.setText("Go to Hello");
		lnkGoodbye.setText("Go to Goodbye");
		panel.add(lnkHello);
		panel.add(lnkGoodbye);
		initWidget(panel);
	}
	public Label getLnkHello() {
		return lnkHello;
	}
	public Label getLnkGoodbye() {
		return lnkGoodbye;
	}
	public IsWidget widget(){
		return this;
	}
}
