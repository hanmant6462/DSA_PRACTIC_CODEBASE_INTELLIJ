package Practice;

public class Hello {

    private static Hello hellow;

    private Hello() {

    }

    public Hello getInstance(){
     synchronized (Hello.class) {
                if(hellow == null)
                hellow = new Hello();
            }

        return hellow;
    }


    public static void main(String[] args) {
        System.out.println(new Hello().hellow);
    }
}