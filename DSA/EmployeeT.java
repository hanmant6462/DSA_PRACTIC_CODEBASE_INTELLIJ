package DSA;

import java.util.Objects;

public class EmployeeT {
    int i;
    String test1;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getTest1() {
        return test1;
    }

    public void setTest1(String test1) {
        this.test1 = test1;
    }

    public String getDev() {
        return dev;
    }

    public void setDev(String dev) {
        this.dev = dev;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "EmployeeT{" +
                "i=" + i +
                ", test1='" + test1 + '\'' +
                ", dev='" + dev + '\'' +
                ", sal=" + sal +
                '}';
    }

    String dev;
    int sal;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeT employeeT = (EmployeeT) o;
        return i == employeeT.i && sal == employeeT.sal && Objects.equals(test1, employeeT.test1) && Objects.equals(dev, employeeT.dev);
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, test1, dev, sal);
    }

    public EmployeeT(int i, String test1, String dev, int s) {
    }
}
