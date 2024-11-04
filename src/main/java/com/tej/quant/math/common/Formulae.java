package com.tej.quant.math.common;

public class Formulae {

    /**
     * Calculates the current day return
     */
    public static double returns(double currentDayPrice, double dayBeforePrice) {
        assert dayBeforePrice != 0;
        return (currentDayPrice - dayBeforePrice)/dayBeforePrice;
    }

    public static int factorial(int n) {
        assert n > 0;
        int result = 1;
        for(int i = n; i > 0; i--) {
            result *= i;
        }
        return result;
    }

    public static double permutations(int n, int x) {
        assert n > 0;
        assert x > 0;
        assert n >= x;
        return ((double) factorial(n) / (factorial(x) * factorial(n-x)));
    }

    public static double combinations(int n, int x) {
        assert n > 0;
        assert x > 0;
        assert n >= x;
        return ((double) factorial(n) / factorial(n-x));
    }

    public static double average(double [] samples) {
        assert samples != null;
        assert samples.length > 0;
        double sum = 0;
        for (double sample : samples) {
            sum += sample;
        }
        return sum / samples.length;
    }

    public static double variance(double [] samples) {
        assert samples != null;
        assert samples.length > 0;
        double sum = 0;
        for(double sample : samples) {
            sum += Math.pow(sample,2) - Math.pow(average(samples), 2);
        }
        return sum/samples.length;
    }

    public static double standardDeviation(double [] samples) {
        assert samples != null;
        assert samples.length > 0;
        return Math.sqrt(variance(samples));
    }

    /**
     * Skew is a measure of how lopsided the data is. A positive skew leans more towards the right. Negative skew leans more towards the left.
     */
    public static double skew (double [] samples) {
        assert samples != null;
        assert samples.length > 0;

        double numerator = 0;
        for(double sample: samples) {
            numerator += Math.pow(sample - average(samples), 3);
        }
        double denominator = samples.length * Math.pow(standardDeviation(samples), 3);
        assert denominator != 0;
        return numerator/denominator;
    }

    /**
     * Kurtosis is a measure of how fat the tail of a distribution is.<br>
     * High kurtosis suggests a high probability of extreme values, which can be critical in finance and risk management, as it indicates higher chances of rare events.<br>
     * Low kurtosis indicates fewer extreme values, which can suggest stability in datasets like environmental or manufacturing measurements.
     */
    public static double kurtosis(double [] samples) {
        assert samples != null;
        assert samples.length > 0;
        double sum = 0;
        for(double sample : samples) {
            sum += Math.pow(sample - average(samples), 4);
        }
        double denominator = samples.length * Math.pow(variance(samples), 2);
        assert denominator != 0;
        return (sum/denominator) - 3;
    }
}
