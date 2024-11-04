package com.tej.quant.math.instruments;

/**
 *
 * A Bond with a call option for the issuer.
 *
 * Eg. Let's say issuer sold a 10-year bond for a 5 % coupon rate. After 5 years, interest rate rises.
 * <br> Now, issuer uses the call option. i.e. issuer repays tne entire principal amount earlier and issues a new bond at 3% interest, thereby saving money.
 * <br> Why would buyers buy a callable bond ? Callable bonds typically pay higher coupon rates but run the risk of early repayment.
 */
public class CallableBond extends Bond {
    Option callOptionForIssuer;
}
