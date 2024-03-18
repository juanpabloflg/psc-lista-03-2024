import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int num1, num2;
        char simbolo;
        double resposta;

        System.out.println("Digite o primeiro número: ");
        num1 = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = scan.nextInt();

        System.out.println("Digite o símbolo da operação desejada: ");
        simbolo = scan.next().charAt(0);
        

        switch (simbolo) {
            case '+':
            resposta = num1 + num2;
            System.out.println("O resultado da soma é: "+ resposta);
            break;
            case '-':
            resposta = num1 - num2;
            System.out.println("O resultado da subtração é: "+resposta);
            break;
            case '*':
            resposta = num1 * num2;
            System.out.println("O resultado da multiplicação é: "+resposta);
            break;
            case '/':
            resposta = num1 / num2;
            System.out.println("O resultado da divisão é:"+resposta);
            break;
            case '^':
            resposta = Math.pow(num1, num2);
            System.out.println("O resultado da potência é: "+resposta);
            break;
            default:
            System.out.println("Símbolo de operação inválido ");
            scan.close();
        }








    }
}
