import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MaxMatrix {
    public static void main(String[] args) {
        int row, col;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row: ");
        row = sc.nextInt();
        System.out.println("Enter the columnn: ");
        col = sc.nextInt();
        int[][] matrix = new int[row][col];

        //Nhập dữ liệu cho matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextInt();
            }
        }

        //Tìm Max
        int max = matrix[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println(" The largest element in the matrix is: " + max);
    }
}
