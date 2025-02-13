package util;

public class CurrencyConverter {

    public static double IOF = 0.06;

    public CurrencyConverter() {
    }

    public static double getIOF() {
        return IOF;
    }

    public static void setIOF(double IOF) {
        CurrencyConverter.IOF = IOF;
    }

    public static double dollarToReal (double amount, double dollarPrice) {
        return amount * dollarPrice * (1.00 + IOF);
    }

}
