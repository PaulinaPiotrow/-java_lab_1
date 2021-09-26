import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int wiek = 25;

        if (wiek % 3 == 0) {
            System.out.println("Wiek jest podzielny przez 3");
        } else {
            System.out.println("Wiek jest niepodzielny przez 3");
        }
        int nr_indeksu = 59387;
        int wynik = (nr_indeksu % 2 == 0) ? 0 : 1;

        if (wynik == 1) {
            System.out.println("Nr indeksu jest nieparzysty");
        } else {
            System.out.println("Numer indeksu jest parzysty");
        }

        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int liczba = scan.nextInt();

        if (liczba < 21)
        {
            System.out.println("Liczba jest mniejsza niż 21");
        }

        else if (liczba == 25)
        {
            System.out.println("Liczba jest równa 25");
        }
        else
        {
            System.out.println("Liczba nie jest mniejsza niż 21 i nie jest równa 25");
        }
    }
}
