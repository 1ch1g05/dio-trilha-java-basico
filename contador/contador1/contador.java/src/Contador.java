import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo número:");
        int parametroDois = terminal.nextInt();
        
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois <= parametroUm) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }
        
        for (int i = parametroUm; i < parametroDois; i++) {
            System.out.println("Imprimindo o número " + (i - parametroUm + 1));
        }
    }
}
