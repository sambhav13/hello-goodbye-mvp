package com.great.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class GoodByePlace extends Place {
	String placeName;
	public GoodByePlace(String placeName){
		this.placeName = placeName;
	}
	public String getPlaceName() {
		return placeName;
	}
	public static class Tokenizer implements PlaceTokenizer<GoodByePlace>{

		@Override
		public GoodByePlace getPlace(String token) {
			return new GoodByePlace(token);
		}

		@Override
		public String getToken(GoodByePlace place) {
			return place.getPlaceName();
		}
		
	} 
}
