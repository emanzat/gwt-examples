package com.gonevertical.client.app;

import com.gonevertical.client.app.activity.places.SignInPlace;
import com.gonevertical.client.app.activity.places.WalletEditPlace;
import com.gonevertical.client.app.activity.places.WalletListPlace;
import com.gonevertical.client.app.requestfactory.ApplicationRequestFactory;
import com.gonevertical.client.app.requestfactory.dto.UserDataProxy;
import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;


public interface ClientFactory {
  
	EventBus getEventBus();
	
	ApplicationRequestFactory getRequestFactory();
	
	PlaceController getPlaceController();

  void setUserData(UserDataProxy data);

  UserDataProxy getUserData();

  ActivityManager getActivityManager();
  
  
  SignInPlace.Tokenizer getSignInTokenizer();
  
  WalletListPlace.Tokenizer getWalletListTokenizer();
  
  WalletEditPlace.Tokenizer getWalletEditTokenizer();
}