package com.justicehub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.justicehub.dto.AdvocateDTO;
import com.justicehub.model.Advocate;
import com.justicehub.repository.AdvocateRepository;

import java.util.List;

@Service
public class AdvocateService {
    @Autowired
    private AdvocateRepository advocateRepository;

    public List<Advocate> getAllAdvocates() {
        return advocateRepository.findAll();
    }

    public Advocate getAdvocateById(Long id) {
        return advocateRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Advocate not found"));
    }

	public Advocate addAdvocate(Advocate advocate) {
		// TODO Auto-generated method stub
		Advocate b=advocateRepository.save(advocate);
		return b;
	}
    
//    public Advocate addAdvocate(AdvocateDTO advocateDTO) {
//        Advocate advocate = new Advocate(null, null, null, null, null, null, null);
//        advocate.setName(advocateDTO.getName());
//        advocate.setEducation(advocateDTO.getEducation());
//        advocate.setPosition(advocateDTO.getPosition());
//        advocate.setExperience(advocateDTO.getExperience());
//
//        return advocateRepository.save(advocate);
//    }
}
