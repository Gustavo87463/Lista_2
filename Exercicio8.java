import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Contator i = new Contator();
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("1 - Para zerar o contador: ");
        System.out.println("2 - para incrementar o contador: ");
        System.out.println("3 - para retornar o valor: ");
        int opcao = entrada.nextInt();
        
        switch (opcao) {
            case 1:
                i.zerar();
                break;
            case 2:
                i.Incrementar();
                break;
            case 3:
                i.Retornar();
                break;
        }

    }

}
