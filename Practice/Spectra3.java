package Practice;

import java.util.ArrayList;
import java.util.List;

//4. Find a frequency of words in a string, without using split or tokenizer?
//String inputString = "Core java test and core java interview".
//OUTPUT:
//Total words - 7
//Core -2
//java-2 test-1
//and -1 interview-1
public class Spectra3 {
    public static void main(String[] args) {
        String inputString = "Core java test and core java interview";
        List list = new ArrayList<>();

        char ch[] = inputString.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch1 : ch) {
            while (ch1 == ' ') {
                sb.append(ch1);
            }
        }

    }
}

