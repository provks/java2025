package Java.TwoDimentionalArray;

public class SpiralPrint {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        spiralPrint(arr);
    }
    public static void spiralPrint(int matrix[][]){
		//Your code goes here
		int rows = matrix.length;
		if (rows == 0) {
			return;
		}
		int cols = matrix[0].length;


		int left = 0, right = cols-1;
		int top = 0, bottom = rows-1;

		while (left <= right && top <= bottom) {
			// left to right
			for (int i = left; i <= right; i++) {
				System.out.print(matrix[top][i] + " ");
			}
			top++;

			// top to bottom
			for (int i = top; i <= bottom; i++) {
				System.out.print(matrix[i][right] + " ");
			}
			right--;

			// right to left
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					System.out.print(matrix[bottom][i] + " ");
				}
			}
			bottom--;

			// bottom to top
			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					System.out.print(matrix[i][left]+ " ");
				}
			}
			left++;
		}
	}
}
