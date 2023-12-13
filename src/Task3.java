import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int year = 1986;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println( year + " год является високосным");
        }
        else {
            System.out.println( year + " год не является високосным");
        }
    }
}
