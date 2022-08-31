package day09_08_31_2022.student;

import java.time.LocalDate;

public class StudentObjects {

    public static void main(String[] args) {
         //if it is primitive
        int a=5;
        //how to create object
        Student student1=new Student();
        student1.setInfo(1, "Adam", 'M', LocalDate.of(1989, 1, 1),"CYDEO");
        System.out.println("student1 = " + student1);


        Student student2=new Student();
        student2.setInfo(2, "Jose", 'M', LocalDate.of(1989, 1, 1),"CYDEO");
        System.out.println("student2 = " + student2);
        System.out.println("======================");
        student1.schoolName="CYDEO1";
        System.out.println("student2 = " + student2);
        System.out.println("=============");
        System.out.println("student1 = " + student1);



    }
}
