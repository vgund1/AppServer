package com.mdhskv.md.mediapp.common.enumtype;

public enum ApplicationSubscriptionState {
	NOTREGISTERED, 				
	REGISTERED, 				
	REINSTALLED, 				
	ACTIVATED,					
	WALLET_LOCKED,				
	WALLET_PIN_LOCKED,		 
	RESTRICTED,				
	TERMINATED; 			 
	
	public enum Reason{
		DEVICE_LOST, 
		DEVICE_FOUND, 
		WALLET_PIN_TRY_EXEEDED, 
		PIN_RESET,
		NO_FUTURE_USED; 
	}
}
