import utils.Utils;

import java.time.Duration;
import java.time.Instant;


public class RunAlgorithms {
    private int[] array;
    private Instant startTime, stopTime;
    private Algorithms algorithms;

    public RunAlgorithms(int[] array) {
        this.array = array;
        algorithms = new Algorithms();
    }

    public void runConstantFunction(){
        startTime = Instant.now();
        algorithms.constantFunction(array);
        stopTime = Instant.now();
        getTimeDuration("constant function", startTime, stopTime);

    }
    public void runSumFunction(){
        startTime = Instant.now();
        algorithms.sumFunction(array);
        stopTime = Instant.now();
        getTimeDuration("the sum of elements", startTime, stopTime);
    }

    public void runProductFunction(){
        startTime = Instant.now();
        algorithms.productFunction(array);
        stopTime = Instant.now();
        getTimeDuration("the product of the elements", startTime, stopTime);
    }
    public void runEuclideanFunction(){
        startTime = Instant.now();
        algorithms.euclideanFunction(array);
        stopTime = Instant.now();
        getTimeDuration("the Euclidean norm of the elements", startTime, stopTime);
    }
    public void runPolynomialFunction(double x){
        startTime = Instant.now();
        algorithms.polynomialFunction(array, x);
        stopTime = Instant.now();
        getTimeDuration("coefficients of polynomial P", startTime, stopTime);
    }
    public void runHornersFunction(double x){
        startTime = Instant.now();
        algorithms.hornersFunction(array, x);
        stopTime = Instant.now();
        getTimeDuration("Horner’s method", startTime, stopTime);
    }
    public void runBubbleSort(){
        startTime = Instant.now();
        algorithms.bubbleSort(array);
        stopTime = Instant.now();
        getTimeDuration("bubble sort", startTime, stopTime);
    }
    public void runMatrixProduct(int[][] matrixA, int[][] matrixB){
        startTime = Instant.now();
        algorithms.matrixProductFunction(matrixA, matrixB);
        stopTime = Instant.now();
        getTimeDuration("matrix product", startTime, stopTime);
    }
    private void getTimeDuration(String name, Instant startTime, Instant stopTime){
        Utils.times.get(name).add(Duration.between(startTime, stopTime).getNano());
    }


}
