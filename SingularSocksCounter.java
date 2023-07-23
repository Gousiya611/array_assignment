import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SingularSocksCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scan.nextInt();

        int[] socksArray = new int[n];
        System.out.println("Enter the elements of the array (number of similar pairs):");
        for (int i = 0; i < n; i++) {
            socksArray[i] = scan.nextInt();
        }
        scan.close();

        int singularSocksCount = countSingularSocks(socksArray);
        System.out.println("Number of singular socks: " + singularSocksCount);
    }

    public static int countSingularSocks(int[] socksArray) {
        Map<Integer, Integer> pairCounts = new HashMap<>();

        // Count the number of each pair ID
        for (int pairId : socksArray) {
            pairCounts.put(pairId, pairCounts.getOrDefault(pairId, 0) + 1);
        }

        int singularSocksCount = 0;
        

        // Find the number of singular socks
        for (int pairId : pairCounts.keySet()) {
            int pairCount = pairCounts.get(pairId);
            if (pairCount % 2 != 0) {
                singularSocksCount++;
            }
        }

        return singularSocksCount;
    }
}
