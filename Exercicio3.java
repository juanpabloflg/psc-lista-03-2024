import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c;

    // Começando a equação
    System.out.println("Digite o valor de a: ");
    a = scan.nextDouble();
    
    System.out.println("Digite o valor de b: ");
    b = scan.nextDouble();

    System.out.println("Digite o valor de c: ");
    c = scan.nextDouble();

    // Realizando a equação
    double delta = b * b - 4 * a * c;

    // Mensagens de erro
    if (a == 0 && b == 0 && c != 0) {
        System.out.println("Coeficientes informados incorretamente");
    } else if (a == 0 && b != 0) {
        System.out.println("Essa é uma equação de segundo grau");
    }
    double raizR = -c / b;
    System.out.println("A raiz real da equação é: "+raizR);

    // Cálculando o delta
    if (delta < 0) {
        System.out.println("Esta equação não possui raízes reais ");
    } else if (delta == 0) {
        System.out.println("Esta equação possui duas raízes reais iguais. ");
        System.out.println("As raízes iguais são: " + raizR + "e" + raizR);
    } else {
        double R1 = (-b + Math.sqrt(delta)) / (2 * a);
        double R2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Esta equação possui duas raízes reais diferentes ");
        System.out.println("O valor das raízes são: " + R1 + "e" + R2);

    }
    scan.close();
}
}
