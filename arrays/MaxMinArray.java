import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter " +n+ " elements: ");
        for (int i = 0; i < arr.length; i++) {
             arr[i] = sc.nextInt();
        }

        System.out.print("The elements are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

         int min = arr[0];
         int max = arr[0];

         for (int i = 1; i<arr.length; i++) {
            if (arr[i] < min)
            min = arr[i];
            if (arr[i] > max)
            max = arr[i];
         }

         System.out.println("Minimum = " + min);
         System.out.println("Maximum = " + max);

        sc.close();
    }
    
}
