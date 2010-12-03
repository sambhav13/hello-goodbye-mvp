package com.great.client.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.great.client.common.AppConstants;
import com.great.client.common.ClientFactory;
import com.great.client.place.GoodByePlace;
import com.great.client.place.HelloPlace;

public class MainScreenActivity implements Activity {
	public interface Display{
		public Label getLnkHello();
		public Label getLnkGoodbye();
		public IsWidget widget();		
	}
	Display display;
	ClientFactory clientFactory;
	public MainScreenActivity(ClientFactory clientFactory){
		this.display = clientFactory.getMainScreenView();
		this.clientFactory = clientFactory;
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
		display.getLnkHello().addClickHandler(new ClickHandler(){
			@Override
			public void onClick(ClickEvent event) {
				goTo(new HelloPlace(AppConstants.HELLO_PLACE_NAME));
			}
		});
		display.getLnkGoodbye().addClickHandler(new ClickHandler(){
			@Override
			public void onClick(ClickEvent event) {
				goTo(new GoodByePlace(AppConstants.GOODBYE_PLACE_NAME));
			}
		});
	}
	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		bind();
		panel.setWidget(display.widget());
		
	}
	public void goTo(Place place){
		clientFactory.getPlaceController().goTo(place);
	}
}
