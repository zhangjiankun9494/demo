package com.example.problem;

/**
 * @author zjk
 * @DESCRIPTION
 * @date 2020-10-08 13:34
 */
public class Student {
    private String name;
    private Integer age;
    static String room;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
