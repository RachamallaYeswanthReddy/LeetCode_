class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n =nums.length;
        HashMap<Integer,Integer> map =new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:nums){
            if(map.get(num)>(n/3)){
                set.add(num);
            }
        }
        List<Integer> lst = new ArrayList<>(set);
        return lst;
    }
}