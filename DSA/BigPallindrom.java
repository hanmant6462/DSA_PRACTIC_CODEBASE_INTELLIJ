package DSA;

public class BigPallindrom {
    public static void main(String[] args) {


        String s = "bcbedrardea"; //bcbedrardea -  edrarde
        String result="";

        for(int i=0;i<s.length();i++){
            char start =s.charAt(i);
            char end =s.charAt(s.length() - 1);
            if(start == end){
                result = s.substring(start,end);
            }

        }
        System.out.println(result);
    }

}
