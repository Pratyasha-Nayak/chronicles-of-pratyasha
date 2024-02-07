import java.util.*;
public class Substring {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string: ");
    String st = sc.next();
    String palindrome = new String();
    for (int i = 0; i < st.length() - 1; i++) {
      for (int j = i + 1; j < st.length() ; j++) {
        palindrome = "";
        for (int k = j; k >= i; k--) {
          palindrome += Character.toString(st.charAt(k));
        }
        if (palindrome.equals(st.substring(i,j+1))){
          System.out.print(palindrome);
          System.out.println();
        }
      }
    }
  }
}
