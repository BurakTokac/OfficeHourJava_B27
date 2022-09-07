package day10_09_07_2022;

public class ConstructorIntro {

    String name;

    int age;

    char gender;

    /*
    What is constructor?
    - helps to create an object
    - initialize the variables(att)
    - has the same name with class name
     */

 /*
 default cons: it is created by compiler
 no arg const: we are creating
 but usage is same
  */


    /*
    public ConstructorIntro(int a ,int b){

    }
     */
/*
    public ConstructorIntro(int a ,int b){

    }


 */
    public ConstructorIntro() {
    }

    /*
    this:we are using for pointing object variables

    this(): call the constructor / chaining const

     Can I use this() two times in cons?
     answer :no because we have to use in first line

     */

    public ConstructorIntro(String name) {
        this.name = name;
    }

    public ConstructorIntro(int age, char gender,String name) {
        //this.name=name;
        this(name);
        this.age = age;
        this.gender = gender;
    }


}
