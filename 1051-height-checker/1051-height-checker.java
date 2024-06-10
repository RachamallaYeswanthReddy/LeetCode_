class Solution {
    public int heightChecker(int[] heights) {
        if(heights.length == 0){
            return 0;
        }
        if(heights.length == 1){
            return 0;
        }
        int[] updated = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);
        int count=0;
        for(int i=0;i<heights.length;i++){
            // System.out.println(heights[i]);
            if(heights[i] != updated[i]){
                count++;
            }
        }
        return count;
    }
}