class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstIndex(nums,target);
        int last = lastIndex(nums,target);
        int arr[] = {first,last};
        return arr;   
    }
    static int firstIndex(int nums[],int x){
        int left = 0,n = nums.length,right = n-1;
        int first = -1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]== x){
                first=mid;
                right=mid-1;
            }
            else if(nums[mid]<x){
                left = mid+1;
            }
            else{
                right= mid-1;
            }
        }
        return first;
    }
    static int lastIndex(int nums[],int x){
        int left = 0,n = nums.length,right = n-1;
        int last = -1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]== x){
                last=mid;
                left=mid+1;
            }
            else if(nums[mid]<x){
                left = mid+1;
            }
            else{
                right= mid-1;
            }
        }
        return last ;
    }
}