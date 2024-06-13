public class TipoVariavel {
    public static void main(String[] args) throws Exception {
        byte numero1 = 100;
        short  numero2=numero1;
        numero1 = (byte) numero2;
        System.out.println(numero1);
        String meuNome = "Gabrielle Stephanie Pires Mestrinho";
        Constantes();
    }
    public static void TiposdeDados() {
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com 0, melhor usar tipo string
        long cpf = 98765432109L; // se começar com 0, melhor usar string
        float pi = 3.14F;
        double salario = 1275.33;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        /* erro porque esse numero normal pode ser maior */
        //short numeroCurto2 = numeroNormal;
        /* alternativa abaixo */
        short numero2 = (short) numeroNormal;
    }
    public static void Constantes() {
        int numero = 1;
        numero = 2;
        System.out.println(numero);
        // 'final' definição de constante (variavel que n pode ser alterada) e 
        final double VALOR_DE_PI = 3.14;
        // EXEMPLO DE ERRO
       /* VALOR_DE_PI = 10.75 */
    }
}
