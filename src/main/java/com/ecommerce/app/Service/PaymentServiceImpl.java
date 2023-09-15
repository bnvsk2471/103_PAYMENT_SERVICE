package com.ecommerce.app.Service;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.app.Entity.TransactionDetails;
import com.ecommerce.app.Model.PaymentRequest;
import com.ecommerce.app.Repository.PaymentRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class PaymentServiceImpl implements PaymentService {

	
	@Autowired
	
	private PaymentRepository paymentRepository;
	
	@Override
	public Long doPayment(PaymentRequest paymentRequest) {
		log.info("Recording payment details: {}",paymentRequest);
		TransactionDetails transactionDetails=
				TransactionDetails.builder()
				.paymentDate(Instant.now())
				.paymentMode(paymentRequest.getPaymentMode().name())
				.paymentMode("SUCCESS")
				.orderId(paymentRequest.getOrderId())
				.referanceNumber(paymentRequest.getReferanceNumber())
				.amount(paymentRequest.getAmount())
				.build();
		
		paymentRepository.save(transactionDetails);
		log.info("Transaction complete with ID: {}",transactionDetails);
		return transactionDetails.getId();
	}

}
