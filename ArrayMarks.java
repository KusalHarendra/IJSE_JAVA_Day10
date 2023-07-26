import java.util.Random;
import java.util.Scanner;

public class ArrayMarks{

    public static int[] createAnArray(int length){
        int arr[] = new int[length];
        return arr;
    }

    public static void readMarks(int[] marks){
        Random r =new Random();
        for(int i = 0; i< marks.length; i++){
            marks[i] = r.nextInt(101);
        }
    }

    public static int findTotal(int[] marks){
        int total = 0;
        for(int i =0; i< marks.length; i++){
            total += marks[i];
        }
        return total;
    }

    public static int findMin(int[] marks){
        int min = marks[0];
        for(int i = 1; i< marks.length; i++){
            if(min > marks[i]){
                min = marks[i];
            }
        }

        return min;
    }

    public static int findMax(int[] marks){
        int max = marks[0];
        for(int i = 1; i< marks.length; i++){
            if(max < marks[i]){
                max = marks[i];
            }
        }

        return max;
    }

    public static void printMarks(int[] marks){
        System.out.print("[");
        for(int i = 0; i< marks.length; i++){
            System.out.print(marks[i]+ ",");
        }
        System.out.println("\b]");
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input Number of Students : ");
        final int N = input.nextInt();

         //1. Create an Array named marks and size
         int[] marks = createAnArray(N);

         //2. Read marks using Random between 0-100
         readMarks(marks);
 
         //3. Find Total
         int total = findTotal(marks);
 
         //4. Find Min
         int min = findMin(marks);
 
         //5. Find Max
         int max = findMax(marks);
 
         //6. Print Array [......]
         printMarks(marks);
 
         System.out.println("Tatal : " + total);
         System.out.println("Min :" + min);
         System.out.println("Max : " + max);
 
    }
}
