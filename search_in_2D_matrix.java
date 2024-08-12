class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = matrix[0].length * matrix.length - 1;
        int col = matrix[0].length;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            int midValue = matrix[mid / col][mid % col];
            
            if (midValue == target) {
                return true;
            } else if (midValue > target) {
                end = mid - 1;  // Move to the lower half
            } else {
                start = mid + 1;  // Move to the upper half
            }
        }
        return false;
    }
}
