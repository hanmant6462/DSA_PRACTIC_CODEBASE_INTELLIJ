package DSA;

public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal, Panama!";
        boolean isPalindrome = isPalindrome(input);
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Compare with its reverse
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
        String[] token = reversedStr.split("");
        for (String s2:token){
            System.out.print(s2 +" ");
        }
        return cleanedStr.equals(reversedStr);
    }
}
