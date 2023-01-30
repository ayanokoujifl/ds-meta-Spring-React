package com.ayanokouji.dsmeta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.ayanokouji.dsmeta.entities.Sale;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Service
public class SmsService {

	@Autowired
	private SaleService saleService;

	@Value("${twilio.sid}")
	private String twilioSid;

	@Value("${twilio.key}")
	private String twilioKey;

	@Value("${twilio.phone.from}")
	private String twilioPhoneFrom;

	@Value("${twilio.phone.to}")
	private String twilioPhoneTo;

	public void sendSms(Long id) {
		Sale obj = saleService.findById(id);
		Twilio.init(twilioSid, twilioKey);

		String date = obj.getDate().getDayOfMonth()+"/"+obj.getDate().getMonthValue()+"/"+obj.getDate().getYear();
		
		String msg = "Vendedor: " + obj.getSellerName() + "\nValor da venda: " + String.format("%.2f",obj.getAmount()) + "\nData da venda: "
				+ date;
		PhoneNumber to = new PhoneNumber(twilioPhoneTo);
		PhoneNumber from = new PhoneNumber(twilioPhoneFrom);

		Message message = Message.creator(to, from, msg).create();

		System.out.println(message.getSid());
	}
}