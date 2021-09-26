import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        boolean a = true;
        boolean b = false;
        boolean c = false;

        System.out.println("(a||b) && (a&&!c) : " + ((a||b) || (a && !c)));
        System.out.println("(!b&&c) || (a||!c) : " + ((!b&&c) || (a||!c)));
        System.out.println("(a&&c) && (b||c) : " + ((a&&c) && (b||c)));




    }
}
