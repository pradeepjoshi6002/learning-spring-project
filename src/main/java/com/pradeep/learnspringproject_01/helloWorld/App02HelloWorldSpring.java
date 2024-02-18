package com.pradeep.learnspringproject_01.helloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {

    public static void main(String[] args) {
        //launch a spring context
        try(var context=new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
            //2. configure the things that we want the spring to manage
            // helloWorldConfiguration -> @Configuration
            // name-> @Bean

            //3.retrieving beans managed by Spring
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("person2methodCall"));
            System.out.println(context.getBean("person3Parameters"));
            System.out.println(context.getBean("getAddress"));
            System.out.println(context.getBean(Address.class));
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean("person4Qualifier"));
        }
        //using try-resource block for resource-leak due to not-closing context at end

    }
}
