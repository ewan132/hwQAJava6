import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesTest {
    @Test // минимальный месяц продаж
    public void minSales() {
        Sales servis = new Sales();
        long[] minMSales = {33, 15, 16, 10, 13, 14, 15, 22, 50, 20, 32, 19};

        long expectedMonth = 4;
        long actualMonth = servis.minSales(minMSales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test // сумма
    public void sumSales() {
        Sales servis = new Sales();
        long[] sumMSales = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        long expectedMonth = 12;
        long actualMonth = servis.sumSales(sumMSales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }


    @Test // среднее значение
    public void srSales() {
        Sales servis = new Sales();
        long[] srSales = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        long expectedMonth = 1;
        long actualMonth = servis.srSales(srSales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test // месяк максимальных продаж
    public void maxSales() {
        Sales servis = new Sales();
        long[] maxMSales = {33, 15, 16, 10, 13, 14, 15, 22, 50, 20, 32, 19};

        long expectedMonth = 9;
        long actualMonth = servis.maxSales(maxMSales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test // выше среднего
    public void srMoreSales() {
        Sales servis = new Sales();
        long[] srMoreMSales = {33, 15, 16, 10, 13, 14, 15, 22, 50, 20, 32, 19};

        long expectedMonth = 4;
        long actualMonth = servis.srMoreSales(srMoreMSales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test // ниже среднего
    public void srLessSales() {
        Sales servis = new Sales();
        long[] srLessSales = {33, 15, 16, 10, 13, 14, 15, 22, 50, 20, 32, 19};

        long expectedMonth = 8;
        long actualMonth = servis.srLessSales(srLessSales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }
}
