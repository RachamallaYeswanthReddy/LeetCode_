class Solution {
public:
    int minFallingPathSum(vector<vector<int>>& matrix) {
        int rows = matrix.size();
        int cols = matrix[0].size();

    for (int i = 1; i < rows; ++i) {
        for (int j = 0; j < cols; ++j) {
            matrix[i][j] += min({matrix[i - 1][std::max(0, j - 1)], 
                                 matrix[i - 1][j], matrix[i - 1][std::min(cols - 1, j + 1)]});
        }
    }

    return *std::min_element(matrix[rows - 1].begin(), matrix[rows - 1].end());

    }
};