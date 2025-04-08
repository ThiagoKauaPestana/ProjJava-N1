import java.util.Scanner;
import java.util.Random; // Import da função que cria um vetor aleatorio

public class App {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in); // Declaração Scanner
        int[] vetor = null; // Declaração vetor
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
                    System.out.println("Vetor inicializado, liberando as outras opções do Sistema");
                    VerficaVetor = true; // MUDANDO A VARIAVEL BOLEANA PARA TRUE, ASSIM OS OUTROS CASOS PODEM SER EXECUTADOS
                    break;
                    
                case 2:
                    if (VerficaVetor) { // VERIFICACAO SE O VETOR JA FOI CRIADO, SO E EXECUTADA SE A VARIAVEL SER TRUE
                        printar(vetor);
                    } else { // CASO VERIFICACAO SER FALSE EXECUTAR ELSE
                        System.out.println("Inicialize o Vetor antes de usar essa função");
                    }
                    break;
                case 3:
                    if (VerficaVetor) { // VERIFICACAO SE O VETOR JA FOI CRIADO, SO E EXECUTADA SE A VARIAVEL SER TRUE
                        System.out.print("Digite qual numero quer procurar no Vetor: ");
                        int valorProcurado = entrada.nextInt(); // Verificar se um determinado número está contido no vetor
                        int indice = procurarNum(vetor, valorProcurado);

                        if (indice == -1) { // Verificando se o valor que a função retornou e igual a menos 1
                            System.out.println("Valor nao esta no vetor"); 
                        } else { //Nao e igual a menos 1 entao exibe o indice 
                            System.out.printf("O numero esta contido no indice #%d\n", indice);
                        }
                        
                    } else { // CASO VERIFICACAO SER FALSE EXECUTAR ELSE
                        System.out.println("Inicialize o Vetor antes de usar essa função");
                    }
                    break;
                case 4:
                    if (VerficaVetor) { // VERIFICACAO SE O VETOR JA FOI CRIADO, SO E EXECUTADA SE A VARIAVEL SER TRUE
                        int verificaMaior = procuraMaior(vetor); // Verifica e procura maior numero do vetor
                        System.out.printf("O maior numero contido no vetor e: %d\n", verificaMaior); 

                    } else { // CASO VERIFICACAO SER FALSE EXECUTAR ELSE
                        System.out.println("Inicialize o Vetor antes de usar essa função");
                    }
                    break;
                case 5:
                    if (VerficaVetor) { // VERIFICACAO SE O VETOR JA FOI CRIADO, SO E EXECUTADA SE A VARIAVEL SER TRUE
                        int media = calculaMedia(vetor); // Calcular a média dos números pares armazenados no vetor
                        System.out.printf("A media dos numeros pares e: %d\n", media);
                    } else { // CASO VERIFICACAO SER FALSE EXECUTAR ELSE
                        System.out.println("Inicialize o Vetor antes de usar essa função");
                    }
                    break;
                case 6:
                    if (VerficaVetor) { // VERIFICACAO SE O VETOR JA FOI CRIADO, SO E EXECUTADA SE A VARIAVEL SER TRUE
                        double percentual = calculaPercentualImpar(vetor); // Calcular o percentual dos números ímpares armazenados no vetor
                        System.out.printf("Percentual de ímpares: %.1f%%\n", percentual);
                    } else { // CASO VERIFICACAO SER FALSE EXECUTAR ELSE
                        System.out.println("Inicialize o Vetor antes de usar essa função");
                    }
                    break;
                    
                case 7:
                    if (VerficaVetor) { // VERIFICACAO SE O VETOR JA FOI CRIADO, SO E EXECUTADA SE A VARIAVEL SER TRUE
                        double mediaCentralizada = calculaMediaCentralizada(vetor);
                        if (mediaCentralizada != -1){
                            System.out.printf("A média centralizada dos números é: %.2f\n", mediaCentralizada);                            
                        }
                    } else{
                        System.out.println("Inicialize o Vetor antes de usar essa função");
                    }   
                    break;
                    case 8:
                        if (VerficaVetor) {
                            System.out.print("Digite o valor a ser somado: ");
                            int valorSoma = entrada.nextInt(); // Solicitar o valor que o usuário quer testar
                            boolean existeSoma = verificaSoma(vetor, valorSoma);
                            
                            if (existeSoma) {
                                System.out.println("Existem dois números no vetor cuja soma é igual ao valor informado.");
                            } else {
                                System.out.println("Não existem dois números no vetor cuja soma é igual ao valor informado.");
                            }
                        } else {
                            System.out.println("Inicialize o Vetor antes de usar essa função");
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
        public static void printar(int vetor[]) { // Funcao printar vetor
            for(int i = 0; i < vetor.length; i++) {
                System.out.println(vetor[i]);
            }
        }

        public static int procurarNum(int vetor[], int num) { // Funcao procurar numero contido no vetor
            for(int i = 0; i < vetor.length; i++) {
                if(vetor[i] == num){
                    return i;                    
                }
            }
            return -1;
        }

        public static int procuraMaior(int vetor[]) { // Funcao procurar maior numero do vetor
            int numMaior = vetor[0]; // Inicializando a variavel que vai contar o maior numero
            for(int i = 0; i < vetor.length; i++) {          
                if(vetor[i] > numMaior) { // Verificando se o indice i e maior que o numero maior que contem Guardado na variavel
                    numMaior = vetor[i]; // se maior guardar o indice i no numero maior
                }
            }
            return numMaior;
        }

        public static int calculaMedia(int vetor[]) { // Calcula media dos numeros pares
            int soma = 0;
            int qtdNumPar = 0;
            for(int i = 0; i < vetor.length; i++){
                if(vetor[i] % 2 == 0)
                soma += vetor[i];
                qtdNumPar++;
            }
            
            int media = soma / qtdNumPar;
            return media;
        }

        public static double calculaPercentualImpar(int vetor[]) {
            if (vetor.length == 0) {
                return 0; // evita divisão por zero
            }

            int qtdNumImpar = 0;
            
            for(int i = 0; i < vetor.length; i++){
                if (vetor[i] % 2 != 0){
                    qtdNumImpar++;
                }
            }
            double percentual = qtdNumImpar * 100.0 / vetor.length;
            return percentual;
        }
        public static double calculaMediaCentralizada(int vetor[]) {
            if (vetor.length <= 2) { // Se houver 2 ou menos elementos, não podemos calcular a média centralizada
                System.out.println("Não é possível calcular a média centralizada, vetor precisa ter mais que 2 elementos.");
                return -1;
            }
            
            int maior = vetor[0];
            int menor = vetor[0];
            int soma = 0;
            int contador = 0;
        
           
            for (int i = 0; i < vetor.length; i++) { // Encontrando o maior e o menor valor
                if (vetor[i] > maior) {
                    maior = vetor[i];
                }
                if (vetor[i] < menor) {
                    menor = vetor[i];
                }
            }
            
            for (int i = 0; i < vetor.length; i++) { // Calculando a soma dos elementos ignorando o maior e o menor
                if (vetor[i] != maior && vetor[i] != menor) {
                    soma += vetor[i];
                    contador++;
                }
            }
            // Calcular a média centralizada
            return (double) soma / contador;
        }
        public static boolean verificaSoma(int vetor[], int valor) {
            for (int i = 0; i < vetor.length; i++) {
                for (int j = i + 1; j < vetor.length; j++) { // O segundo loop começa de i+1 para evitar repetir o mesmo número
                    if (vetor[i] + vetor[j] == valor) {
                        return true; // Se encontrar dois números que somam o valor, retorna true
                    }
                }
            }
            return false; // Se não encontrar, retorna false
        }                    
}
 