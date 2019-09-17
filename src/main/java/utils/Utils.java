package utils;

import com.github.sh0nk.matplotlib4j.Plot;
import java.util.*;


public class Utils {
    static final int MAX_VALUE = 10000000;
    public static HashMap<String, List<Integer>> times;
    public static HashMap<String, List<Double>> averageTimes;

    static {
        averageTimes = new HashMap<>();
    }

    public static int[] createArrayOfCapacities(){
        int[] arrayCapacity = new int[50];
        arrayCapacity[0] = 50;
        for(int i = 1; i < arrayCapacity.length; i++){
            arrayCapacity[i] = arrayCapacity[i-1] + 50;
        }
        return arrayCapacity;
    }


    public static int[] makeRandomArray(int n){
        Random rand = new Random();
        int[] array = new int[n];
        for(int i = 0; i < n; i++)
        {
            array[i] = rand.nextInt(MAX_VALUE) + 1;
        }
        return array;
    }

    public static int[][] makeRandomMatrix(int n){
        int[][] matrix = new int[n][n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt(MAX_VALUE) + 1;
            }
        }
        return matrix;
    }

    //count averege time after 5 times of algorithm
    public static void setAverageTimes(){
        for (Map.Entry<String, List<Integer>> entry : times.entrySet()) {
            double average = entry.getValue().stream().mapToDouble(a -> a).average().getAsDouble();
            if(averageTimes.containsKey(entry.getKey())){
                averageTimes.get(entry.getKey()).add(average);
            }
            else{
                averageTimes.put(entry.getKey(), new ArrayList<>());
                averageTimes.get(entry.getKey()).add(average);
            }
        }
    }
    public static void printAverageTimesGraph(int[] arrayN) {

        try {
            Plot plt = Plot.create();
            for (Map.Entry<String, List<Double>> entry : averageTimes.entrySet()) {
                System.out.println(entry.getKey() + entry.getValue());
                List<Double> x = new ArrayList<>();
                for(int i=0; i< arrayN.length; i++){
                    x.add(Double.valueOf(arrayN[i]));
                }
                List<Double> y = entry.getValue();
                plt.plot()
                        .add(x, y)
                        .label(entry.getKey())
                        .linestyle("-");

            }
            plt.xlabel("value of N");
            plt.ylabel("time in nanoseconds");

            plt.title("Time complexity analysis");
            plt.legend();
            plt.show();
        }
        catch(Exception e){
                e.getMessage();
            }
    }

    public static void initializeTimesMap(){
        times = new HashMap<>();
        putKeyInMap("constant function");
        putKeyInMap("the sum of elements");
        putKeyInMap("the product of the elements");
        putKeyInMap("the Euclidean norm of the elements");
        putKeyInMap("coefficients of polynomial P");
        putKeyInMap("Horner’s method");
        putKeyInMap("bubble sort");
        putKeyInMap("matrix product");
    }
    private static void putKeyInMap(String key){
        times.put(key, new ArrayList<>());
    }
}
