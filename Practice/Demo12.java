package Practice;

public class Demo12 {
    public static void main(String[] args) {
        String sampleString="malayalam civic radar level rotor kayak madam and refer"; //O/P Malayalam
        String words[]=sampleString.split(" ");
        int result=0;
        for (String word:words){
            int wordsLength=isPalindrom(word);
            if(wordsLength>result){
                result = wordsLength;
                System.out.println("Highest Palindrom "+ word);
            }
        }
        //System.out.println("Highest Palindrom"+ result);

    }

    private static int isPalindrom(String word) {
        //System.out.println("word " + word);
        StringBuilder sb = new StringBuilder();
        sb.append(word);
        if(sb.reverse().toString().equals(word)){
           //System.out.println("word palindrom" + word);
           return word.length();
        }
        return 0;
    }
}
