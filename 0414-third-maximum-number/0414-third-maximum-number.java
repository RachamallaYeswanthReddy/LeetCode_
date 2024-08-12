class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> pq= new TreeSet<>();
        for(int num:nums){
            pq.add(num);
            if(pq.size()>3){
                pq.pollFirst();
            }
        }
        if(pq.size()==3) return pq.first();
        else{
            return pq.last();
        }
    }
}