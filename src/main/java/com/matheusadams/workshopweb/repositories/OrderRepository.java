package com.matheusadams.workshopweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusadams.workshopweb.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
