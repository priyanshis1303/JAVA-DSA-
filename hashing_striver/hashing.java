
import java.util.*;

public class hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size and elements
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Precompute frequencies using hashing (assuming numbers <= 12)
        int[] hash = new int[100000];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        // Query part
        System.out.println("Enter number of queries: ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("Enter number to query: ");
            int key = sc.nextInt();
            
            // Check bounds before accessing hash array
            if (key >= 0 && key < hash.length) {
                System.out.println(key + " appeared " + hash[key] + " times.");
            } else {
                System.out.println("Number out of range for hash array.");
            }
        }

        sc.close();
    }
}
