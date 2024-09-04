package com.tka.firstspringbootproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")

public class Classroom {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String location;
	String capcity;

	public Classroom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Classroom(int id, String name, String location, String capcity) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.capcity = capcity;
	}

	@Override
	public String toString() {
		return "Classroom [id=" + id + ", name=" + name + ", location=" + location + ", capcity=" + capcity + "]";
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCapcity() {
		return capcity;
	}

	public void setCapcity(String capcity) {
		this.capcity = capcity;
	}

}
