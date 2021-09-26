import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int wiek = 26;

        if (wiek % 3 == 0) {
            System.out.println("Wiek jest podzielny przez 3");
        } else {
            System.out.println("Wiek jest niepodzielny przez 3");
        }
        int nr_indeksu = 59387;
        int wynik = (nr_indeksu % 2 == 0) ? 0 : 1;

        if (wynik == 1)
        {
            System.out.println("Nr indeksu jest nieparzysty");
        }
        else
        {
            System.out.println("Numer indeksu jest parzysty");
        }

    }
}
