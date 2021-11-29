package com.company;

import java.util.*;

public class Main {


    public static void Sort(ArrayList<Student> list){
        list.sort((s1,s2) ->{
            return Double.valueOf(s2.getStudentAverage()).compareTo(Double.valueOf(s1.getStudentAverage()));
        });
    }
    //method used to sort the studentlist in ascending order based on the StudentAverage
    public static void TrialSort(ArrayList<Student> studentArrayList){
       double largeNm = 0.0;
       int largeNmIndex = 0;
       for (int j = 0; j<studentArrayList.size(); j++){
          largeNm = studentArrayList.get(j).getStudentAverage();
          largeNmIndex = j;
           for (int k = j+1; k<studentArrayList.size();k++ ){
               if (studentArrayList.get(k).getStudentAverage()<largeNm){
                   largeNm = studentArrayList.get(k).getStudentAverage();
                   largeNmIndex = k;
               }
           }
           Student swap = studentArrayList.get(largeNmIndex);
           studentArrayList.set(largeNmIndex,studentArrayList.get(j));
           studentArrayList.set(j,swap);
       }

    }


    public static void main(String[] args){
        System.out.println("Hello Welcome!");

        ArrayList<Student> studentList = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        //getting the number of students in class from the user. REQUIRED = 10
        System.out.println("Enter the number of students in class:");
        int classNumber = IO.getInt();

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


         TrialSort(studentList);
        System.out.println("Printing out the Results");
        for (int i = classNumber-1; i>=0;){
            System.out.println("Posistion "+ (classNumber-i));
            System.out.println(studentList.get(i--).toString());
        }


        System.out.println("Bye, see you later");
    }
}



