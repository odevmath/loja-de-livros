import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** Classe que permite fazer leitura de dados do teclado */
public class Teclado {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private static void exibirMensagem(String msg) {
        if (msg != null && !msg.isEmpty()) {
            System.out.println(msg);
        }
    }

    /**
     * Lê um inteiro.
     * @return int
     */
    public static int leInt() {
        return leInt(null);
    }

    /**
     * Lê um inteiro com mensagem.
     * @param msg Mensagem a ser exibida antes da leitura
     * @return int
     */
    public static int leInt(String msg) {
        exibirMensagem(msg);
        while (true) {
            try {
                return Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                System.out.println("Erro de entrada/saída: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("O valor digitado deve ser um inteiro.");
            }
        }
    }

    /**
     * Lê um double.
     * @return double
     */
    public static double leDouble() {
        return leDouble(null);
    }

    /**
     * Lê um double com mensagem.
     * @param msg Mensagem a ser exibida antes da leitura
     * @return double
     */
    public static double leDouble(String msg) {
        exibirMensagem(msg);
        while (true) {
            try {
                return Double.parseDouble(reader.readLine());
            } catch (IOException e) {
                System.out.println("Erro de entrada/saída: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("O valor digitado deve ser um número decimal.");
            }
        }
    }

    /**
     * Lê uma string.
     * @return String
     */
    public static String leString() {
        return leString(null);
    }

    /**
     * Lê uma string com mensagem.
     * @param msg Mensagem a ser exibida antes da leitura
     * @return String
     */
    public static String leString(String msg) {
        exibirMensagem(msg);
        try {
            return reader.readLine();
        } catch (IOException e) {
            System.out.println("Erro de entrada/saída: " + e.getMessage());
            return "";
        }
    }

    /**
     * Lê um caractere.
     * @return char
     */
    public static char leChar() {
        return leChar(null);
    }

    /**
     * Lê um caractere com mensagem.
     * @param msg Mensagem a ser exibida antes da leitura
     * @return char
     */
    public static char leChar(String msg) {
        exibirMensagem(msg);
        try {
            String input = reader.readLine();
            if (input != null && !input.isEmpty()) {
                return input.charAt(0);
            }
        } catch (IOException e) {
            System.out.println("Erro de entrada/saída: " + e.getMessage());
        }
        return ' ';
    }
}
