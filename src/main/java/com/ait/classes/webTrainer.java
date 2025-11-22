package com.ait.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class webTrainer {

	String name,message;
    getPracticeTime practiceTime; 
	
	
	@Autowired
	public void practiceTime(getPracticeTime practiceTime) {
		
		this.practiceTime=practiceTime;
		
	}
	@Autowired
	public void setName(@Value("Praveen sir")String name) {
		this.name = name;
	}
    @Autowired
	public void setMessage( @Value("create webpages")String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "webTrainer "+ name +" says " + message;
	}
	
	public void practiceDuration() {
		System.out.println(practiceTime.getTime());
	}
}
