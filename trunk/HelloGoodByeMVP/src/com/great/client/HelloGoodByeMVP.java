package com.great.client;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.great.client.common.AppActivityMapper;
import com.great.client.common.AppConstants;
import com.great.client.common.AppPlaceHistoryMapper;
import com.great.client.common.ClientFactory;
import com.great.client.place.MainScreenPlace;


public class HelloGoodByeMVP implements EntryPoint {
	ClientFactory clientFactory = GWT.create(ClientFactory.class);
	private SimplePanel appWidget = new SimplePanel();
	AppPlaceHistoryMapper historyMapper= GWT.create(AppPlaceHistoryMapper.class);
	PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historyMapper);	
	MainScreenPlace defaultPlace = new MainScreenPlace(AppConstants.MAINSCREEN_PLACE_NAME);
	public void onModuleLoad() {
		 ClientFactory clientFactory = GWT.create(ClientFactory.class);
	        EventBus eventBus = clientFactory.getEventBus();
	        PlaceController placeController = clientFactory.getPlaceController();

	        // Start ActivityManager for the main widget with our ActivityMapper
	        ActivityMapper activityMapper = new AppActivityMapper(clientFactory);
	        ActivityManager activityManager = new ActivityManager(activityMapper, eventBus);
	        activityManager.setDisplay(appWidget);

	        // Start PlaceHistoryHandler with our PlaceHistoryMapper
	        historyHandler.register(placeController, eventBus, defaultPlace);

	        RootPanel.get().add(appWidget);
	        // Goes to the place represented on URL else default place
	        historyHandler.handleCurrentHistory();
	}
}