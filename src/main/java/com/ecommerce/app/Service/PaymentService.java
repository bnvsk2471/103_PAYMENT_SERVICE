package com.ecommerce.app.Service;

import com.ecommerce.app.Model.PaymentRequest;

public interface PaymentService {

	Long doPayment(PaymentRequest paymentRequest);

}
