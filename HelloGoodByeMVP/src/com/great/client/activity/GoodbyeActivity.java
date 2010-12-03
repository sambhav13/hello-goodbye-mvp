package com.great.client.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.great.client.common.ClientFactory;

public class GoodbyeActivity implements Activity {
	public interface Display{
		public TextBox getTxtGoodByeName();
		public Button getBtnSayGoodBye();
		public Label getLblStatus();
		public IsWidget widget();
	}
	ClientFactory clientFactory;
	Display display;
	public GoodbyeActivity(ClientFactory clientFactory){
		this.clientFactory = clientFactory;
		this.display = clientFactory.getGoodByeView();
	}
	@Override
	public String mayStop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onCancel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		
	}
	private void bind(){
		display.getTxtGoodByeName().setText("");
		display.getBtnSayGoodBye().addClickHandler(new ClickHandler(){
			@Override
			public void onClick(ClickEvent event) {
				display.getLblStatus().setText("Goodbye " + display.getTxtGoodByeName().getText());
			}
		});
	}
	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		bind();
		panel.setWidget(display.widget());
	}

}
