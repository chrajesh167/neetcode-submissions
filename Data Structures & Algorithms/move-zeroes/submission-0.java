class Solution {
    public void moveZeroes(int[] nums) {
        // int index =0;
        // int temp[] = new int[nums.length];
        // for(int i =0;i<nums.length;i++){
        //     if(nums[i]!=0){
        //         temp[index]=nums[i];
        //         index++;
        //     }
        // }
        // for(int i=0;i<nums.length;i++){
        //     nums[i]=temp[i];
        // }

        //optimal
        int nonzero =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i]=nums[nonzero];
                nums[nonzero]= temp;
                nonzero++;
            }
        }

        
    }
}