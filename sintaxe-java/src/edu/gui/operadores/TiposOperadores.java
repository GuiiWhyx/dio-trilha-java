public class TiposOperadores {
    public static void main(String [] args) throws Exception {
        
        //Atribuição -> "=" representado pelo símbolo de igualdade.
        //Aritméticos -> + (adição), - (subtração), * (multiplicação), / (divisão).
        //O operador de adição quando utilizado em duas palavras é realizada a concatenação.
        String concatenacao = "";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        //Operadores Unários
        int numero = 5;

        numero = -numero;
        System.out.println(numero);
        numero = numero * -1;
        System.out.println(numero);

        numero++;
        System.out.println(numero);

        //X repetições
        numero = 5;
        System.out.println(numero --);
        System.out.println(numero);

        boolean variavel = true;

        variavel = !variavel;

        System.out.println(variavel);

        int a,b;
        a = 4;
        b = 4;
        String resultado = a == b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2){
            System.out.println("A nossa condição é verdadeira");
        }
        else {
            System.out.println("A nossa condição é falsa");
        }
        System.out.println("Número1 é igual a Número2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("Número1 é diferente de Número2? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("Número1 é maior que Número2? " + simNao);

        // Comparar textos e objetos
        String nome1 = "Greyson";
        String nome2 = "Creitu";

        System.out.println(nome1.equals(nome2));
        // Operadores Lógicos
        // && Operador lógico "E"
        // || Operador lógico "OU"
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && (7>2)) {
            System.out.println("As duas são verdadeiras.");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das duas condições é verdadeira");
        } 
        
        condicao2 = true;

        if (condicao2 && condicao1) {
            System.out.println("Ambas as condições são verdadeiras");
        } else {
            System.out.println("Tá tudo errado nessa bomba");
        }

    }
}
