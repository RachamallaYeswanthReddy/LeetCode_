class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        for(int i=0;i<nums2.size();i++)
        {
            nums1.push_back(nums2[i]);
        }
        sort(nums1.begin(),nums1.end());
        double middle;
        int m = nums1.size();
        if(m%2==0)
        {
            middle= (nums1[m/2]+nums1[m/2-1])/2.0;
        }
        else{
            middle = nums1[m/2];
        }
        return middle;
    }
};