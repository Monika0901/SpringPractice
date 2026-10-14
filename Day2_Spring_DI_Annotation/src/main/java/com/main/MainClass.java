package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.myConfigClass;
import com.entity.Student;
import com.entity.Subject;

public class MainClass {

    public static void main(String args[]) {

        ApplicationContext context = new AnnotationConfigApplicationContext(myConfigClass.class);

        Student s = context.getBean( Student.class);
        Student s1 =context.getBean( Student.class); 
        Subject s2 = context.getBean(Subject.class);

        System.out.println(s);
        System.out.println(s2);

        //this come true when we use scope as singleton
        System.out.println(s == s1);
    }
}