package Practice;

public class dsaTest1 {
    public static void main(String[] args) {

                // Declare and initialize a 2D array
                int[][] twoDArray = new int[3][3]; // 3 rows, 4 columns

                // Populate the array with values
                for (int i = 0; i < twoDArray.length; i++) {
                    for (int j = 0; j < twoDArray[i].length; j++) {
                        twoDArray[i][j] = 1;
                    }
                }

                // Print the array
                for (int i = 0; i < twoDArray.length; i++) {
                    for (int j = 0; j < twoDArray[i].length; j++) {
                        System.out.print(twoDArray[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }


