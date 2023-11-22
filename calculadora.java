import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Calculadora Simples em Java");

            System.out.println("Digite o primeiro número:");
            double num1 = scanner.nextDouble();

            System.out.println("Digite o operador (+, -, *, /):");
            char operador = scanner.next().charAt(0);

            System.out.println("Digite o segundo número:");
            double num2 = scanner.nextDouble();

            double resultado = calcularResultado(num1, operador, num2);

            System.out.println("Resultado: " + resultado);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static double calcularResultado(double num1, char operador, double num2) {
        double resultado = 0.0;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    throw new ArithmeticException("Divisão por zero não é permitida.");
                }
                break;
            default:
                throw new IllegalArgumentException("Operador inválido.");
        }

        return resultado;
    }
}
