/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package guzmjo.lab07;

/**
 *
 * @author guzma
 */
public class Lab07{

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 8, 9, 12, 14};
        
        System.out.println(runBinarySearchIteratively(arr, 9, 1, 14));
        
        System.out.println(search(arr, 12));
        
        System.out.println(getSumOfPrimes(20));
            
    }
    
    //Time analysis: O(log n)
    //      *Since we are dividing the number of inputs we search every iteration
    //      *the time complexity will be O(log n)
    //Space analysis: O(1) 
    //      *Since the only memory being allocated is constant
    //      *the space complexity will be O(1)
    public static int runBinarySearchIteratively(int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
    
    //Time analysis: O(n)
    //      *Since we are iteratively searching through the array without skipping any inputs
    //      *the time complexity will be O(n)
    //Space analysis: O(1)
    //      *Since the only the only memory being allocated is for variables that are constant
    //      *the space complexity will be O(1)
    public static int search(int arr[], int x){
        int n = arr.length;
        
        for(int i = 0; i < n - 1; ++i ) {
            if (arr[i] ==  x) {
                return i;
            }
        }
        
        return -1;
    }
    
    //Time analysis: O(n)
    //      *Since we are iteratively decrementing n until it reaches 1
    //      *the time complexity will be O(n)
    //Space analysis: O(1)
    //      *Since the only memory being allocated is constant
    //      *the space complexity will be O(1)
    public static long getSumOfPrimes(int n){
    
        long sum = 0;
        n = n - 1;
        
        while (n > 1) {
             if ((n % 2 != 0 || n == 2) && (n % 3 != 0 || n == 3)
                     && (n % 5 != 0 || n == 5) && (n % 7 != 0 || n == 7)) {
                sum += n;
            }
            n--;
        }
        return sum;
    }
}
