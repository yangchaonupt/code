package 代码库.工具;

public class 快速求矩阵子矩阵和_生成和记录 {
	public static int[][] generateSumRecord(int[][] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		int[][] record = new int[row][col];
		record[0][0] = matrix[0][0];
		for (int i = 1; i < row; i++) {
			record[i][0] = record[i - 1][0] + matrix[i][0];
		}
		for (int j = 1; j < col; j++) {
			record[0][j] = record[0][j - 1] + matrix[0][j];
		}
		for (int i = 1; i < row; i++) {
			for (int j = 1; j < col; j++) {
				record[i][j] = record[i][j - 1] + record[i - 1][j] - record[i - 1][j - 1] + matrix[i][j];
			}
		}
		return record;
	}
}
