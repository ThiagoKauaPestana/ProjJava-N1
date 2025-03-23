import java.util.Scanner;

public class App {
   public App() {
   }

   public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      boolean VerficaVetor = false;

      int op;
      do {
         System.out.println("1. Inicializar o vetor com números aleatórios");
         System.out.println("2. Imprimir o vetor");
         System.out.println("3. Verificar se um determinado número está contido no vetor");
         System.out.println("4. Buscar o maior número armazenado no vetor");
         System.out.println("5. Calcular a média dos números pares armazenados no vetor");
         System.out.println("6. Calcular o percentual dos números ímpares armazenados no vetor");
         System.out.println("7. Calcula a média centralizada dos números armazenados no vetor");
         System.out.println("8. Verificar se dado um valor existe dois números em posições distintas que somados são iguais ao valor informado.");
         System.out.println("9. Sair");
         op = entrada.nextInt();
         switch (op) {
            case 1:
               System.out.println("CAIU NA 1");
               VerficaVetor = true;
               break;
            case 2:
               if (VerficaVetor) {
                  System.out.println("Caiu na 2");
               } else {
                  System.out.println("caiu na 2 porem nao pode ser usada");
               }
               break;
            case 3:
               if (VerficaVetor) {
                  System.out.println("Caiu na 3");
               } else {
                  System.out.println("caiu na 3 porem nao pode ser usada");
               }
               break;
            case 4:
               if (VerficaVetor) {
                  System.out.println("Caiu na 4");
               } else {
                  System.out.println("caiu na 4 porem nao pode ser usada");
               }
               break;
            case 5:
               if (VerficaVetor) {
                  System.out.println("Caiu na 5");
               } else {
                  System.out.println("caiu na 5 porem nao pode ser usada");
               }
               break;
            case 6:
               if (VerficaVetor) {
                  System.out.println("Caiu na 6");
               } else {
                  System.out.println("caiu na 6 porem nao pode ser usada");
               }
               break;
            case 7:
               if (VerficaVetor) {
                  System.out.println("Caiu na 7");
               } else {
                  System.out.println("caiu na 7 porem nao pode ser usada");
               }
               break;
            case 8:
               if (VerficaVetor) {
                  System.out.println("Caiu na 8");
               } else {
                  System.out.println("caiu na 8 porem nao pode ser usada");
               }
               break;
            case 9:
               System.out.println("Caiu na 9 SAIRRR");
               break;
            default:
               System.out.println("Opção inválida, tente novamente.");
         }
      } while(op != 9);

      entrada.close();
   }
}