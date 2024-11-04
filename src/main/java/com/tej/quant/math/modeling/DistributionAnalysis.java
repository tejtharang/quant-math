package com.tej.quant.math.modeling;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import java.io.*;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import static com.tej.quant.math.common.Formulae.*;
import static org.apache.commons.math3.stat.StatUtils.mean;

public class DistributionAnalysis {

    /**
     * We will be analysing historical data and checking if out if our formulae are actually working.
     */
    public static void main(String[] args) throws URISyntaxException, IOException {
        List<Double> prices = new ArrayList<>();
        // read CSV file from resources into an object.
        String historicDataFile = "spxHistoricData.csv";
        try (InputStream inputStream = DistributionAnalysis.class.getClassLoader().getResourceAsStream(historicDataFile)) {
            assert inputStream != null;

            try (CSVReader reader = new CSVReader(new InputStreamReader(inputStream))) {
                String [] nextLine;
                // skip header line
                reader.readNext();
                while((nextLine = reader.readNext()) != null) {
                    prices.add(Double.parseDouble(nextLine[1]));
                }
            } catch (CsvValidationException e) {
                throw new RuntimeException(e);
            }
        }
        double [] convertedPrices = prices.stream().mapToDouble(Double::doubleValue).toArray();

        // confirming that all
        System.out.println(mean(convertedPrices));
        System.out.println(average(convertedPrices));

        DescriptiveStatistics statistics = new DescriptiveStatistics();
        for (double convertedPrice : convertedPrices) {
            statistics.addValue(convertedPrice);
        }
        System.out.println(variance(convertedPrices));
        System.out.println(StatUtils.variance(convertedPrices));

        System.out.println(standardDeviation(convertedPrices));
        System.out.println(statistics.getStandardDeviation());

        double mean = average(convertedPrices);
        double standardDeviation = standardDeviation(convertedPrices);


    }
}
