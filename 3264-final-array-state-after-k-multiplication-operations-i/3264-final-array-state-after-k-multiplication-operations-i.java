class Pair{
    int val,ind;
    Pair(int value,int index){
        val = value;
        ind = index;
    }
}
class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->{
            if (a.val != b.val) {
                return Integer.compare(a.val, b.val);
            } else {
                return Integer.compare(a.ind, b.ind);
            }
        });
        for(int i=0;i<nums.length;i++){
            pq.offer(new Pair(nums[i],i));
        }
        while(k>0){
            Pair pair = pq.poll();
            int val = pair.val;
            int ind = pair.ind;
            pq.offer(new Pair((val*multiplier),ind));
            k--;
        }
        while(!pq.isEmpty()){
            Pair pair = pq.poll();
            int val = pair.val;
            int ind = pair.ind;
            nums[ind] = val;
        }
        return nums;
    }
}