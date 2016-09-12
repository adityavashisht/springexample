package com.indasil.springexample;

import com.indasil.SpringAnnotate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vashishta on 9/7/16.
 */
public class SpringMainTest {

    public static void main(String [] args) {

        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext(new String[] {"/spring-annotation.xml"});

        A a = (A) context.getBean("a");
        B b = (B) context.getBean("b");

        b.execute();

        a.checkBAlive();


        AnnotationConfigApplicationContext annotationConfigApplicationContext
                = new AnnotationConfigApplicationContext(SpringAnnotate.class);

        a = (A) annotationConfigApplicationContext.getBean("a");

        System.out.println("Testing via annotation config");
        a.checkBAlive();

        a = (A) annotationConfigApplicationContext.getBean("a");
        System.out.println("Testing Over");
    }
}
