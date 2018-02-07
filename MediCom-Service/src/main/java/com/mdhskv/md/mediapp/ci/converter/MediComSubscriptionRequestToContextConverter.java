package com.mdhskv.md.mediapp.ci.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.mdhskv.md.mediapp.bean.MediComSubscriptionToContext;
import com.mdhskv.md.mediapp.bean.SubscribeMediComSericeRq;


@Component
public class MediComSubscriptionRequestToContextConverter implements Converter<SubscribeMediComSericeRq, MediComSubscriptionToContext>{

	@Override
	public MediComSubscriptionToContext convert(SubscribeMediComSericeRq source) {
		
		MediComSubscriptionToContext mediComSubscriptionToContext = new MediComSubscriptionToContext();
		mediComSubscriptionToContext.setId("vijay");
		return mediComSubscriptionToContext;
	}

	

	
}
