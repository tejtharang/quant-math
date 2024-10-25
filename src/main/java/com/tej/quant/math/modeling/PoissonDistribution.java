package com.tej.quant.math.modeling;

import static com.tej.quant.math.common.Formulae.factorial;

/**
 * Poisson's distribution is used to measure the probability of an event occurring x times given the event rate(u)
 */
public class PoissonDistribution implements Distribution {

    public double probability(double eventRate, int x) {
        assert x >=0;
        assert eventRate >= 0;
        return (Math.pow(Math.E, -1 * eventRate) * Math.pow(eventRate, x)) / factorial(x);
    }
}
