package rivision;

public class RevisionFindUniqBF {

    public static int findUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return arr[i];
            }
        }
        // If no unique element found, return -1 or throw an exception as per requirements
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 3};
        int uniqueElement = findUnique(arr);

        if (uniqueElement != -1) {
            System.out.println("The unique element is: " + uniqueElement);
        } else {
            System.out.println("No unique element found.");
        }
    }
}
