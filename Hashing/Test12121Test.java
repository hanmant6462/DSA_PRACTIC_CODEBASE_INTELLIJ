package Hashing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test12121Test {

    public static void main(String[] args) {
        //from array list cost
        // new Cost("rice",90,3)

        //new cost("tea",100,5)
        //new Cost("pen",10,1)

        //sort based on price

        List<Cost> list = Arrays.asList( new Cost("rice",90,3),new Cost("tea",100,3),new Cost("pen",10,1));
        list.stream().sorted((a,b) -> a.price - b.price).collect(Collectors.toList()).forEach(System.out::println);

    }
}


class Cost  {
    String name;
    int price;
    int qty;

    @Override
    public String toString() {
        return "Cost{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public Cost(String name, int price, int qty){
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
}
