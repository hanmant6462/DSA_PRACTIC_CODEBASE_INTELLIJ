package Practice;

class Test2 {
    public static void main(String[] args) {
        String s ="hanmant";
        String s1 = new String("Hanmant");



    }
}


public class SingletonDemo {

    private static SingletonDemo singltonObj;

    private void singletonDemo(){
        this.singltonObj=singltonObj;

    }

    public SingletonDemo getSingltonObj(){
        if(singltonObj == null) {
            singltonObj = new SingletonDemo();
        }
        return singltonObj;
    }

    public static void main(String[] args) {
        SingletonDemo obj = new SingletonDemo();
        System.out.println(obj.getSingltonObj());
        SingletonDemo obj1 = new SingletonDemo();
        System.out.println(obj1.getSingltonObj());


    }

}