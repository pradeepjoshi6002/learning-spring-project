package com.pradeep.learnspringproject_01.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Address(String street,String city){}
record Person(String name,int age,Address address){}
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Pradeep";
    }
    @Bean
    public int age(){
        return 21;
    }
    @Bean
    public Person person(){
        return  new Person("Pradeep",21,new Address("Baker Street","London"));
    }
    @Bean
    public Person person2methodCall(){
        return new Person(name(),age(),address3());
    }
    @Bean
    public Person person3Parameters(String name,int age,Address address2){
        return new Person(name,age,address2);
    }
    @Bean
    public Person person4Qualifier(String name,int age,Address address){
        return new Person(name,age,address);
    }
    @Bean
    @Qualifier("address2Qualifier")
    public Address address2(){
        return new Address("old town road","Delhi");
    }
    @Bean(name = "getAddress")
    @Primary
    public  Address address3(){
        return new Address("Baker Street","New Delhi");
    }


}
