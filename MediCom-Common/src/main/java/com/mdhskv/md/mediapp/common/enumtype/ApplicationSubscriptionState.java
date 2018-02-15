package com.mdhskv.md.mediapp.common.enumtype;

public enum ApplicationSubscriptionState {
	NOTREGISTERED, 				
	REGISTERED, 				
	REINSTALLED, 				
	ACTIVATED,					
	APPLICATION_LOCKED,				
	APPLICATION_PIN_LOCKED,		 
	RESTRICTED,				
	TERMINATED; 			 
	
	public enum Reason{
		DEVICE_LOST, 
		DEVICE_FOUND, 
		APPLICATION_PIN_TRY_EXEEDED, 
		PIN_RESET,
		NO_FUTURE_USED; 
	}
}
