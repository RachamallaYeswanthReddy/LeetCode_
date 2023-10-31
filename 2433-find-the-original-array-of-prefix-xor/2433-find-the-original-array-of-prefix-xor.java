class Solution {
    public int[] findArray(int[] pref) {
        int n = pref.length;
        int result = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = result ^ pref[i];
            result = result ^ arr[i];
        }
        return arr;
    }
}
