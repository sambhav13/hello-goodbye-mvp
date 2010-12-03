package com.great.client.common;

import com.google.gwt.place.shared.WithTokenizers;
import com.great.client.place.GoodByePlace;
import com.great.client.place.HelloPlace;
import com.great.client.place.MainScreenPlace;

@WithTokenizers({HelloPlace.Tokenizer.class,GoodByePlace.Tokenizer.class,MainScreenPlace.Tokenizer.class})
public interface AppPlaceHistoryMapper extends com.google.gwt.place.shared.PlaceHistoryMapper {

}