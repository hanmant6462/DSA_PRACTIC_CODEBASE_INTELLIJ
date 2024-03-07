package Hashing;

public class Test112233 {
    public static void main(String[] args) {

        String  str = "india is our conuntry and we love it";

        int max = 0;
        String longestWord = "";

        String[] strArray=str.split(" ");

        for(String strWord : strArray){
            int wordLength = strWord.length();
            if(wordLength>max){
                max = wordLength;
                longestWord = strWord;
            }
        }
        System.out.println("longest word " + longestWord);


    }
}


//