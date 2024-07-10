package com.example.RestApp2.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="CustomerTable")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int Id;
	@Column(name="customerName")
	String CustomerName;
	
	@Column(name="customerReview")
	String CustomerReview;
	@Column(name="customerChoice")
	String CustomerChoice;
	
}