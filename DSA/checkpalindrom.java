package DSA;

public class checkpalindrom {
    public static void main(String[] args) {
        // WRITE YOUR CODE HERE
        String str = "N2 i&nJA?a& jnI2n";
        String orgStr = str;
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Compare with its reverse
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
                System.out.println( reversedStr.equals(cleanedStr));
    }
}
