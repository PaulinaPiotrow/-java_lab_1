import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj imię: ");
        String imie = scan.next();
        System.out.println("Podaj nazwisko ");
        String nazwisko = scan.next();
        System.out.println("Podaj nr indeksu ");
        String nrIndeksu = scan.next();



        System.out.printf("Imię: %s", imie);
        System.out.printf(" Nazwisko: %s ", nazwisko);
        System.out.printf("Nr indeksu: %s ", nrIndeksu);

        System.out.println();

        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Nr indeksu: " + nrIndeksu);

        System.out.println("Podaj a ");
        int a = scan.nextInt();
        System.out.println("Podaj b ");
        int b = scan.nextInt();


        int dodawanie = a+b;
        System.out.println(dodawanie);
        int odejmowanie = a-b;
        System.out.println(odejmowanie);
        int mnozenie = a*b;
        System.out.println(mnozenie);
        double dzielenie = a/b;
        System.out.println(dzielenie);
        int modulo = a%b;
        System.out.println(modulo);


    }
}
