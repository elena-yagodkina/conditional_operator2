import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int firstFriday = 1;
        for (int i = firstFriday; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }

    }
}
