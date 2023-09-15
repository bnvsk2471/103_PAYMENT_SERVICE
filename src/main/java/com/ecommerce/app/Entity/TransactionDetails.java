package com.ecommerce.app.Entity;

import java.time.Instant;

import com.ecommerce.app.Model.PaymentMode;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "TRANSACTION_DETAILS")
public class TransactionDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;
	
	@Column(name = "ORDER_ID")
	private long orderId;
	
	@Column(name = "PAYMENT_MODE")
	private String paymentMode;
	
	@Column(name = "REFERANCE_NUMBER")
	private String referanceNumber;
	
	@Column(name = "PAYMENT_DATE")
	private Instant paymentDate;
	
	@Column(name = "AMOUNT")
	private long amount;

}
