package com.crowdfunding.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crowdfunding.dto.InvestmentDTO;
import com.crowdfunding.service.InvestmentService;

@Service
public class InvestmentServiceImpl implements InvestmentService {

	@Override
	public InvestmentDTO makeInvestment(InvestmentDTO investmentDTO) {
		// write your logic here
		return null;
	}

	@Override
	public InvestmentDTO updateInvestment(Long investmentId, InvestmentDTO investmentDTO) {
		// write your logic here
		return null;
	}

	@Override
	public boolean deleteInvestment(Long investmentId) {
		// write your logic here
		return false;
	}

	@Override
	public InvestmentDTO getInvestmentById(Long investmentId) {
		// write your logic here
		return null;
	}

	@Override
	public List<InvestmentDTO> getInvestmentsByProjectId(Long projectId) {
		// write your logic here
		return null;
	}

	@Override
	public List<InvestmentDTO> getInvestmentsByInvestorName(String investorName) {
		// write your logic here
		return null;
	}
}
