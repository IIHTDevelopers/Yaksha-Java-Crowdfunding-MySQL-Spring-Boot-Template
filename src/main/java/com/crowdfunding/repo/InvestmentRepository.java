package com.crowdfunding.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crowdfunding.entity.Investment;

public interface InvestmentRepository extends JpaRepository<Investment, Long> {

	// write your code for method to find list of investments associated with a specific project ID,
	// and it must return data in list
	

	
	// write your code for method to find list of investments made by an investor with the specified name,
	// and it must return data in list
	
}
