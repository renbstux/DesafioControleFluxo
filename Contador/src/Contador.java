import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o primeiro valor inteiro: ");
        int valorUm = sc.nextInt();
        System.out.print("Insira o segundo valor inteiro: ");
        int valorDois = sc.nextInt();
        sc.close();
        try {
            contar(valorUm, valorDois);

        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo valor tem que ser maior do que o primeiro valor! Ex.: valor Um: 1 e valor Dois: 5");
        }

    }

    static void contar(int valorUm, int valorDois) throws ParametrosInvalidosException {
        int resultado = valorDois - valorUm;

        if (resultado < 0 || resultado == 0){
            throw new ParametrosInvalidosException();
        }else {
            int contagem = valorDois - valorUm;
            int contador;
            for (contador = 1; contador <= contagem; contador++) {
                System.out.println("Imprimindo o numero: " + contador);
            }
        }
    }
}