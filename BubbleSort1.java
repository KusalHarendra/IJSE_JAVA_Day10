import java.util.Arrays;

class BubbleSort1{
    public static void main(String [] args){
        int[] ar = {34,45,26,76,67,65,98,78,89};
        System.out.println(Arrays.toString(ar));       //[34,45,26,76,67,65,98,78,89]

    for(int j = 0; j < ar.length; j++ ){
        for(int i = 0; i < ar.length-1; i++ ){
            if(ar[i] > ar[i+1]){
                int t = ar[i];
                ar[i] = ar[i+1];
                ar[i+1] = t;
                
            }
            
        }
    }
        
        System.out.println(Arrays.toString(ar));    //[26, 34, 45, 65, 67, 76, 78, 89, 98]
    }
}