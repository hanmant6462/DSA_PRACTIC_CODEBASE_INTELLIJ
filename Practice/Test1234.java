package Practice;

public class Test1234 {
    //1 1 0 1 // Output 4
    //0 1 0 1
    //0 0 0 0
    //1 1 0 1
    public static void main(String[] args) {


        int[][] arr = {
                {1, 1, 0, 1},
                {0, 1, 0, 1},
                {0, 0, 0, 0},
                {1, 1, 0, 1}
        };
        int landCounter=0;
        for (int i =0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if(arr[i][j] == 1 ){
                    landCounter++;
                }
            }
        }



    }
}
