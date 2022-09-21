package day_11_09_21_2022;

public class Employee {

    private  String name;
    private Long emplyeeId;

    public Employee(String name, Long emplyeeId) {
      setName(name);
      setEmplyeeId(emplyeeId);
    }

    /*
for mac command+N
for windows Alt +insert
 */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.contains(" ")){
            System.out.println("it is wrong");
            return;
        }

        this.name = name;
    }

    public Long getEmplyeeId() {
        return emplyeeId;
    }

    public void setEmplyeeId(Long emplyeeId) {
        this.emplyeeId = emplyeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", emplyeeId=" + emplyeeId +
                '}';
    }
}
