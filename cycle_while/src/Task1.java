import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        double totalSum = 0;
        int contribution = 15000;
        int month = 1;
        double percent = 0.01;

        while (totalSum < 2459000) {
            totalSum = (1 + percent) * totalSum;
            totalSum = totalSum + contribution;
                System.out.println("Месяц " + month + " сумма накоплений равна " + totalSum);
                month++;
        }
    }
}
