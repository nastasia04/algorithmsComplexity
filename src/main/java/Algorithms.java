
@SuppressWarnings("UnusedReturnValue")
 class Algorithms {
     int constantFunction(int[] array){
         return 0;
     }

    long sumFunction(int[] array){
        long sum = 0L;
        for(int element : array)
            sum += element;
        return sum;
    }

    long productFunction(int[] array){
        long product = 1L;
        for(int element : array)
            product *= element;
        return product;
    }

    double euclideanFunction(int[] array){
        long sum = 0L;
        for(int element : array)
        {
            sum += element * element;
        }
        return Math.sqrt(sum);
    }

    double polynomialFunction(int[] array, double x){
        double sum = 0d;
        int n = array.length;
        for(int i = 0; i < n; i++)
        {
            sum += array[i] * Math.pow(x, i);
        }
        return sum;
    }

    double hornersFunction(int[] array, double x){

        double result = Double.valueOf(array[0]);
        int n = array.length;
        for (int i=1; i < n; i++)
            result = result * x + array[i];

        return result;
    }

    void bubbleSort(int[] array)
    {
        int n = array.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
    }

    void matrixProductFunction(int[][] matrixA, int[][] matrixB){

        int m = matrixA.length;
        int n = matrixB[0].length;
        int o = matrixB.length;
        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
    }

}
