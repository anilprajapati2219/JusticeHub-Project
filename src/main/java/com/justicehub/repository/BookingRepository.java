package com.justicehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.justicehub.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}