package com.tej.quant.math.instruments;

/**
 * A convertible bond is a bond that allows the lender to convert the principal amount into shares of the issuer.
 * <br> Convertible bonds have lower interest rates to compensate for the advantage of potentially getting shares
 * <br>Eg. Let's say issuer issues a 10-year bond at 2% coupon rate.
 * <br>Scenario 1 - 5 years in, the issuer's stock rockets. So lender's benefit by calling the option
 * <br>Scenario 2 - 5 years in, the stock tanks, so lenders don't call the option but still expect the coupon payments.
 *
 */
public class ConvertibleBond extends Bond {
    Option optionToConvert;
}
