
import java.io.*;
import java.util.*;

public class HackerRankAnagram{
    public static void isAnagram(String stringA, String stringB){
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < stringA.length(); i++){
            map.put(stringA.charAt(i),(map.get(stringA.charAt(i)) != null)?map.get(stringA.charAt(i))+1:1);
        }
        HashMap<Character,Integer> map2 = new HashMap<>();
        for (int i = 0; i < stringB.length(); i++){
            map2.put(stringB.charAt(i),(map2.get(stringB.charAt(i)) != null)?map2.get(stringB.charAt(i))+1:1);
        }
        // System.err.println(map+"\n"+map2);
        if(map.equals(map2)){
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strA = sc.next().toLowerCase();
        String strB = sc.next().toLowerCase();
        // System.err.println("str A: "+strA+"\nstr B: "+strB);
        isAnagram(strA,strB);
    }
}
