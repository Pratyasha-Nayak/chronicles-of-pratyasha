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
      ArrayList<LinkedHashMap<String,Integer>> objectList = new ArrayList<>();
      
      while (numSentences-- > 0) {
        String input = in.nextLine();
        Matcher m = p.matcher(input);
        LinkedHashMap<String,Integer> hm = new LinkedHashMap<>();
        String regexKey = "";
        while (m.find()) {
          regexKey = m.group().toLowerCase();
          // System.out.println("regexKey: "+regexKey);
          int frequency = (hm.containsKey(regexKey)) ? hm.get(regexKey) + 1 : 1;//if the word is duplicate increase the frequency, if it's new then set the frequency to 0
          hm.put(regexKey,frequency);
        }
        objectList.add(hm);
        
      }
      for (LinkedHashMap<String,Integer> hashmapObject : objectList) {
        int iterator = 0;
        for (Map.Entry<String,Integer> entry : hashmapObject.entrySet()) {
          if (iterator == 0) {
            String key = entry.getKey().substring(0,1).toUpperCase() + entry.getKey().substring(1);
            System.out.print(key+" ");
          } else {
            System.out.print(entry.getKey()+" ");
          }
          iterator++;
        }
        System.out.println();
      }
      in.close();
    }
  }
