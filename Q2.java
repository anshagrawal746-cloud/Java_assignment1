package Assignment1;

import java.util.Scanner;

public class Q2 {
	
	/* Write a menu driven program in Java to perform insertion, deletion, linear search, binary 
	search, to find maximum value, to count even/ odd and to perform insertion sort operation in 
	one dimensional array. */
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[100];
        int n = 0, choice;

        do {
            System.out.println("\n--- ARRAY MENU ---");
            System.out.println("1. Insert element");
            System.out.println("2. Delete element");
            System.out.println("3. Linear Search");
            System.out.println("4. Binary Search");
            System.out.println("5. Find Maximum");
            System.out.println("6. Count Even and Odd");
            System.out.println("7. Insertion Sort");
            System.out.println("8. Display Array");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                // INSERTION
                case 1:
                    System.out.print("Enter element to insert: ");
                    arr[n] = sc.nextInt();
                    n++;
                    break;

                // DELETION
                case 2:
                    System.out.print("Enter element to delete: ");
                    int del = sc.nextInt();
                    int flag = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == del) {
                            for (int j = i; j < n - 1; j++)
                                arr[j] = arr[j + 1];
                            n--;
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0)
                        System.out.println("Element not found");
                    else
                        System.out.println("Element deleted");
                    break;

                // LINEAR SEARCH
                case 3:
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    flag = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == key) {
                            System.out.println("Element found at position " + (i + 1));
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0)
                        System.out.println("Element not found");
                    break;

                // BINARY SEARCH (array must be sorted)
                case 4:
                    System.out.print("Enter element to search: ");
                    key = sc.nextInt();
                    int low = 0, high = n - 1;
                    flag = 0;
                    while (low <= high) {
                        int mid = (low + high) / 2;
                        if (arr[mid] == key) {
                            System.out.println("Element found at position " + (mid + 1));
                            flag = 1;
                            break;
                        } else if (arr[mid] < key)
                            low = mid + 1;
                        else
                            high = mid - 1;
                    }
                    if (flag == 0)
                        System.out.println("Element not found");
                    break;

                // FIND MAXIMUM
                case 5:
                    int max = arr[0];
                    for (int i = 1; i < n; i++) {
                        if (arr[i] > max)
                            max = arr[i];
                    }
                    System.out.println("Maximum element: " + max);
                    break;

                // COUNT EVEN & ODD
                case 6:
                    int even = 0, odd = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] % 2 == 0)
                            even++;
                        else
                            odd++;
                    }
                    System.out.println("Even count: " + even);
                    System.out.println("Odd count: " + odd);
                    break;

                // INSERTION SORT
                case 7:
                    for (int i = 1; i < n; i++) {
                        int temp = arr[i];
                        int j = i - 1;
                        while (j >= 0 && arr[j] > temp) {
                            arr[j + 1] = arr[j];
                            j--;
                        }
                        arr[j + 1] = temp;
                    }
                    System.out.println("Array sorted using Insertion Sort");
                    break;

                // DISPLAY
                case 8:
                    System.out.print("Array elements: ");
                    for (int i = 0; i < n; i++)
                        System.out.print(arr[i] + " ");
                    System.out.println();
                    break;

                case 9:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 9);
        sc.close();
    }
}
