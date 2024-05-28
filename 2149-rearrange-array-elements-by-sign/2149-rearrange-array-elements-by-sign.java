class Solution {
    public int[] rearrangeArray(int[] nums) {
        int updateArray[] = new int[nums.length];
        int pos = 0,neg = 0,n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                neg++;
            }else pos++;
        }
        int[] posArr = new int[pos];
        int[] negArr = new int[neg];
        int x= 0,y = 0;
        for(int i=0;i<n;i++){
            if(nums[i]>0 && x<pos){
                posArr[x++] = nums[i];
            }
            else if (nums[i]<0 && y<neg)    {
                negArr[y++] = nums[i];
            }
        }
        x=0;
        y=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                updateArray[i]= posArr[x++];
            }
            else{
                updateArray[i]= negArr[y++];
            }
        }
        return updateArray;
     }
}