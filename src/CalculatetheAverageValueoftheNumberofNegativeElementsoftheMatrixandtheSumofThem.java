public class CalculatetheAverageValueoftheNumberofNegativeElementsoftheMatrixandtheSumofThem {
    public static void main(String[] args) {
        int[][] matrix = {
                {-1, 2, 3},
                {-4, 5, 6},
                {-7, 8, -9}
        };
        int sum = 0;
        int count = 0;
        int average = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    sum += matrix[i][j];
                    count++;
                }
            }
            sum = 0;
            count = 0;
            average = 0;
//            System.out.println(i + "- Qator elementlar yig'indisi : " + sum);
        }

        if (count != 0) {
            average = sum / count;
        }
        System.out.println("Elementlar soni: " + count);
        System.out.println("Elementlar o'rta arifmetigi: " + average);
    }
}
