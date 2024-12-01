class Solution {
    public boolean checkIfExist(int[] arr) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<arr.length;i++){
        //     map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        // }
        // for(int i=0;i<arr.length;i++){
        //     if(map.containsKey(arr[i]*2))return true; 
        // }
        // return false;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int left=0,right=arr.length-1;
            int target= 2*arr[i];
            while(left<=right){
                int mid = left + (right-left)/2;
                if(arr[mid] == target&& mid!= i){
                    return true;
                }else if(arr[mid]<target){
                    left= mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        return false;
    }
}