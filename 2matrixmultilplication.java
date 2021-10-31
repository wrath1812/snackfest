// A program of Matrix Multiplication

import java.util.*;
class mutiply
{
  private static void multiply(int[][] first, int[][] second) 
  {
	int row = first.length;
	int column = first[0].length;
	int[][] sum = new int[row][column];

	for (int r = 0; r < row; r++) {
		for (int c = 0; c < column; c++) {
			sum[r] = first[r] * second[r];
		}
	}

	System.out.println("\nMultiplication of Matrices:\n");
	print2dArray(sum);
}

// End of Program
