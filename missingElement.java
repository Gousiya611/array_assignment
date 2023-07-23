
import java.util.Scanner;


public class missingElement {
    public static void main(String[] args) {
    System.out.println("Enter the size of array:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the array elements:");

    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();

    }
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for(int nu: arr){
        if(nu<min){
            min =nu;
        }
        if(nu>max){
            max= nu;
        }
    }

    boolean[] presentElement = new boolean[max-min+1];
    for(int num: arr){
        presentElement[num - min] = true;
    }

    System.out.println("Missing elements: ");
    for(int j=0; j<presentElement.length ; j++){
        if(!presentElement[j]){
            System.out.println(j+min+" ");
        }
    }
    sc.close();
} 
}


    
