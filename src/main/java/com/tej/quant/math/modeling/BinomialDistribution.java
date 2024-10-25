package com.tej.quant.math.modeling;

import static com.tej.quant.math.common.Formulae.permutations;

/**
 * Binomial distribution is used in cases where there is a dual outcome - success or failure.
 * Given the probability of success in a single trial (u) , you can predict the probability of x successes in n trials
 */
public class BinomialDistribution implements Distribution {

    /**
     * @param u - probablity of a successful trial
     * @param x - expected number of successful trials
     * @param n - total number of trials
     * @return Probability of x successful trials out of n total trials given that the probability of success is u
     */
    public double probability(double u, int x, int n) {
        assert n > 0;
        assert x > 0;
        assert n >= x;
        assert u >= 0 && u <= 1;
        return Math.pow(u,x) * Math.pow(1-u, n-x) * permutations(n,x);
    }
}
