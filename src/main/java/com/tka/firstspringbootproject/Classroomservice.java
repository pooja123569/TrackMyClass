package com.tka.firstspringbootproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Classroomservice {

	@Autowired
	ClassroomDao Dao;

	public List<Classroom> fectchallclassroom() {
		System.err.println("I am service -fectchallclassroom");
		List<Classroom> allclassroom = Dao.fetchAllClassroom();
		return allclassroom;
	}
}