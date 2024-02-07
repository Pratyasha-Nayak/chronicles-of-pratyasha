import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
public class DuplicateWords {

    public static void main(String[] args) {

      String regex = "\\w+";
      Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
      Scanner in = new Scanner(System.in);
      int numSentences = Integer.parseInt(in.nextLine());
      List<LinkedHashMap<String,Integer>> objectList = new ArrayList<>();
      
      while (numSentences-- > 0) {
        String input = in.nextLine();
        Matcher m = p.matcher(input);
        LinkedHashMap<String,Integer> hm = new LinkedHashMap<>();
        int iterator = 0;
        String regexKey = "";
        while (m.find()) {
          if (iterator == 0){
            regexKey = m.group();
          } else {
            regexKey = m.group().toLowerCase();
          }
          int frequency = (hm.containsKey(regexKey)) ? hm.get(regexKey) + 1 : 1;//if the word is duplicate increase the frequency, if it's new then set the frequency to 0
          hm.put(regexKey,frequency);
        }
        objectList.add(hm);
        for (Map.Entry<String,Integer> entry: hm.entrySet()) {
          System.out.print(entry.getKey()+" ");
        }
      }
      for (ArrayList<LinkedHashMap<String,Integer>> hashmapObject : objectList) {
        for (Map.Entry : iterable) {
          
        }
      }
      // Check for subsequences of input that match the compiled pattern
      // while (m.find()) {
      //     
      //     input = input.replaceAll(/* The regex to replace */, /* The replacement. */);
      // }
      
      // Prints the modified sentence.
      // System.out.println(input);
      
      in.close();
    }
  }
