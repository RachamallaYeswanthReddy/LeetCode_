class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(5,0);
        map.put(10,0);
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                map.put(bills[i],map.getOrDefault(bills[i],0)+1);
            }
            if(bills[i] == 10){
                if(map.get(5)>0){
                    map.put(5,map.get(5)-1);
                    map.put(10,map.get(10)+1);
                }else{
                    return false;
                }
            }
            if(bills[i]==20){
                if(map.get(10)>0 && map.get(5)>0){
                    map.put(5,map.get(5)-1);
                    map.put(10,map.get(10)-1);
                }else if(map.get(5)>=3){
                    map.put(5,map.get(5)-3);
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
