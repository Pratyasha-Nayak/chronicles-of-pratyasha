import java.util.Scanner;
public class Q13_Leetcode {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int number = sc.nextInt();
    String romanString = romanTypeCast(number);
    System.out.println(romanString);
  }
  public static String romanTypeCast(int number) {
    StringBuilder numStr = new StringBuilder();
    while (number > 0) {
      if (number >= 1000) {
        numStr.append("M");
        number -= 1000;
      }
      if (number >= 500 && number < 1000 - 1) {
        numStr.append("D");
        number -= 500;
      } else if (number == 1000 - 1) {
        number -= 999;
        numStr.append("IM");
      }
      if (number >= 100 && number < 500 - 1) {
        numStr.append("C");
        number -= 100;
      } else if (number == 500 - 1) {
        number -= 499;
        numStr.append("ID");
      }
      if (number >= 50 && number < 100 - 1) {
        numStr.append("L");
        number -= 50;
      } else if (number == 100 - 1) {
        number -= 100 - 1;
        numStr.append("IC");
      }
      if (number >= 10 && number < 50 - 1) {
        numStr.append("X");
        number -= 10;
      } else if (number == 50 - 1) {
        number -= 50 - 1;
        numStr.append("IL");
      }
      if (number >= 5 && number < 10 - 1) {
        numStr.append("V");
        number -= 5;
      } else if (number == 10 - 1) {
        number -= 10 - 1;
        numStr.append("IX");
      }
      if (number >= 1 && number < 5 - 1) {
        numStr.append("I");
        number -= 10;
      } else if (number == 5 - 1) {
        number -= 5 - 1;
        numStr.append("IV");
      }
    }
    return numStr.toString();
  }
}
