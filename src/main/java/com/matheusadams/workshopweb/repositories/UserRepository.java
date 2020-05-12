package com.matheusadams.workshopweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusadams.workshopweb.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
