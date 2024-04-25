import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            for(int contador = parametroUm; contador < parametroDois; contador++){
                System.out.println(contador);
            }
        }

    }
}