class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num: arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int val:map.values()){
            if(set.contains(val)){
                return false;
            }else{
                set.add(val);
            }
        }
        return true;
    }
}