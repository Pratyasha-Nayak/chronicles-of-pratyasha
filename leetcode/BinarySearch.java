import java.util.Scanner;
public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length;
        int mid = (start + end) / 2;
        while (start < end){
            if ( arr[mid] == key ){
                return 1;
            } 
            if ( key > arr[mid] ) {
                start = mid;
                mid = (start + end) / 2;
            } 
            if ( key < arr[mid] ) {
                end = mid;
                mid = (start + end) / 2;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter "+size+" elements: ");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the key: ");
        int key = sc.nextInt();
        int search = binarySearch(arr,key);
        if (search == 1){
            System.out.println("Key found");
        }
        if (search == -1) {
            System.out.println("key not found");
        }
    }
} 
