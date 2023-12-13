import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int monthNumber = 4;

        switch (monthNumber) {
            case 12, 1, 2:
                System.out.println("Месяц принадлежит сезону зима");
                break;
            case 3, 4, 5:
                System.out.println("Месяц принадлежит сезону весна");
                break;
            case 6, 7, 8:
                System.out.println("Месяц принадлежит сезону лето");
                break;
            case 9, 10, 11:
                System.out.println("Месяц принадлежит сезону осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
