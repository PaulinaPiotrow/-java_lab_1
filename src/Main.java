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

        int x = 12;
        int y = 56;
        int z = 4;

        System.out.println("((x <= y) || (a&&b)) : " + ((x <= y) || (a&&b)));
        System.out.println("(x < z) && (a||!b) : " + ((x < z) && (a||!b)));
        System.out.println("(z<=y) || (a&&!c)" + ((z<=y) || (a&&!c)));



    }
}
