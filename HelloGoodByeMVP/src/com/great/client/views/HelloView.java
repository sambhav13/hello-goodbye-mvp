package com.great.client.views;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.great.client.activity.HelloActivity.Display;

public class HelloView extends Composite implements Display{
	TextBox txtName = new TextBox();
	Button btnSayHello = new Button("Say Hello");
	Label lblStatus = new Label();
	public HelloView(){
		FlexTable form = new FlexTable();
		form.setText(0,0,"Your Name:");
		form.setWidget(0,1,txtName);
		form.setWidget(1,1,btnSayHello);
		form.setWidget(2,0,lblStatus);
		lblStatus.setStyleName("status_display");
		initWidget(form);
	}
	public TextBox getTxtName() {
		return txtName;
	}
	public Button getBtnSayHello() {
		return btnSayHello;
	}
	public IsWidget widget() {
		return this;
	}
	public Label getLblStatus() {
		return lblStatus;
	}
	
}
