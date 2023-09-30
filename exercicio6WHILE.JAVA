import java.util.Scanner;

public class NumerosPares{

    /* Peça ao usuário para inserir um número inteiro positivo. Em seguida, crie dois programas: um usando um loop for e outro usando um loop while.
     Ambos devem contar e exibir todos os números pares de 1 até o número inserido pelo usuário.*/
    
     /*usando while */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um numero positivo: ");
        int numero = scanner.nextInt();
        
        System.out.println("Números pares de 1 até " + numero);

        int i = 2;
        while (i <= numero){
                System.out.print(i + " ");
                i += 2;
            }
            scanner.close();
        }
}