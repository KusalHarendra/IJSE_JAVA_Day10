import java.util.Arrays;

class BubbleNew{
    public static void main(String [] args){
        int[] ar = {34,45,26,76,67,65,98,78,89};
        System.out.println(Arrays.toString(ar));
            for(int i = 0; i < ar.length-2; i++){
                if(ar[0]>ar[1]){
                    int t = ar[0];
                    ar[0] = ar[1];
                    ar[1] = t;
                } 
            }   
        System.out.println(Arrays.toString(ar));
    }
}
