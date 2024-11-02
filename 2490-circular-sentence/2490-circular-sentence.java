class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arr = sentence.split(" ");
        int i =0,n=arr.length;
        for(i=0;i<n-1;i++){
            if(arr[i].charAt(arr[i].length()-1) != arr[i+1].charAt(0)){
                return false;
            }
        }
        if(arr[i].charAt(arr[i].length()-1) != arr[0].charAt(0)){
            return false;
        }
        return true;
    }
}