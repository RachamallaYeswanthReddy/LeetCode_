class Solution {
    public long pickGifts(int[] gifts, int k) {
        long sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<gifts.length;i++){
            pq.add(gifts[i]);
        }
        while(k>0){
            int curr = pq.poll();
            int val =(int) Math.sqrt(curr);
            // pq.add(Math.floor());
            pq.add(val);
            System.out.println(val);
            k--;
        }
        // System.out.println(pq.size());
        while(!pq.isEmpty()){
            sum+= pq.poll();
        }
        return sum;
    }
}