class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int weig:stones){
            q.add(weig);
        }
        while(q.size()>1){
            int first = q.poll();
            int second = q.poll();
            if(first!=second){
                System.out.println(Math.abs(first-second));
                q.add(Math.abs(first-second));
            }
        }
        return q.isEmpty()?0:q.poll();
    }
}