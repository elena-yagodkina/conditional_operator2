import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int populationCountry = 12000000;
        int year = 2023;
        int i = 0;
        while (i < 10) {
            int birthRate = (populationCountry / 1000) * 17;
            int mortality = (populationCountry / 1000) * 8;
            populationCountry = populationCountry + birthRate - mortality;
            year++;
            i++;
            System.out.println("Год " + year + ", численность населения составляет " + populationCountry);
        }
    }
}
