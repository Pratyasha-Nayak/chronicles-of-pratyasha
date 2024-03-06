public class PratyashaSolution {
    public static int linearsearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return 1;
            }
        }
        return -1;
    }
    public static void removeDuplicates(int[] nums) {
        int arr[]=new int[nums.length];
        arr[0]=nums[0];
        int k=1;
        for(int j=1;j<nums.length;j++){
            int s=linearsearch(arr,nums[j]);
            if(s== -1){
                arr[k]=nums[j];
                k++;
            }
          //  k++;

        }
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println();

       // return arr.length;
    }
    public static void main(String[] args) {
        int nums[]={1,1,2};
         removeDuplicates( nums);
        // System.out.println(r);
    }
    
}
