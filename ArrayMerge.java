// write a program to create 2 arrays and merge them
import java.util.Scanner;
public class ArrayMerge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the first array: ");
        int size1 = sc.nextInt();
        int[] array1 = new int[size1];
        
        System.out.println("Enter elements of the first array: ");
        for (int i = 0; i < size1; i++) {
            array1[i] = sc.nextInt();
        }
        
        System.out.println("Enter the size of the second array: ");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];
        
        System.out.println("Enter elements of the second array: ");
        for (int i = 0; i < size2; i++) {
            array2[i] = sc.nextInt();
        }
        
        // Merging arrays
        int[] mergedArray = new int[size1 + size2];
        for (int i = 0; i < size1; i++) {
            mergedArray[i] = array1[i];
        }
        for (int i = 0; i < size2; i++) {
            mergedArray[size1 + i] = array2[i];
        }
        
        // Printing merged array
        System.out.print("Merged Array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
        
        sc.close();
    }
}