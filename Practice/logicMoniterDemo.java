package Practice;
//
//
//very row in the below sample input is a string. Write a function to validate if every opening entity has a valid closing entity.
//        */
//
//        Sample Input
//
//        {}()
//        ({)}
//        }){(
//        {{[][[]}
//        ({()})
//        {}(
//        []
//        [][{}({})]
//
//        Sample Output
//
//        true
//        false
//        false
//        false
//        true
//        false
//        true
//        true
public class logicMoniterDemo {

    public static void main(String[] args) {
        String sampleInput="{}()[]";
        Boolean result = validateSrtingBrackets(sampleInput);
        System.out.println(result);

    }

    private static Boolean validateSrtingBrackets(String sampleInput) {
        if(sampleInput.contains("{") && sampleInput.contains("}") ){
            return true;
        } else if (sampleInput.contains("[") && sampleInput.contains("]")){
            return true;
        } else if(sampleInput.contains("(") && sampleInput.contains(")")){
            return true;
        }
        return false;
    }


}
