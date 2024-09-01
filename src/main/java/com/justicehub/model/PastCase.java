package com.justicehub.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class PastCase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String caseName;
    private String outcome;

    @ManyToOne
    @JoinColumn(name = "advocate_id")
    private Advocate advocate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCaseName() {
		return caseName;
	}

	public void setCaseName(String caseName) {
		this.caseName = caseName;
	}

	public String getOutcome() {
		return outcome;
	}

	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}

	public Advocate getAdvocate() {
		return advocate;
	}

	public void setAdvocate(Advocate advocate) {
		this.advocate = advocate;
	}

	public PastCase(Long id, String caseName, String outcome, Advocate advocate) {
		super();
		this.id = id;
		this.caseName = caseName;
		this.outcome = outcome;
		this.advocate = advocate;
	}

	@Override
	public String toString() {
		return "PastCase [id=" + id + ", caseName=" + caseName + ", outcome=" + outcome + ", advocate=" + advocate
				+ "]";
	}
}
