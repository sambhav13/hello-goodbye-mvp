package com.great.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class MainScreenPlace extends Place {
	String placeName;

	public MainScreenPlace(String placeName){
		this.placeName = placeName;
	}
	
	public String getPlaceName() {
		return placeName;
	}
	public static class Tokenizer implements PlaceTokenizer<MainScreenPlace>{

		@Override
		public MainScreenPlace getPlace(String token) {
			return new MainScreenPlace(token);
		}

		@Override
		public String getToken(MainScreenPlace place) {
			return place.getPlaceName();
		}
	}
}