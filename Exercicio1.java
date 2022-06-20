import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        
        Scanner entrada = neww Scanner(System.in);

        System.out.println("Digite um número entre 0 a 500: ")
        int numero = entrada.nextInt();

        if(numero >= 100 && numero <= 200){
            System.out.println("Você digitou um número entre 100 e 200")
        }else{
            System.out.println("Você digitou um número fora da faixa.")
        }
    }
}