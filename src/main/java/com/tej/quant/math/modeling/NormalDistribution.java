package com.tej.quant.math.modeling;


/**
 * Normal distribution is used to predict the probability of occurrence of the value x given the mean and standard deviation where x is a discrete random variable
 */
public class NormalDistribution implements Distribution {
    public double probability(double x, double mean, double standardDeviation) {
        double numerator = Math.pow(Math.E, (-1 * Math.pow((x - mean), 2))/(2 * Math.pow(standardDeviation, 2)));
        double denominator = standardDeviation * Math.sqrt(2 * Math.PI);
        assert denominator != 0;
        return numerator/denominator;
    }


}
