package com.yitian.model;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "yitian.starter")
public class Proper {

    private String name;

    private String age;

    public Proper(){}

    public Proper(String name,String age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Proper{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
