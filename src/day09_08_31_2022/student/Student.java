package day09_08_31_2022.student;

import java.time.LocalDate;

public class Student {



    String name;
    long id;
    int age;
    char gender;
    LocalDate dateOfBirth;

static String schoolName;

    // this is only method for assigning values for objects attributes

    public void setInfo(long id, String name, char gender, LocalDate dateOfBirth,String schoolName) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
                         //08/31/   2022          //01/01/   1989
        this.age = LocalDate.now().getYear() - dateOfBirth.getYear();
        this.schoolName=schoolName;

    }

    /* Generate
    For Mac:COMMAND+N
    For Windows:Alt+insert

     */

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
