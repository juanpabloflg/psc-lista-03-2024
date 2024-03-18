import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

// Escolher qual a operação desejada
        System.out.println("Escolha uma operação a ser feita ");
        System.out.println(" 1.Calcular e imprimir o perímetro do circulo\n 2.Calcular e imprimir a área do circulo\n 3.Calcular e imprimir o volume da esfera. ");
        int operacao = scan.nextInt();


// Verificar se o número é valido
        if (operacao < 1  ||  operacao > 3 ) {
            System.out.println("O código da operação é inválido ");
        
       

        
        


    // Cálculo do raio
     } else if (operacao == 1) {
        System.out.print("Qual o valor do raio? ");
            double raio = scan.nextDouble();
            double perimetro = 2 * Math.PI * raio;
            System.out.println("O perímetro é: "+perimetro);

        } else if (operacao == 2) {
            System.out.print("Qual o valor do raio? ");
            double raio = scan.nextDouble();
            double area = Math.PI * Math.pow(raio, 2);
            System.out.println("A área é: "+area);

        } else if (operacao == 3) {
            System.out.print("Qual o valor do raio? ");
            double raio = scan.nextDouble();
            double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
            System.out.println("O volume da esfera é: "+volume);
        }
        scan.close();

    

        



    }
}
