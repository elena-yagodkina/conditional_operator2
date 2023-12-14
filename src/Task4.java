import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int deliveryDistance = 95;
        int days = 1;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + days);
        }
        else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (days + 1));
        }
        else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (days + 2));
        }
        else if (deliveryDistance >= 100) {
            System.out.println("Доставка не осуществляется");
        }
    }
}
