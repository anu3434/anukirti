package org.example.LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public  class question_01StudentService {
    public static List<String> getAllStudentWithH(List<Student> list){
        List<String> name = new ArrayList<>();
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()){
        Student s = iterator.next();
        if (s.getName().startsWith("H")){
            name.add(s.getName());
        }
        }
          return name;
    }

    public static float avgMarks(List<Student> list){
        float total = 0;
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()){
          total =  iterator.next().getMarks()+ total;
        }
        float avg = total/list.size();
        return avg;

    }

    public static boolean getRemoveStartWithB(List<Student> list){
        boolean flag = false;
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()){
          Student s = iterator.next();
          if (s.getName().startsWith("B")){
              iterator.remove();
              flag = true;
          }
        }
             return flag;
    }

    public static List<Student> getAllStudents() {
        List<Student> studentList = new ArrayList<>();
        Student s1  = new Student("Alka", "A101", 80.8f);
        Student s2  = new Student("Sharda", "S102", 40.8f);
        Student s3  = new Student("Harry", "H103", 95.8f);
        Student s4  = new Student("Babita", "R104", 99.4f);
        Student s5  = new Student("Heera", "M101", 67.8f);
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        System.out.println(studentList);
        return studentList;
    }
    public static void main(String[] args) {
       List<Student> list =  question_01StudentService.getAllStudents();
      List<String> nameStartWithH =  question_01StudentService.getAllStudentWithH(list);
        System.out.println("List of name start with H = " + nameStartWithH);
      float ave =   question_01StudentService.avgMarks(list);
        System.out.println("Average of total marks : " +ave);
        System.out.println(question_01StudentService.getRemoveStartWithB(list));


    }
}
