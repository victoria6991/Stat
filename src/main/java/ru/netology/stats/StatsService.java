package ru.netology.stats;

public class StatsService {

    public int calcSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sale + sum;
        }
        return (sum);
    }

    public int calcAverage(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sale + sum;
        }
        int avr = sum / sales.length;
        return (avr);
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int calcSalesBellowAvrg(int[] sales) {
        int avr = 15;
        int month = 0;
        for (int sale : sales) {
            if (sale < avr) {
                month = month + 1;
            }
        }
        return (month);
    }

    public int calcSalesAboveAvrg(int[] sales) {
        int avr = 15;
        int month = 0;
        for (int sale : sales) {
            if (sale > avr) {
                month = month + 1;
            }
        }
        return (month);
    }
}

