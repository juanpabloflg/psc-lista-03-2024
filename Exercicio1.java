import java.util.Scanner;
public class Exercicio1 {
    
    public static void main (String[] args) {
        double num1, num2, num3, media;
        Scanner scan = new Scanner(System.in);


        System.out.println("Escreva o primeiro número: ");
        num1 = scan.nextDouble();

        System.out.println("Escreva o segundo número: ");
        num2 = scan.nextDouble();

        System.out.println("Escreva o terceiro número: ");
        num3 = scan.nextDouble();

        // Descobrindo o maior número
        if (num1 > num2 && num1 > num3) {
            System.out.println("O maior número é: "+num1);
        }
else if (num2 > num1 && num2 > num3) {
    System.out.println("O maior número é: "+num2);
}
else {
    System.out.println("O maior número é: "+num3);
}

// Descobrindo o menor número
if (num1 < num2 && num1 < num3) {
    System.out.println("O menor número é: "+num1);
}
else if (num2 < num1 && num2 < num3) {
    System.out.println("O menor número é: "+num2);
}
else {
    System.out.println("O menor número é: "+num3);
}

//media
media = (num1 + num2 + num3) /3;
System.out.println("A media aritmética dos números é: "+media);

scan.close();




    

    }
}
