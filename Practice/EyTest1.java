package Practice;

public class EyTest1 {
}

class ninjas{
    public static void main(String args[]) {
        try {
            int a = 7;
            int b = 0;
            int f = a / b;
            System.out.println("Val is : " + f);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }}