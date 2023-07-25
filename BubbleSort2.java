import java.util.Arrays;

public class BubbleSort2 {
     public static void sort(int[] ar) {
        for(int j = 0; j< ar.length; j++){
            for (int i = 0; i < ar.length-1; i++) {
                if (ar[i] > ar[i+1]) {
                    int t = ar[i];
                    ar[i] = ar[i+1];
                    ar[i+1] = t;
                }
            }
        }
    }

    public static void main(String args[]) {
        int[] ar = { 56, 34, 23, 44, 67, 54, 35, 78, 98, 45 };
        System.out.println(Arrays.toString(ar)); // [34,56,23,44,67,54,35,78,98,45]
        
        sort(ar);
        System.out.println(Arrays.toString(ar));
    }

}
