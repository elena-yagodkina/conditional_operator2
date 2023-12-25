import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int startYear = 1823;
        int endYear = 2123;
        for ( int year = startYear; year <= endYear; year++) {
            if (year%79 == 0) {
                System.out.println(year);
            }
        }
    }
}
