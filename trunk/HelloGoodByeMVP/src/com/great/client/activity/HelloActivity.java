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

public class HelloActivity implements Activity {
	public interface Display{
		public TextBox getTxtName();
		public Button getBtnSayHello();
		public Label getLblStatus();
		public IsWidget widget();
	}
	Display display;
	public HelloActivity(ClientFactory clientFactory){
		this.display = clientFactory.getHelloView();
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
		display.getLblStatus().setText("");
		display.getBtnSayHello().addClickHandler(new ClickHandler(){
			@Override
			public void onClick(ClickEvent event) {
				display.getLblStatus().setText("Hello " + display.getTxtName().getText());
			}
		});
	}
	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		bind();
		panel.setWidget(display.widget());
	}

}