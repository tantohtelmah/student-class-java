package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.lang.Boolean;

public class Main {

    public static final int classNumber = 3;
    public static void main(String[] args){
        List<Student> studentList = new ArrayList<>();

        Scanner input = new Scanner(System.in);


        for (int i = 0; i<classNumber; i++){
            System.out.println("enter student name:");
            String name = input.next();
            System.out.println("enter student age:");
            int age = input.nextInt();
            System.out.println("enter student matricule:");
            String matricule = input.next();

            Student thep = new Student(name,age,matricule);
            for(int j = 0; j<thep.getCourses().size(); j++){
                System.out.println(thep.getCourses().get(j).getCourseTitle()+" score ");
                thep.getCourses().get(j).setCourseScore(input.nextDouble());
            }
            studentList.add(thep);

        }
        System.out.println("printing out the averages");
        for (int i = 0; i<classNumber-1;){
            System.out.println("Student "+ ++i);
            System.out.println(studentList.get(i).toString());
        }
        System.out.println("Thank you!");
    }
}



