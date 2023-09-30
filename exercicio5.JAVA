import java.util.Scanner;

public class DiaDaSemana{

    /* Peça ao usuário para inserir um número de 1 a 7 representando um dia da semana. 
    Use uma estrutura switch para exibir o nome do dia correspondente (por exemplo, 1 = Domingo, 2 = Segunda-feira, etc.).
     Se o usuário inserir um número fora do intervalo, mostre uma mensagem de erro.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int numeroDoDia = scanner.nextInt();

        String nomeDoDia;

        switch (numero) {
            case 1:
                nomeDoDia = "Domingo";
                break;
            case 2:
                nomeDoDia = "Segunda-feira";
                break;
            case 3:
                nomeDoDia = "Terça-feira";
                break;
            case 4:
                nomeDoDia = "Quarta-feira";
                break;
            case 5:
                nomeDoDia = "Quinta-feira";
                break;
            case 6:
                nomeDoDia = "Sexta-feira";
                break;
            case 7:
                nomeDoDia = "Sábado";
                break;
            default:
                break;
        }

        System.out.println("Dia da semana: " + nomeDoDia);

        scanner.close();
    }
        /* Neste programa, solicitamos ao usuário um número de 1 a 7 usando a classe 'Scanner'.
         Em seguida, utilizamos uma estrutura 'switch' para mapear o número do dia da semana ao nome*/
}