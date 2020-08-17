package com.scorpion.java.clone;

public class Student implements Cloneable{
    private Subject subject;
    private String name;

    public Student(String name, String subject){
        this.name = name;
        this.subject = new Subject(subject);
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Subject getSubject() {
        return this.subject;
    }

    public Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
