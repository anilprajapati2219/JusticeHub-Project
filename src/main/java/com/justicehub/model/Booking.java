package com.justicehub.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String clientName;
    private String appointmentDate;

    @ManyToOne
    @JoinColumn(name = "advocate_id")
    private Advocate advocate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public Advocate getAdvocate() {
		return advocate;
	}

	public void setAdvocate(Advocate advocate) {
		this.advocate = advocate;
	}

	public Booking(Long id, String clientName, String appointmentDate, Advocate advocate) {
		super();
		this.id = id;
		this.clientName = clientName;
		this.appointmentDate = appointmentDate;
		this.advocate = advocate;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", clientName=" + clientName + ", appointmentDate=" + appointmentDate
				+ ", advocate=" + advocate + "]";
	}

    
}
