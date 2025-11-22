package com.ait.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class getPracticeTime 
{

	private String time;
    @Autowired
	public void setTime(@Value("practice time is two hours")String time) {
		this.time = time;
	}
	public String getTime() {
		return time;
	}
    
    
	
	
}
