package com.company;

import java.util.ArrayList;
import java.util.List;


public class Student {
    private String studentName;
    private int studentAge;
    private String studentMatricule;
    private ArrayList<Course> courses;



    @Override
    public String toString(){
        return "name: "+this.getStudentName() +"\n"+
                "age: "+this.getStudentAge() +"\n"+
                "matricule: "+this.getStudentMatricule() +"\n"+
                "Average: "+this.getStudentAverage() +"\n";
    }


    public Student(String studentName, int studentAge, String studentMatricule) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentMatricule = studentMatricule;
        this.courses = new ArrayList<>();
        courses.add(new Course("Maths"));
        courses.add(new Course("English"));

    }

    ArrayList<Course> getCourses() {
        return courses;
    }

    public Student() {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentMatricule = studentMatricule;
        this.courses = new ArrayList<>();
        courses.add(new Course("Maths"));
        courses.add(new Course("English"));

    }


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentMatricule() {
        return studentMatricule;
    }

    public void setStudentMatricule(String studentMatricule) {
        this.studentMatricule = studentMatricule;
    }



    private double getStudentAverage(){
        double average = 0.0;
        double add = 0.0;
        for (int i = 0; i<courses.size();i++){
            add =+ this.courses.get(i).getCourseScore();
        }
        average = add/courses.size();
        System.out.println(average);
        return average;
    }
}
