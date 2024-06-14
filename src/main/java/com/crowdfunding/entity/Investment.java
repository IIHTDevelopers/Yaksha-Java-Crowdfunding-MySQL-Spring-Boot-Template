package com.crowdfunding.entity;

public class Investment {
	private Long id;

	private Double amount;

	private String investorName;

	private Project project;

	public Investment() {
		super();
	}

	public Investment(Long id, Double amount, String investorName, Project project) {
		super();
		this.id = id;
		this.amount = amount;
		this.project = project;
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

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public String getInvestorName() {
		return investorName;
	}

	public void setInvestorName(String investorName) {
		this.investorName = investorName;
	}

	@Override
	public String toString() {
		return "Investment [id=" + id + ", amount=" + amount + ", investorName=" + investorName + ", project=" + project
				+ "]";
	}
}
