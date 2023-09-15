package com.ecommerce.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.app.Model.PaymentRequest;
import com.ecommerce.app.Service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;

	@PostMapping
	public ResponseEntity<Long> doPayment(
			@RequestBody PaymentRequest paymentRequest){
		return new ResponseEntity<Long>(paymentService.doPayment(paymentRequest),
				HttpStatus.OK);
	}
}
