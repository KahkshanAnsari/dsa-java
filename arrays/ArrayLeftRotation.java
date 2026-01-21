import java.util.Scanner;

public class ArrayLeftRotation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of rotations: ");
        int k = sc.nextInt();

        // handle large k
        k = k % n;

        int[] rotated = new int[n];
        int index = 0;

        // copy from k to end
        for (int i = k; i < n; i++) {
            rotated[index++] = arr[i];
        }

        // copy first k elements
        for (int i = 0; i < k; i++) {
            rotated[index++] = arr[i];
        }

        System.out.print("Rotated array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i] + " ");
        }

        sc.close();
    }
}
