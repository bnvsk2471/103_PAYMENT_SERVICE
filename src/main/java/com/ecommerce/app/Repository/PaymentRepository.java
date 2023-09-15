package com.ecommerce.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.app.Entity.TransactionDetails;


@Repository
public interface PaymentRepository extends JpaRepository<TransactionDetails, Long> {

}
