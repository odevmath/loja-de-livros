import java.util.Scanner;

public class Teclado {
    private static Scanner scanner = new Scanner(System.in);

    public static int leInt() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Erro: o valor digitado deve ser um número inteiro.");
            }
        }
    }

    public static int leInt(String msg) {
        System.out.println(msg);
        return leInt();
    }

    public static double leDouble() {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Erro: o valor digitado deve ser um número.");
            }
        }
    }

    public static double leDouble(String msg) {
        System.out.println(msg);
        return leDouble();
    }

    public static String leString() {
        return scanner.nextLine();
    }

    public static String leString(String msg) {
        System.out.println(msg);
        return leString();
    }

    public static char leChar() {
        String input = leString();
        return input.charAt(0);
    }

    public static char leChar(String msg) {
        System.out.println(msg);
        return leChar();
    }
}
