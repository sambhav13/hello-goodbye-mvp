package com.great.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class HelloPlace extends Place{
	private String placeName;
	public HelloPlace(String placeName){
		this.placeName = placeName;
	}
	public String getPlaceName() {
		return placeName;
	}
	public static class Tokenizer implements PlaceTokenizer<HelloPlace>{

		@Override
		public HelloPlace getPlace(String token) {
 			return new HelloPlace(token);
		}

		@Override
		public String getToken(HelloPlace place) {
			return place.getPlaceName();
		}
	}
}
