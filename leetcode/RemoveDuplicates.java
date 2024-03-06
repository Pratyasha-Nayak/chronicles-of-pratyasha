//
import java.util.*;
class RemoveDuplicates {
  public static int removeDuplicates(int[] nums) {
    Map<Integer, Integer> map = new LinkedHashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int element = map.containsKey(nums[i]) ? map.get(nums[i]) + 1 : 0;
      map.put(nums[i], element);
    }
    Set<Integer> keys = map.keySet();
    int[] keyArray = keys.toArray(new int[0]);
    System.out.println(keyArray);
    System.out.println(nums);
    System.out.println(map);
    return map.size();
  }
  public static void main(String[] args) {
      int[] nums = {2,1,2};
    int size = removeDuplicates(nums);
    System.out.println(size);
  }
}
