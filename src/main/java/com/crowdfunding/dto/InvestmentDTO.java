package com.crowdfunding.dto;

public class InvestmentDTO {
	private Long id;

	private Double amount;

	private String investorName;

	private Long projectId;

	public InvestmentDTO() {
		super();
	}

	public InvestmentDTO(Long id, Double amount, String investorName, Long projectId) {
		super();
		this.id = id;
		this.amount = amount;
		this.projectId = projectId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getInvestorName() {
		return investorName;
	}

	public void setInvestorName(String investorName) {
		this.investorName = investorName;
	}

	@Override
	public String toString() {
		return "InvestmentDTO [id=" + id + ", amount=" + amount + ", investorName=" + investorName + ", projectId="
				+ projectId + "]";
	}
}
