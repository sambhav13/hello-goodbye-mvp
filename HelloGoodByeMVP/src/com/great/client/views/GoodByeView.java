package com.great.client.views;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.great.client.activity.GoodbyeActivity.Display;;

public class GoodByeView extends Composite implements Display{
	TextBox txtGoodByeName = new TextBox();
	Button btnSayGoodBye = new Button("Say Goodbye");
	Label lblStatus = new Label();
	public GoodByeView(){
		FlexTable form = new FlexTable();
		form.setText(0,0,"Your Name:");
		form.setWidget(0,1,txtGoodByeName);
		form.setWidget(1,1,btnSayGoodBye);
		form.setWidget(2,0,lblStatus);
		lblStatus.setStyleName("status_display");
		initWidget(form);
	}
	public TextBox getTxtGoodByeName() {
		return txtGoodByeName;
	}
	public Button getBtnSayGoodBye() {
		return btnSayGoodBye;
	}
	public IsWidget widget(){
		return this;
	}
	public Label getLblStatus() {
		return lblStatus;
	}
	
}