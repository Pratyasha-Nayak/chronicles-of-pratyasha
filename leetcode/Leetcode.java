public class Leetcode {
    public static void twoSum(int[] nums, int target) {
        // solve it using sorting logic
        for(int i = 0; i<nums.length; i++){
            for (int j = 0; j<nums.length - 1; j++){
                if (i!=j){
                    if(nums[i] + nums[j] == target ){
                        System.out.println("["+i+","+j+"]");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        twoSum(nums,target);
    }
}
