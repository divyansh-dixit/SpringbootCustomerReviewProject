package com.example.RestApp2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RestApp2.Entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	

}
