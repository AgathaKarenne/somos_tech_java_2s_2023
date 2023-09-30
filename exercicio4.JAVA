import java.util.Scanner;

public class calculoMediaIfElse {

    /*Crie um programa que solicite ao usuário duas notas e calcule a média.
    Em seguida, utilize uma estrutura if/else para determinar se o aluno foi aprovado (média maior ou igual a 6) ou reprovado.*/

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Digite a primeira nota: ");
            double nota1 = scanner.nextDouble();
    
            System.out.print("Digite a segunda nota: ");
            double nota2 = scanner.nextDouble();
    
            double media = (nota1 + nota2) / 2.0;
    
            // Verifica se o aluno foi aprovado ou reprovado
            if (media >= 6.0) {
                System.out.println("Aprovado com média: " + media);
            } else {
                System.out.println("Reprovado com média: " + media);
            }
    
            scanner.close();
        }

    /* Neste programa, utilizamos uma classe 'Scanner' para solicitar duas notas ao usuário. Em seguida, calculamos a média das notas e armazenamos na variável 'media'.
     Utilizamos uma estrutura if/else para verificar se a mídia é maior ou igual a 6. Se for, exibimos a mensagem*/

}



