// Forum Agenda 05 - Estruturas de Repetição, parte 1
// O DESAFIO desta semana é criar uma pequena tabuada. (do 1 até 5)
// Para isso, precisaremos utilizar o conceito de um laço for "dentro" de outro laço for.
// A ideia é a seguinte - acompanhe comigo !
// - No primeiro laço, sugestão chamar a variável de controle do for de "x". Neste primeiro laço, a sugestão é o x começar no valor 1 e ir até que o x for menor ou igual a 5;
// - Logo após criar o primeiro laço, a primeira linha de dentro deste laço, a sugestão é criar um novo laço for (o SEGUNDO LAÇO FOR) que utilize a variável "y" como sugestão.
// Dentro deste segundo laço, a ideia é que y comece no valor 1 e faça até que o valor de y seja menor ou igual a 10.
// A primeira linha deste segundo laço, a ideia é imprimir na tela que x vezes y = resultado.

public class tabuadaAutomatica {
    public static void main(String[] args) {
    
       for ( int x = 1; x <= 5; x++ ){
           for(int y = 1; y <= 10; y++ ){
               System.out.println( x + "x" + y + " = " + (x*y));
           }
           System.out.println();
       }
    }
}
