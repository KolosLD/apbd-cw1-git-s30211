public class StatisticsHelper {
    public static double calculateAverage(int[] values) {
        if (values.length == 0) return 0;
        int sum = 0;
        for (int v : values) sum += v;
        return (double) sum / values.length;
    }
}
