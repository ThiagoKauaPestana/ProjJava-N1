import java.util.Scanner;
import java.util.Random; // Import da função que cria um vetor aleatorio

public class App {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in); // Declaração Scanner
        int[] vetor; // Declaração vetor
        boolean VerficaVetor = false; // Verificador do Vetor
        int op; // variavel da opcao do menu
        Random aleatorio = new Random(); // Declarando Random

        do{ // REPETIR ATE SAIR DO LACO (APERTAR NO 9. SAIR)
            System.out.println("1. Inicializar o vetor com números aleatórios");
            System.out.println("2. Imprimir o vetor");
            System.out.println("3. Verificar se um determinado número está contido no vetor");
            System.out.println("4. Buscar o maior número armazenado no vetor");
            System.out.println("5. Calcular a média dos números pares armazenados no vetor");
            System.out.println("6. Calcular o percentual dos números ímpares armazenados no vetor");
            System.out.println("7. Calcula a média centralizada dos números armazenados no vetor");
            System.out.println("8. Verificar se dado um valor existe dois números em posições distintas que somados são iguais ao valor informado.");
            System.out.println("9. Sair");

            // ENTRADA DA OPCAO QUE O USARIO QUER UTILIZAR
            System.out.print("Digite a Opção: ");
            op = entrada.nextInt();
            
            // SWITCH CASE PARA LER A OPCAO SOLICITADA PELO USUARIO E EXECUTAR O METODO STATIC
            switch (op) {
                case 1:
                    // Inicializar o vetor com números aleatórios
                    // Nao necessario fazer metodo/funcao
                
                    System.out.print("Digite o tamanho do Vetor: "); 
                    int n = entrada.nextInt(); 
                    System.out.print("Digite o maior numero do Vetor (Inteiro Positivo): ");
                    int m = entrada.nextInt();
                    
                    vetor = new int[n]; // Inicializando o vetor N posições
                    for (int i = 0; i < n; i++) { // Gerando um numero aleatorio para cada posição do vetor
                        vetor[i] = aleatorio.nextInt(m + 1); // Gerando um numero pra posição I garantindo que o intervalo de 0 até o numero M
                    }
                    System.out.print("Vetor inicializado, liberando as outras opções do Sistema");
                    VerficaVetor = true; // MUDANDO A VARIAVEL BOLEANA PARA TRUE, ASSIM OS OUTROS CASOS PODEM SER EXECUTADOS
                    break;

                case 2:
                    if (VerficaVetor) { // VERIFICACAO SE O VETOR JA FOI CRIADO, SO E EXECUTADA SE A VARIAVEL SER TRUE
                       
                        for(int i = 0; i < m; i++);
                            System.out.print();

                    } else { // CASO VERIFICACAO SER FALSE EXECUTAR ELSE
                        System.out.println("caiu na 2 porem nao pode ser usada");
                    }
                    break;
                case 3:
                    if (VerficaVetor) { // VERIFICACAO SE O VETOR JA FOI CRIADO, SO E EXECUTADA SE A VARIAVEL SER TRUE
                        System.out.println("Caiu na 3"); // Verificar se um determinado número está contido no vetor
                    } else { // CASO VERIFICACAO SER FALSE EXECUTAR ELSE
                        System.out.println("caiu na 3 porem nao pode ser usada");
                    }
                    break;
                case 4:
                    if (VerficaVetor) { // VERIFICACAO SE O VETOR JA FOI CRIADO, SO E EXECUTADA SE A VARIAVEL SER TRUE
                        System.out.println("Caiu na 4"); // Buscar o maior número armazenado no vetor
                    } else { // CASO VERIFICACAO SER FALSE EXECUTAR ELSE
                        System.out.println("caiu na 4 porem nao pode ser usada");
                    }
                    break;
                case 5:
                    if (VerficaVetor) { // VERIFICACAO SE O VETOR JA FOI CRIADO, SO E EXECUTADA SE A VARIAVEL SER TRUE
                        System.out.println("Caiu na 5"); // Calcular a média dos números pares armazenados no vetor
                    } else { // CASO VERIFICACAO SER FALSE EXECUTAR ELSE
                        System.out.println("caiu na 5 porem nao pode ser usada");
                    }
                    break;
                case 6:
                    if (VerficaVetor) { // VERIFICACAO SE O VETOR JA FOI CRIADO, SO E EXECUTADA SE A VARIAVEL SER TRUE
                        System.out.println("Caiu na 6"); // Calcular o percentual dos números ímpares armazenados no vetor
                    } else { // CASO VERIFICACAO SER FALSE EXECUTAR ELSE
                        System.out.println("caiu na 6 porem nao pode ser usada");
                    }
                    break;

                case 7:
                    if (VerficaVetor) { // VERIFICACAO SE O VETOR JA FOI CRIADO, SO E EXECUTADA SE A VARIAVEL SER TRUE
                        System.out.println("Caiu na 7"); // Calcula a média centralizada dos números armazenados no vetor
                    } else { // CASO VERIFICACAO SER FALSE EXECUTAR ELSE
                        System.out.println("caiu na 7 porem nao pode ser usada");
                    }
                    break;
                case 8:
                    if (VerficaVetor) { // VERIFICACAO SE O VETOR JA FOI CRIADO, SO E EXECUTADA SE A VARIAVEL SER TRUE
                        System.out.println("Caiu na 8"); // Verificar se dado um valor existe dois números em posições distintas que somados são iguais ao valor informado.
                    } else { // CASO VERIFICACAO SER FALSE EXECUTAR ELSE
                        System.out.println("caiu na 8 porem nao pode ser usada");
                    }
                    break;
                case 9:
                    System.out.println("Caiu na 9 SAIRRR"); // SAIR
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
            // CONTINUA NO LACO SE FOR DIFERENTE DE 9
        } while (op != 9);





        entrada.close();
    }
}
 