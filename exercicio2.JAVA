import java.util.Scanner;

public class ConversaoTemperatura {

    /*
     * Escreva um programa Java que declare uma variável do tipo double para
     * representar uma temperatura em graus Celsius.
     * Em seguida, converta essa temperatura para Fahrenheit usando a
     * fórmula:Fahrenheit = (Celsius * 9/5) + 32 e exiba o resultado.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a temperatura em graus Celsius :");
        double ConversaoDeTemperatura = scanner.nextDouble();

        scanner.close();

        double temperaturafahrenheit = (Celsius * 9 / 5) + 32;

        System.out.println("a temperatura em fahrenheit é: + temperaturafahrenheit");

    }

}
