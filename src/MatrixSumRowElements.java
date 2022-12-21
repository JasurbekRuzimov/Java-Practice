public class MatrixSumRowElements {
    // 10-14 oktabr
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum = 0;
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            System.out.println(i +"- Qator elementlar yig'indisi : " +  sum);
            sum = 0;
            System.out.println("Maximal elementi: " + max);
        }
    }
}
