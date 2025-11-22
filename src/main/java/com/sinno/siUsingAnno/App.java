package com.sinno.siUsingAnno;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ait.classes.javaTrainer;
import com.ait.classes.sqlTrainer;
import com.ait.classes.webTrainer;

public class App {
  public static void main(String[] args) {
    
	  ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
	  
	  javaTrainer jt = (javaTrainer) ac.getBean("javaTrainer");
	  webTrainer wt = (webTrainer) ac.getBean("webTrainer");
	  sqlTrainer st = (sqlTrainer) ac.getBean("sqlTrainer");
	  
	  System.out.println(jt);
	  jt.practiceDuration();
	  System.out.println(wt);
	  wt.practiceDuration();
	  
	  System.out.println(st); 
	  st.practiceDuration();
	  

  }
}
 