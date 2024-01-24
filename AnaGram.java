import java.util.Scanner;
public class AnaGram {
  static boolean isAnagram(String a, String b) {
     Hashmap<String,int> freq = new Hashmap<>();
     for (int i = 0; i < a.length(); i++){
       int frequency = (freq.get(a[i]))?freq.get(a[i]):1;
       freq.put(a[i],frequency++);
     }
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();
    boolean ret = isAnagram(a, b);
    System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
}
}
