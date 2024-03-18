import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
       double compra, pagou, troco, notas;
       Scanner scan = new Scanner(System.in);

       System.out.print("Qual o valor total da compra? ");
       compra = scan.nextDouble();

       System.out.print("Qual o valor pago? ");
       pagou = scan.nextDouble();

       if (compra > pagou) {
        System.out.println("A quantia paga é insuficiente para realizar a compra. ");
       } else {
        troco = pagou - compra;
       }
    scan.close();
       }
    }

        



    

    
    

