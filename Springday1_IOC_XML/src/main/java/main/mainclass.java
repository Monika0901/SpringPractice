package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.employee;

public class mainclass {
	
	public static void  main (String []args) {
		ApplicationContext  context = new ClassPathXmlApplicationContext("springbeans.xml");
		
		employee emp = context.getBean("emp",employee.class);
		employee emp1 = context.getBean("emp",employee.class);
//		
//		emp.setId(123);
//		emp.setName("riya");
//		emp.setCity("pune");
//		emp.setAge(25);
		
		System.out.println(emp);

		System.out.println(emp.hashCode());
		System.out.println(emp1.hashCode());
		System.out.println(emp == emp1);
		
	}

}
