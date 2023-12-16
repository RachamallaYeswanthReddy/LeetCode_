class Solution {
public:
    int trap(vector<int>& height) {
        int n = height.size();
        if (n <= 2) return 0;

        int volume = 0;
        int leftMax = 0, rightMax = 0;
        int left = 0, right = n - 1;

        while (left < right) {
            if (height[left] < height[right]) {
                leftMax = max(leftMax, height[left]);
                volume += max(0, leftMax - height[left]);
                left++;
            } else {
                rightMax = max(rightMax, height[right]);
                volume += max(0, rightMax - height[right]);
                right--;
            }
        }

        return volume;
    }
};
