class Solution {
    public int[] sortedSquares(int[] nums) {
        int result [] = new int[nums.length];
        int left =0;
        int right = nums.length-1;
        int k = nums.length-1;
        while(left<=right){
            int leftsrq = nums[left]*nums[left];
            int rightsrq = nums[right]*nums[right];
            if(leftsrq>rightsrq){
                result[k]=leftsrq;
                left++;
            }else{
                result[k]=rightsrq;
                right--;
            }
            k--;

        }
        return result;        
    }
}