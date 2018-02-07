package com.mdhskv.md.mediapp.ci.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.mdhskv.md.mediapp.bean.MediComSubscriptionToContext;
import com.mdhskv.md.mediapp.bean.SubscribeMediComSericeRs;


@Component
public class MediComSubscriptionRsponseToContextConverter implements Converter<SubscribeMediComSericeRs, MediComSubscriptionToContext>{

	@Override
	public MediComSubscriptionToContext convert(SubscribeMediComSericeRs source) {
		
		MediComSubscriptionToContext mediComSubscriptionToContext = new MediComSubscriptionToContext();
		mediComSubscriptionToContext.setId("swapnil");
		return mediComSubscriptionToContext;
	}

	

	
}
