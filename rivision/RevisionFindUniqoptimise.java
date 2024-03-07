package rivision;

public class RevisionFindUniqoptimise {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 3};
        int uniqueElement = findUnique(arr);

    }

    private static int findUnique(int[] arr) {
        int ans=0;
        for (int num:arr){
            ans = ans ^ num;
        }
        return ans;
    }


}
