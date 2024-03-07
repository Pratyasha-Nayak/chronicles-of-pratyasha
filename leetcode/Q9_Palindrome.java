import java.util.Scanner;
public class Q9_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        int endPointer = str.length() - 1, startPointer = 0;
        while (startPointer <= endPointer ){
            if(str.charAt(startPointer++) != str.charAt(endPointer--)){
                break;
            }
        }
        startPointer--;endPointer++;
        if (startPointer == endPointer) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
