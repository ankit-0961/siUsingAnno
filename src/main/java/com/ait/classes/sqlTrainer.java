package com.ait.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class sqlTrainer {

	String name,message;
	getPracticeTime practiceTime; 
		
		
	@Autowired
	public void practiceTime(getPracticeTime practiceTime) {
			
	this.practiceTime=practiceTime;
			
		}
	@Autowired
	public void setName(@Value("Rajesh sir") String name) {
		this.name = name;
	}
    @Autowired
	public void setMessage(@Value("Practice Queries everyday") String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "sqlTrainer "+ name +" says " + message;
	}
	public void practiceDuration() {
		System.out.println(practiceTime.getTime());
	}
}
