package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / CurrencyType.getByClassName(this.getClass().getSimpleName()).getRate();
//        return Double.MAX_VALUE;
    }
}
