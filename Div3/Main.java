import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner array = new Scanner(System.in);

        System.out.println("Enter number of elements in the array");

        int n=array.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter numbers");

        for(int i=0;i<n;i++){ //store elements
            arr[i]=array.nextInt();

        }

        for(int i: arr){ //for printing array %3
            if (i%3 == 0) {
              System.out.println("Numbers divisible by 3: " + i);  
            }
            

        }


    }

}
