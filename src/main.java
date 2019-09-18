import java.util.Scanner;
public class main {
    static char[] mas = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    static int numb;
    static int a;

    static String decimalConvert(int value, int pot) {
        String g = "";
        while (value > 0) {
            a = value % pot;
            g = mas[a] + "" + g;
            value = value / pot;
        }
        return g;
    }

    static void show() {
        System.out.print("2 система:" + decimalConvert(numb, 2) + "\n"
                        + "8 система:" + decimalConvert(numb, 8) +"\n"
                        + "16 система:" + decimalConvert(numb, 16));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your number: ");
        numb = scanner.nextInt();

        show();
    }
}
