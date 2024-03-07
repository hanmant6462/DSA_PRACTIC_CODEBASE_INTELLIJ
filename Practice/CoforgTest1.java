package Practice;

import java.util.ArrayList;
import java.util.List;

public class CoforgTest1 {

//     static void main(String[] args) {
//        Integer num1 = 1000, num2 = 1000;
//        System.out.println(num1 == num2);//O/P: false
//        Integer num3 = 20, num4 = 20;
//        System.out.println(num3 == num4);//O/P: false
  //  }



public static void main(String[]args) {


    List<String> lst = new ArrayList<>();
    lst.add("Ajay");
    lst.add("Ajay");
    lst.add("Ajay");
    lst.add("Ajay");
    lst.add("Ajay");
    lst.add("Ajay");
    lst.add("Ajay");
    lst.add("Ajay");


    System.out.println(lst.size());//O/P: 8
    for (int i = 0; i < lst.size(); i++) {
        lst.remove(i);
        System.out.println(lst.size());
    }
    System.out.println(lst.size());//O/P: 0
}}