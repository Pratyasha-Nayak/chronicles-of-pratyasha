  public class PratyashaQ27 {
    
    public static int removeElement(int[] nums, int val) {
        int j=0;
        int arr[]=new int[nums.length];
       for(int i=0;i<nums.length;i++){
           if(nums[i]!=val){
               
               arr[j]=nums[i];
               j=j+1;
           }
           else{
               arr[j]=Integer.MIN_VALUE;
           }
       }
      int k=0;
     for(int s=0;s<arr.length;s++){
          if(arr[s]!=Integer.MIN_VALUE){
            k=k+1;
          }
       }
      
       return k;
    }
        
    public static void main(String[] args) {
        int nums[]={1,1,2,4,1};
       int z=  removeElement( nums,1);
         System.out.println(z);
    }
    
}
