import java.text.NumberFormat;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        double totalSum = 15000;
        int month = 1;
        while (totalSum < 12000000) {
            totalSum = totalSum + totalSum * 0.07;
            System.out.printf("Месяц %d, сумма накоплений равна %s%n", month, numberFormat.format(totalSum));
            month++;
        }
    }
}
