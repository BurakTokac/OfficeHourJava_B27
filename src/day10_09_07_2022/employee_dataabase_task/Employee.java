package day10_09_07_2022.employee_dataabase_task;

public class Employee {
    String name;
    long id;


    public Employee(String name, long id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
