package com.justicehub.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Advocate {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private String education;
	    private String position;
	    private String experience;
	    private String pastCases;
	    
	    

		public Advocate() {
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEducation() {
			return education;
		}

		public void setEducation(String education) {
			this.education = education;
		}

		public String getPosition() {
			return position;
		}

		public void setPosition(String position) {
			this.position = position;
		}

		public String getExperience() {
			return experience;
		}

		public void setExperience(String experience) {
			this.experience = experience;
		}

		public String getPastCases() {
			return pastCases;
		}

		public void setPastCases(String pastCases) {
			this.pastCases = pastCases;
		}

		public Advocate(Long id, String name, String education, String position, String experience, String pastCases) {
			super();
			this.id = id;
			this.name = name;
			this.education = education;
			this.position = position;
			this.experience = experience;
			this.pastCases = pastCases;
		}

		@Override
		public String toString() {
			return "Advocate [id=" + id + ", name=" + name + ", education=" + education + ", position=" + position
					+ ", experience=" + experience + ", pastCases=" + pastCases + "]";
		}
		
		
	    
	    
	    
//	    @OneToMany(mappedBy = "advocate", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	    private List<Review> reviews;

//	    @OneToMany(mappedBy = "advocate", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	    private List<PastCase> pastCases;
	    
	       
	    
	}
