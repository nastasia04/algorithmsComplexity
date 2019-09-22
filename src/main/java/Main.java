import utils.Utils;

import static utils.Utils.*;


public class Main {

        static final int NUMBER_OF_RUNS = 5;
        public static void main (String[]args){
            int[] arrayCapacity = createArrayOfCapacities();

        int count = NUMBER_OF_RUNS;
        RunAlgorithms runAlgorithms;
        for (int n : arrayCapacity) {
            Utils.initializeTimesMap();
            while (count > 0) {
                int[] array = makeRandomArray(n);
                int[][] matrixA = makeRandomMatrix(n);
                int[][] matrixB = makeRandomMatrix(n);
                runAlgorithms = new RunAlgorithms(array);
                runAlgorithms.runConstantFunction();
                runAlgorithms.runSumFunction();
                runAlgorithms.runProductFunction();
                runAlgorithms.runEuclideanFunction();
                runAlgorithms.runPolynomialFunction(1.5);
                runAlgorithms.runHornersFunction(1.5);
                runAlgorithms.runBubbleSort();
                runAlgorithms.runMatrixProduct(matrixA,matrixB);

                System.out.println("hello");

                System.out.println("new branch main");
                count--;
            }
            count = NUMBER_OF_RUNS;
            Utils.setAverageTimes();
        }
        Utils.printAverageTimesGraph(arrayCapacity);
    }





}
