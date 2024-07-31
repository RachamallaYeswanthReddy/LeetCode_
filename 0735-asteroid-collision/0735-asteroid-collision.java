class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int ast : asteroids) {
            boolean exploded=false;
            while (!st.isEmpty()&& ast<0&&st.peek()>0) {
                if (st.peek()<-ast) {
                    st.pop();
                    continue;
                } else if(st.peek() == -ast) {
                    st.pop();
                }
                exploded = true;
                break;
            }
            if(!exploded) {
                st.push(ast);
            }
        }
        int[] nums = new int[st.size()];
        for (int i = nums.length - 1; i >= 0; i--) {
            nums[i] = st.pop();
        }
        return nums;
    }
}
