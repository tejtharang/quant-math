package com.tej.quant.math.modeling;


import com.tej.quant.math.common.Formulae;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import static com.tej.quant.math.common.Formulae.average;

/**
 * Normal distribution is used to predict the probability of occurrence of the value x given the mean and standard deviation where x is a discrete random variable
 */
public class NormalDistribution implements Distribution {
    double [] samples;
    double average;
    double standardDeviation;
    double variance;
    public NormalDistribution(double [] samples) {
        this.samples = samples;
        this.average = average(samples);
        this.standardDeviation = Formulae.standardDeviation(samples);
        this.variance = Formulae.variance(samples);
    }
    public double probability(double x) {
        double numerator = Math.pow(Math.E, (-1 * Math.pow((x - average), 2))/(2 * Math.pow(standardDeviation, 2)));
        double denominator = standardDeviation * Math.sqrt(2 * Math.PI);
        assert denominator != 0;
        return numerator/denominator;
    }

    public void plot() {
        XYSeries gaussianSeries = new XYSeries("Gaussian Distribution");
        XYSeriesCollection gaussianDataset = new XYSeriesCollection();
    }


}
