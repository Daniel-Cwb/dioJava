public class Operadores {
    public static void main(String[] args) {
        // ------ Operadores de Atribuição------ 
        // "" para declarar String
        // 22 para declarar int
        // . para declarar float ou double
        // '' para declarar char
        // Date para declarar new Date()

        // ------ Operadores Aritimeticos------
        // + para adção
        // - para subtração
        // * multiplicação
        // / para divisão
        int soma = 10 + 15;
        int subtracao = 113 - 20;
        int multiplicacao = 20 * 7;
        double divisao = 20 / 7;
        int modulo = 20 % 3; // resto da divisão, esse caso vai ser 0
        System.out.println("Valor de modulo: " + modulo + " Valor da Divisão: " + divisao);

        // ------ Operadores Unários ------
        // + Deixa os numeros positivo
        // - Deixa os numeros negativo
        // ++ incrementa o valor em  + 1
        // -- decrementa o valor em  - 1
        // ! nega o valor de uma expressão booleana

        soma++;
        System.out.println("Valor de Soma: " + soma); // print 26

        soma--;
        System.out.println("Valor de Soma: " + soma);// print 25

        // ------ Operador Ternário ------
        // <Expressão Consdicional> ? < Caso condição seja True> : < Caso condição seja false>
        int resultado =  subtracao == 100 ? subtracao : 124;
        System.out.println("Valor de Resultado: " + resultado);

        // ------ Operadores Relacionais ------
        // == Igual a outra
        // != Diferente da outra
        // > Maior que a outra
        // >= Maior ou Igual a outra
        // < Menor que a outra
        // <= Menor ou igual a outra
        // 

        // ------ Operadores Logicos ------
        // && Operador logico E
        // || Operador logico OU
    }
}
