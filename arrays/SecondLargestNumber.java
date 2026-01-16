import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter " +n+ " elements: ");
        for (int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("The elements are: ");
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                 secondLargest = largest;
                 largest = arr[i];
                }

            else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest element does not exist");
        }
        else {
             System.out.println("Second largest element is: " + secondLargest);
        }

        sc.close();
    }
}
