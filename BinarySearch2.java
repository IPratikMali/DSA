package DSA;

import java.util.Scanner;

public class BinarySearch2 {
    public static void main(String[] args) {
        int size ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Elements of an array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element : ");
        int target = sc.nextInt();

        System.out.println("Element found at index : " + Search(arr, target));
    }

    static int Search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        //checking the order of an array
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            //if target found at middle
            if (arr[mid] == target) {
                return mid;
            }
            //if array is ascending
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            // if array is descending
                else {
                    if (target < arr[mid]) {
                        start = mid + 1;
                    }
                    else {
                        end = mid - 1;
                    }
                }

            }
            return -1;
        }

    }
