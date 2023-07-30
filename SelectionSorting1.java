import java.util.Arrays;

public class SelectionSorting1 {
    public static void sort(int[] ar) {

        for (int i = ar.length - 1; i >= 0; i--) {
            int max = ar[0];
            int index = 0;
            for (int j = 0; j <=i; j++) {
                if (ar[j] > max) {
                    max = ar[j];
                    index = j;
                }
            }

            ar[index] = ar[i];
            ar[i] = max;
        }
    }

    public static void main(String args[]) {
        int[] ar = { 34, 56, 23, 44, 67, 54, 35, 78, 98, 45 };
        System.out.println(Arrays.toString(ar));
        
        sort(ar);
        System.out.println(Arrays.toString(ar));
    }

}
