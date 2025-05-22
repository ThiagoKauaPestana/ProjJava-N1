# Projeto de Progamacao de Sistemas 1 - Java

## Enunciado

### Operações com Vetores em Java

O objetivo do trabalho é fazer com o aluno pratique os conhecimentos apresentados na disciplina de Programação de Sistemas I, assim você deve implementar um programa que realizará uma série de operações envolvendo **vetores** e **funções (métodos estáticos)**, o usuário pode solicitar as seguintes operações, cada uma dessas operações será representada por uma função:

1. Inicializar o vetor com números aleatórios;
2. Imprimir o vetor;
3. Verificar se um determinado número está contido no vetor;
4. Buscar o maior número armazenado no vetor;
5. Calcular a média dos números pares armazenados no vetor;
6. Calcular o percentual dos números ímpares armazenados no vetor;
7. Calcula a média centralizada dos números armazenados no vetor;
8. Verificar se dado um valor existe dois números em posições distintas que somados são iguais ao valor informado.

Para o usuário escolher as operações, o seu programa deverá mostrar um **menu de opções.** Cada opção do menu deve executar a operação correspondente, além disso, o programa deverá executar até o momento que usuário solicite finalizar o programa, ou seja, o usuário pode escolher outras operações do **menu de opção** várias vezes, após ser executada a operação o menu de opções é apresentado novamente. A seguir são descritas detalhadamente cada uma das operações:

1. **Inicializar o vetor com números aleatórios:** Enquanto o usuário não escolher essa operação as outras operações não poderão executar, pois o vetor estará vazio. Quando o usuário selecionar essa opção o programa solicita o tamanho do vetor **N** e um inteiro positivo **M**, em seguida é criado um vetor com N posições e preenchida as posições do vetor com números inteiros **positivos gerados aleatoriamente menores ou iguais a M**. Nessa operação **não é necessário fazer uma função** você pode implementar ela direto no programa que faz o menu de opções.
2. **Imprimir o vetor:** Nessa operação o seu programa imprime o conteúdo do vetor, essa é a única **função** que poderá usar o comando **System.out.println()** dentro dela. Essa função imprime todos os elementos do vetor na tela.
3. **Verificar se um determinado número está contido no vetor:** Nessa operação o seu programa solicita que o usuário informe um valor a ser procurado no vetor, em seguida é chamada a **função** correspondente a essa operação, a **função** recebe por parâmetro o vetor e o valor a ser procurado, caso o valor esteja no vetor sua **função** retorna o índice onde foi encontrado o valor, e caso contrário sua **função** retorna -1, por fim, fora da função, o seu programa imprime uma mensagem informando se o valor foi ou não encontrado.
4. **Buscar o maior número armazenado no vetor:** Nessa operação o seu programa não solicita nada ao usuário, somente chama a **função** que recebe por parâmetro o vetor de números, a **função** percorre o vetor e retorna o maior elemento encontrado no vetor, no programa principal é impresso o maior elemento encontrado no vetor.
5. **Calcular a média dos números pares armazenados no vetor:** Nessa operação o seu programa não solicita nada ao usuário, somente chama a **função** que recebe por parâmetro o vetor de números, a **função** calcula e retorna a média dos números pares armazenados no vetor, no programa principal é impresso a média calculada.
6. **Calcular o percentual dos números ímpares armazenados no vetor:** Nessa operação o seu programa não solicita nada ao usuário, somente chama a **função** que recebe por parâmetro o vetor de números, a **função** calcula e retorna o percentual de números ímpares armazenados no vetor, no programa principal é impresso o percentual calculado.
7. **Calcula a média centralizada dos números armazenados no vetor:** Nessa operação o seu programa não solicita nada ao usuário, somente chama a **função** que recebe por parâmetro o vetor de números, a função retorna a média "centralizada" do vetor passado por parâmetro, no cálculo da média “centralizada” é ignorado o maior e o menor valor no vetor, se houver várias cópias do menor valor, ignore apenas uma cópia e da mesma forma para o maior valor. Ao final sua função retorna a média dos números e no programa principal é impresso o valor da média “centralizada” calculada pela **função**.
8. **Verificar se, dado um valor, existe dois números em posições distintas que somados é igual ao valor informado por parâmetro:** Nessa operação deve ser implementada uma função que recebe como parâmetro o vetor e um valor. A função verifica se existe no vetor dois números em posições distintas no vetor que somados tem como resultado o valor informado por parâmetro à função. Caso exista esses dois números no vetor a função retorna **true** e **false** caso contrário.
