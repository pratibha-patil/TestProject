package com.model;

public class Student {
    private String FName;
    private String LName;

    public Student(String FName, String LName) {
        this.FName = FName;
        this.LName = LName;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public void Display()
    {

        System.out.println("My Name is "+ this.getFName() +" "+this.getLName());
    }

    public static void main(String args[])
    {
        System.out.println("My Details:");
        Student s=new Student("abc","xyz");
        s.Display();
    }
}
