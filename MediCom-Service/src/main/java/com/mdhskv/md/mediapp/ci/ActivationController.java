package com.mdhskv.md.mediapp.ci;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mdhskv.md.mediapp.activate.bean.ActivateMediServiceRq;
import com.mdhskv.md.mediapp.activate.bean.ActivateMediServiceRs;
import com.mdhskv.md.mediapp.activate.bean.CheckMediComAppUpdateRq;
import com.mdhskv.md.mediapp.activate.bean.CheckMediComAppUpdateRs;
import com.mdhskv.md.mediapp.activate.bean.GenerateOTPRq;
import com.mdhskv.md.mediapp.activate.bean.GenerateOTPRs;
import com.mdhskv.md.mediapp.activate.bean.GetMediComAppConfigRq;
import com.mdhskv.md.mediapp.activate.bean.GetMediComAppConfigRs;
import com.mdhskv.md.mediapp.activate.bean.ResendOTPRq;
import com.mdhskv.md.mediapp.activate.bean.ResendOTPRs;
import com.mdhskv.md.mediapp.activate.bean.SubscribeMediComSericeRq;
import com.mdhskv.md.mediapp.activate.bean.SubscribeMediComSericeRs;
import com.mdhskv.md.mediapp.activate.bean.VerifyOTPRq;
import com.mdhskv.md.mediapp.common.enumtype.MobileOSType;
import com.mdhskv.md.mediapp.common.enumtype.YesOrNo;
import com.mdhskv.md.mediapp.registry.vo.MediComAppVersion;
import com.mdhskv.md.mediapp.registry.vo.OneTimePassword;
import com.skcc.corpay.MediComAppConfiguration;

@RestController
@RequestMapping("/activate/{version}")
public class ActivationController{

	@Autowired
	ConversionService conversionService;
	
	private static Logger logger = LoggerFactory.getLogger(ActivationController.class);
	@RequestMapping(method = RequestMethod.POST, value = "/subscribeMediComService")
	public SubscribeMediComSericeRs subscribeMedicomService(SubscribeMediComSericeRq request) throws Exception {
		SubscribeMediComSericeRs response = new SubscribeMediComSericeRs();
		
		
		//need to do here 
		
		// take all data form request and convert as per server requirement,
		// save data DB for customer like mobile number,
		// save user name, password with private key encryption 
		// save Push info data
		
		/*MediComSubscriptionToContext context = conversionService.convert(req, MediComSubscriptionToContext.class);
		MediComSubscriptionToContext context1 = conversionService.convert(response, MediComSubscriptionToContext.class);
		System.out.println("seecodnd service"+ context1);
		System.out.println("after conversion" + context);*/
		
		return response;
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/activateMediComService")
	public ActivateMediServiceRs activateMediComService(ActivateMediServiceRq request) throws Exception {
		ActivateMediServiceRs response = new ActivateMediServiceRs();
		
		
		//need to do here 
		
		// validation Check
		//create Mobile Subscription check mobile already exits or not
		//generate MobileIdAndSave MobileInfo validate it 
		// activate Service		
		
		return response;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/generateOTP")
	
	public GenerateOTPRs generateOTP(@Valid @RequestBody GenerateOTPRq request) {
		GenerateOTPRs response = new GenerateOTPRs();
		OneTimePassword otp = null;//call to generate otp method
		response.setTransactionId(otp.getTransactionId());
		response.setExpiryTime(otp.getExpiryTime());
		return response;
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/resendOTP")
	
	public ResendOTPRs resendOTP(@Valid @RequestBody ResendOTPRq request) {

		OneTimePassword otp = null;//call resendotp method 
		
		ResendOTPRs response = new ResendOTPRs();
		response.setTransactionId(otp.getTransactionId());
		response.setExpiryTime(otp.getExpiryTime());
		response.setRetryCount(otp.getRetryCount());
		return response;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/verifyOTP")
	public VerifyOTPRs verifyOTP(@Valid  VerifyOTPRq request) {
		OneTimePassword otp = null; //verify OTP 
		VerifyOTPRs response = new VerifyOTPRs();
		response.setAuthenticationToken(otp.getAuthenticationToken());
		return response;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/checkMediComUpdate")
	public CheckMediComAppUpdateRs checkMediComUpdate(@Valid CheckMediComAppUpdateRq req)  {
		logger.debug("REQ[checkMediComUpdate] PARAM:{}", req);

		MobileOSType osType = MobileOSType.valueOf(req.getOsName());

		MediComAppVersion mediComAppVersion = null;//get data from DB//core server

		CheckMediComAppUpdateRs res = new CheckMediComAppUpdateRs();
		if (mediComAppVersion != null) {
			res.setExistUpdateVersion(YesOrNo.Y);
			res.setMandatoryYn(mediComAppVersion.isMandatory() ? YesOrNo.Y : YesOrNo.N);
			res.setUpdateVersion(mediComAppVersion.getMediComAppVersion());
			res.setDownloadUrl(mediComAppVersion.getDownloadUrl());
		} else {
			res.setExistUpdateVersion(YesOrNo.N);
		}

		return res;
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/getMediComConfig")
	public GetMediComAppConfigRs getMediComConfig(@Valid @RequestBody GetMediComAppConfigRq req)  {
		GetMediComAppConfigRs res = new GetMediComAppConfigRs();

		MediComAppConfiguration mediComAppConfiguration = null; // get app configuration from DB
		
		res.setMediComAppConfiguration(mediComAppConfiguration);
		
		return res;
	}

	
	
}