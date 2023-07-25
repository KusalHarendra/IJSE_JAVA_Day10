import java.util.Arrays;

public class BubbleSort3 {
     public static void sort(int[] ar) {
        for(int j = 0; j< ar.length; j++){
            for (int i = 0; i < ar.length-1; i++) {
                if (ar[i] > ar[i+1]) {
                    int t = ar[i];
                    ar[i] = ar[i+1];
                    ar[i+1] = t;
                }
                System.out.println(Arrays.toString(ar));
                try {Thread.sleep(500);} catch (Exception e) {}
            }
        }
    }

    public static void main(String args[]) {
        int[] ar = {90,80,70,60,50,40,30,20,10};
        System.out.println(Arrays.toString(ar)); 
        sort(ar);
        System.out.println(Arrays.toString(ar));
    }

}
