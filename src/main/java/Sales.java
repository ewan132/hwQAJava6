public class Sales {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int sumSales(long[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }


    public int srSales(long[] sales) {
        int sum = 0;
        int sr = sales.length;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum / sr;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = i; // запомним его как минимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int srMoreSales(long[] sales) {
        int sum = 0;
        int sr = sales.length;
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        int srMore = sum / sr;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > srMore) {
                count++;
            }
        }
        return count;
    }

    public int srLessSales(long[] sales) {
        int sum = 0;
        int sr = sales.length;
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        int srMore = sum / sr;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < srMore) {
                count++;
            }
        }
        return count;
    }
}
