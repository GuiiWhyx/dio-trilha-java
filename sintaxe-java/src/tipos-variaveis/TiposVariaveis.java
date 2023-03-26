public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //Tipos primitivos
        
        String meuNome = "Guilherme";
        boolean simNao = false;
        double salarioMinimo = 2500;
        char sexo = 'M';
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        //Variável comum
        int numero = 1;
        System.out.println(numero);

        //Constante, não pode ser alterado
        final int NUMERO1 = 2;
        System.out.println(NUMERO1);

        float pi_ = 3.14F;
        long estrelas = 128907311244576232L;
    }
}
