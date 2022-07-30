class Solution {
   public int pivotIndex(int[] nums) {
     
        int pivot = -1;
        int[] left = new int [nums.length];
        int[] right = new int [nums.length];

        for(int i=0, j=nums.length-1 ; i<nums.length;i++,j--){
            if(i>0 && j<nums.length-1){
                left[i] = left[i-1] + nums[i];
                right[j] = right[j+1] + nums[j];
            }
            else{
                left[i] = nums[i];
                right[j] = nums[j];
            }
        }

        for(int i=0; i<nums.length;i++){
            if(left[i]==right[i]){
            pivot=i;
                break;
            }
        }
       
       
//         for (int i : right) {
//             System.out.print(i);
//         }
//         System.out.println();

//         for (int i : left) {
//             System.out.print(i);
//         }
        return pivot;
    }
}