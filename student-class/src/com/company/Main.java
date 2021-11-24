package com.company;

import java.util.*;

public class Main {

    //method used to sort the studentlist in descending order based on the StudentAverage
    public static void Sort(ArrayList<Student> list){
        list.sort((s1,s2) ->{
            return Double.valueOf(s2.getStudentAge()).compareTo(Double.valueOf(s1.getStudentAge()));
        });
    }


    public static void main(String[] args){
        System.out.println("Hello Welcome!");

        ArrayList<Student> studentList = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        //getting the number of students in class from the user. REQUIRED = 10
        System.out.println("Enter the number of students in class:");
        int classNumber = input.nextInt();

        //loop which collects the students information from the user
        for (int i = 0; i<classNumber; i++){
            System.out.println("Enter student's name:");
            String name = input.next();
            System.out.println("Enter "+name+"'s age");
            int age = IO.getInt();
            System.out.println("enter "+name+"'s matricule:");
            String matricule = input.next();

            Student thep = new Student(name,age,matricule);
            //loops through the course list and prompts the user to input scores
            for(int j = 0; j<thep.getCourses().size(); j++){
                System.out.println(thep.getCourses().get(j).getCourseTitle()+" score ");
                thep.getCourses().get(j).setCourseScore(IO.getDouble());
            }

            //adds the object of a new student to the studentList
            studentList.add(thep);
        }
        Sort(studentList);
        System.out.println("Printing out the Results");
        for (int i = 0; i<classNumber;){
            System.out.println("Posistion "+ ++i);
            System.out.println(studentList.get(i-1).toString());
        }

        System.out.println("Bye, see you later");
    }
}



