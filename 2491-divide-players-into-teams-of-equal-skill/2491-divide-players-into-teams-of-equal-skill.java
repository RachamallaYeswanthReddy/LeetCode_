class Solution {
    public long dividePlayers(int[] skill) {
        if(skill.length == 2) return skill[0]*skill[1];
        Arrays.sort(skill);
        long prod=0;
        int l=0,r=skill.length-1;
        int sum = skill[l]+skill[r];
        while(l<r){
            if(sum == (skill[l]+skill[r])){
                prod+=(long)skill[l]*skill[r];
                r--;
                l++;
            }
            else{
                return -1;
            }
            
        }
        return prod;
    }
}