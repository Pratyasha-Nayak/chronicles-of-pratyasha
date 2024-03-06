
import java.io.*;
import java.util.*;

public class AnaGram{
    public static void isAnagram(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++){
            map.put(str.charAt(i),(map.get(str.charAt(i)) != null)?map.get(str.charAt(i))+1:1);
        }
        int limit = 0;
        for (Map.Entry<Character,Integer> mIterable : map.entrySet()){
            if (mIterable.getValue() != 2 && limit > 1 ){
                System.out.println("Not Anagrams");
                return;
            } else if (mIterable.getValue() == 1) {
                limit++;
                System.err.println(limit);
            }
        }
        System.out.println("Anagram!");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.next();
            isAnagram(str);
        }
        
    }
}

