package com.tej.quant.math.instruments;

import java.time.Instant;

/**
 * <ul>
 * <li><u>Bond</u> is a form of debt. It is also a fixed income security because it makes interest payments that don't change once they've been issued.</li>
 * <li><u>Default</u> is when a coupon(interest) payment is not received</li>
 * <li>Highest quality (AAA rated) bonds are also called <u>Investment grade</u> and vice-versa, they're called Junk-grade</li>
 * <li>Bonds are first issued by issuing authority in the <u>Primary market</u> which is essentially an auction and then they can be sold in the secondary market which means they can be bought and sold just like shares</li>
 *</ul>
 */
public class Bond implements FinancialInstrument {
    Rating rating;
    double faceValue;
    Instant issuance;
    Instant redemption;
    double coupon;
    int daysBetweenCouponPayment;

    public double accruedInterest(int daysSinceLastCoupon) {
        return (coupon * daysSinceLastCoupon) / daysBetweenCouponPayment;
    }

    /**
     * Yield to maturity(ytm) is used to define the relationship between the face value, coupon and the current market value of the bond.
     * <ul>
     * <li>If the ytm is high, the current market prices of the bond drops</li>
     * <li>If the ytm is low, the current market prices of the bond increases</li>
     * </ul>
     * <br>
     * An example is interest rates going up. If the interest rates go up, the prices of the houses drop because investor would not want to spend a lot of money in buying the house.
     * <br><br>
     * Alternatively, if interest rates go down, the prices of the houses go up because investors have more money to spend.
     * <br><br>
     * The tricky bit here is that there is no formula to directly calculate ytm. It's by trial and error
     * <br><br>
     * Current market price = (face value / (1 + ytm)^N) + sum over 1 to N (t)  ( coupon / (1 + ytm)^t )
     * @return yield to maturity
     */
    public double yieldToMaturity() {
        return 0.0;
    }

}
