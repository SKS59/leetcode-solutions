class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // if(i==j) continue;
                swap(matrix, i, j);
            }
        }
        for (int i = 0; i < n; i++) {
           reverseArray(matrix[i]);
        }
        // reverseArray(matrix);
    }

    private void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    private void swap(int[][] arr, int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
}
