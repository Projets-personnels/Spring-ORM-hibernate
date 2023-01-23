package com.spring.orm.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {
	
	
	private HibernateTemplate hibernateTemplate;
	
	
	
	public HibernateTemplate getTemplate() {
		return hibernateTemplate;
	}



	public void setTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	@Transactional

	public int insert(Student student) {
		
		
		Integer r = (Integer) this.hibernateTemplate.save(student);
		return r;
	}
}
