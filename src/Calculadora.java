import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1 = 0, numero2 = 0; 
        int escolha, resultado;

        System.out.println("Escolha o tipo de conta: \n 1 pra soma \n 2 para subtracão \n 3 para multiplicacão \n 4 para divisão");
        escolha = entrada.nextInt();

        switch (escolha) {
            case 1: 
                System.out.println("Digite o número 1: ");
                numero1 = entrada.nextInt();

                System.out.println("Digite o número 2: ");
                numero2 = entrada.nextInt();

                resultado = numero1 + numero2;

                System.out.println("O resultado é: " + resultado);
                break;
            
            case 2: {
                System.out.println("Digite o número 1: ");
                numero1 = entrada.nextInt();

                System.out.println("Digite o número 2: ");
                numero2 = entrada.nextInt();

                resultado = numero1 - numero2;

                System.out.println("O resultado é: " + resultado);
                break;
            }
            case 3: {
                System.out.println("Digite o número 1: ");
                numero1 = entrada.nextInt();

                System.out.println("Digite o número 2: ");
                numero2 = entrada.nextInt();

                resultado = numero1 * numero2;

                System.out.println("O resultado é: " + resultado);
                break;
            }
            case 4: {
                System.out.println("Digite o número 1: ");
                numero1 = entrada.nextInt();

                System.out.println("Digite o número 2: ");
                numero2 = entrada.nextInt();

                resultado = numero1 / numero2;

                System.out.println("O resultado é: " + resultado);
                break;
            }
            default: {
                System.out.println("Escolha uma das opcões!");
            }
        }
        entrada.close();  /*Não é muito recomendado fechar o scanner logo dps de usa-lo, principalmente se estiver envolvido em uma
                            estrutura de repeticão, loop, porém fechá-lo ao final do programa, onde ninguém mais irá usá-lo acho q 
                            não vai dar problema! Se eu não quiser fecha-lo aparentemente não terei problemas*/
    }
}
