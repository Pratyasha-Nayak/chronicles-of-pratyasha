public class Q27RemoveElement {
  public static void main(String[] args) {
    int[] nums = {0,1,2,2,3,0,4,2};
    int val = 2;
    int k = removeElement(nums, val);
    System.out.println(k);
  }
  public static int removeElement(int[] nums, int val) {
    int k = 0;
    for (int i = 0; i < nums.length; i++) {
      if (val == nums[i]) {
        nums[i] = null;
      }
    }
    for (int i : nums) {
      if (i) {
        k++;
      }
    }
    return k;
  }
}
