package Practice;

public class EmployeeDetails {

    int id;
    String name;
    Long sal;

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }

    public EmployeeDetails(int id, String name, Long sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
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

    public Long getSal() {
        return sal;
    }

    public void setSal(Long sal) {
        this.sal = sal;
    }



}
