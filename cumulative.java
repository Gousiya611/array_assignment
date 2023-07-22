
import java.util.Scanner;

public class cumulative {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the size of array");
    int n = sc.nextInt();

    System.out.println("Enter the array elements:");
    int[] arr = new int[n];

    // Read the elements of the array
    System.out.println("Enter " + n + " integers:");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    System.out.println("output array is :");
    try {
        int product = 1;
        for(int i = 0; i<n;i++){
            product *=arr[i];
            System.out.println(product + " ");
        }
    } 
    catch(Exception e){
        System.out.println("\nAn error occured while calculating the cumulative product.");
        System.out.println("Error message:"+e.getMessage());
    } 
    sc.close();
    }
   
}
