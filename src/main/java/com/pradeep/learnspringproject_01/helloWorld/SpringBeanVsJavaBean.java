package com.pradeep.learnspringproject_01.helloWorld;


import java.io.Serializable;

class Pojo {//plain-old-java-object
    private String text;
    private int number;
    public String toString(){
        return this.text+":"+this.number;
    }
}
class JavaBean implements Serializable {
    //should implement Serializable interface

    //should have explicit or implicit public no-arg constructor
    public JavaBean(){

    }
    private String text;
    private int age;
    //getters and setters

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}