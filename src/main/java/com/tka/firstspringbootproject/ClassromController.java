package com.tka.firstspringbootproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("classrooms")
public class ClassromController {

	@GetMapping("test")
	public String testEndpoint() {
		return "Test Endpoint is Working!";
	}

	@Autowired
	Classroomservice classroomservice;

	@GetMapping("allclassroom")
	public List<Classroom> fetchAllClassrooms() {
		return classroomservice.fectchallclassroom();
	}
	@GetMapping("alldata")
	public List<Classroom> getallData() {
		
		 return classroomservice.getallData();
		 
	}
	
	@PutMapping("update")
	public void udatedata() {
		classroomservice.udatedata();
		
	}
	@DeleteMapping("delete")
	public void deletedata()
	{
		classroomservice.deletedata();

	}
  
	@GetMapping("insert")
	public void insertData()
	{
		classroomservice.insertData();
	}
}
