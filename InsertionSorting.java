import java.util.Arrays;

public class InsertionSorting {
    public static void sort(int[] ar) {
        for(int i = 1; i < ar.length; i++){
            int key = ar[i];
            int j = i-1;
            while(j>=0 && ar[j]>key){
                ar[j+1] = ar[j];
                j = j-1;
            }

            ar[j+1] = key;
        }
    }

    public static void main(String args[]) {
        int[] ar = { 34, 56, 23, 44, 67, 54, 35, 78, 98, 45 };
        System.out.println(Arrays.toString(ar));
        sort(ar);
        System.out.println(Arrays.toString(ar));
    }

}
