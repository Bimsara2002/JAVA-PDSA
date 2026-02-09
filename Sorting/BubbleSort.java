package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2}; // Example array to be sorted
        int n = arr.length; // Length of the array

        for (int i = 0; i < n - 1; i++) { // Outer loop to traverse through the array
            for (int j = 0; j < n - 1 - i; j++) { // Inner loop to compare adjacent elements
                if (arr[j] > arr[j + 1]) { // If the current element is greater than the next element, swap them
                    int temp = arr[j]; // Store the current element in a temporary variable
                    arr[j] = arr[j + 1]; // Move the next element to the current position
                    arr[j + 1] = temp; // Move the current element to the next position
                }
            }
        }

        for (int num : arr) { 
            System.out.print(num + " ");
        }
    }
}
