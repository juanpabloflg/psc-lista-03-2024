import java.util.Scanner;
import java.util.Random;


public class Exercicio6 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    int num1, num2;
    

// Pegando os dados com o usuário
System.out.println("Digite o primeiro número:" );
num1 = scan.nextInt();

System.out.println("Digite o segundo número:" );
num2 = scan.nextInt();

//Realizando o sorteio dos números e verificando se é par ou ímpar

if (num1 > num2) {
    int aleatorio = random.nextInt(num1 + num2 +1) + num2;
    if (aleatorio % 2 == 0) {
        System.out.println("O número gerado aleatoriamente foi: (" + aleatorio + ") par");
    } else {
        System.out.println("O número gerado aleatoriamente foi: (" + aleatorio + ") ímpar");
    }
} else {
int aleatorio = random.nextInt(num2+ num1 +1) +num1;
if(aleatorio % 2 == 0) {
    System.out.println("O número gerado aleatoriamente foi: (" + aleatorio + ") par");
} else {
    System.out.println("O número gerado aleatoriamente foi: (" + aleatorio + ") ímpar");
}
}


scan.close();








    }
}
