package Practice;

public class Test22 {

        public static void main(String[] args) {
            String input = "Hello";
            String reversed = reverseString(input);
            System.out.println(reversed); // Output: !dlroW ,olleH
        }

        public static String reverseString(String input) {
            return input.chars()
                    .mapToObj(c -> String.valueOf((char) c))
                    .reduce((s1, s2) -> s2 + s1)
                    .orElse("");
        }
    }

