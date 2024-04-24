import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    private Map<String, Double> exchangeRates;

    public CurrencyConverter() {
        exchangeRates = new HashMap<>();
        exchangeRates.put("dolar-peso_argentino", 96.47);
        exchangeRates.put("peso_argentino-dolar", 0.0104);
        exchangeRates.put("real_brasileno-dolar", 0.2306);
        exchangeRates.put("dolar-real_brasileno", 4.3358);
        exchangeRates.put("dolar-peso_colombiano", 3805.0);
        exchangeRates.put("peso_colombiano-dolar", 0.000262);
    }

    public double convert(double amount, String sourceCurrency, String targetCurrency) {
        String conversionType = sourceCurrency.toLowerCase() + "-" + targetCurrency.toLowerCase();
        String reverseConversionType = targetCurrency.toLowerCase() + "-" + sourceCurrency.toLowerCase();

        if (!exchangeRates.containsKey(conversionType) && !exchangeRates.containsKey(reverseConversionType)) {
            System.out.println("Conversión no compatible.");
            return -1;
        }

        if (exchangeRates.containsKey(conversionType)) {
            double rate = exchangeRates.get(conversionType);
            return amount * rate;
        } else {
            double reverseRate = exchangeRates.get(reverseConversionType);
            return amount / reverseRate;
        }
    }
}

