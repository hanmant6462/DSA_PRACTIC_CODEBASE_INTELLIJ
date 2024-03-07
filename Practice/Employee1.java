package Practice;

public class Employee1 {
    public int i;
    int id;
        String name;

    public Employee1(int id, String name, String sal, String dept) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        dept = dept;
    }

    String sal;
         String dept;


}
