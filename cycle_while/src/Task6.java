import java.text.NumberFormat;

public class Task6 {
    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        double totalSum = 15000;
        int month = 1;
        int months = 9 * 12;
        while (month <= months) {
            totalSum = totalSum + totalSum * 0.07;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %s%n", month, numberFormat.format(totalSum));
            }
            month++;
        }
    }
}
