class Solution {
    public int singleNonDuplicate(int[] a) {
        if (a.length == 1) {
            return a[0];
        }
        int left = 0, right = a.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (mid % 2 == 0) {
                if (mid + 1 < a.length && a[mid] == a[mid + 1]) {
                    left = mid + 2;
                } else {
                    right = mid;
                }
            } else {
                if (mid - 1 >= 0 && a[mid] == a[mid - 1]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
        }

        return a[left];
    }
}
