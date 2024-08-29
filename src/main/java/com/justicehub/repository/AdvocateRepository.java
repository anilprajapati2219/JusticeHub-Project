package com.justicehub.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.justicehub.model.Advocate;

public interface AdvocateRepository extends JpaRepository<Advocate, Long> {
}
