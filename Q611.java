/* 611. Valid Triangle Number
Given an array consists of non-negative integers, 
your task is to count the number of triplets chosen from the array that can make triangles if we take them as side lengths of a triangle.
*/

class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count =0;
       for(int i=nums.length-1;i>=2;i--){
           
           int left = 0, right = i-1;
           while(left<right){
               if(nums[left]+nums[right]>nums[i]){
                   count += right-left;     //number of triagle satisfying the condition
                   right--;
               }
               else{
                   left++;
               }
           }
       }
       
        return count;
    }
}
