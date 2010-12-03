package com.great.client.common;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;
import com.great.client.views.GoodByeView;
import com.great.client.views.HelloView;
import com.great.client.views.MainScreenView;

public class ClientFactory{
 
 EventBus eventBus = new SimpleEventBus();
 PlaceController placeController = new PlaceController(eventBus);
 HelloView helloView = new HelloView();
 GoodByeView goodByeView = new GoodByeView(); 	
 MainScreenView mainScreenView = new MainScreenView();
 
 public EventBus getEventBus() {
		return eventBus;
 }

 public PlaceController getPlaceController() {
		return placeController;
 }

public HelloView getHelloView() {
	return helloView;
}

public GoodByeView getGoodByeView() {
	return goodByeView;
}

public MainScreenView getMainScreenView() {
	return mainScreenView;
}
 
}
