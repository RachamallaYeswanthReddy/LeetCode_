class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> lst= new ArrayList<>();
        int maxi= Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            maxi = Math.max(maxi,candies[i]);
        }
        for(int i=0;i<candies.length;i++){
            int val = candies[i]+extraCandies;
            if(val>=maxi){
                lst.add(true);
            }
            else{
                lst.add(false);
            }
        }
        return lst;
    }
}