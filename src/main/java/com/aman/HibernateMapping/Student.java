package com.aman.HibernateMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {

	@Id @ GeneratedValue
	public int id;
	public String name;
	public String address;
	public long phone;
	
//	//FOr OnetoOne
//	@OneToOne
//	public Course course;
//	public Course getCourse() {
//	return course;
//	}
//	public void setCourse(Course course) {
//	this.course = course;
//	}
	
	//FOr OnetoMany
	@OneToMany//(mappedBy ="student")
	public List<Course> list = new ArrayList<>();
		
	public List<Course> getList() {
		return list;
	}
	public void setList(List<Course> list) {
		this.list = list;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
}
