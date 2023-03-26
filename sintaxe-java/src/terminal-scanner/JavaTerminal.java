public class JavaTerminal {
    public static void main(String[] args) {
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("Minha altura é " + altura + "cm");

        //Scanner: no exemplo acima vimos que podemos receber dados digitados do usuário, porém
        //tudo precisa estar em uma única linha e ordem corretas. Essa abordagem pode deixar margens de erro
        //Para isso, utilizamos o Scanner deixando a entrada de dados mais segura via terminal.
        //Verificar o arquivo JavaTerminalScanner.java
    }
}