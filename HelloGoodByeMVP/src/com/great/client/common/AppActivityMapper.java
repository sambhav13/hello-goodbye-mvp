package com.great.client.common;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.great.client.activity.GoodbyeActivity;
import com.great.client.activity.HelloActivity;
import com.great.client.activity.MainScreenActivity;
import com.great.client.place.GoodByePlace;
import com.great.client.place.HelloPlace;
import com.great.client.place.MainScreenPlace;

public class AppActivityMapper implements ActivityMapper{
    private ClientFactory clientFactory;

    public AppActivityMapper(ClientFactory clientFactory) {
        super();
        this.clientFactory = clientFactory;
    }

    public Activity getActivity(Place place) {
        if (place instanceof HelloPlace)
            return new HelloActivity(clientFactory);
        else if(place instanceof GoodByePlace)
        	return new GoodbyeActivity(clientFactory);
        else if(place instanceof MainScreenPlace)
        	return new MainScreenActivity(clientFactory);
        return null;
    }
}
