public class Metodos {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
    public double somar(int num1, int num2) {
        int soma = num1+num2;
        return soma;        
    }
    public void imprimir(String texto){
        System.out.println(texto);
    }
    // throws exception: indica o método a ser utilizado
    // poderá gerar uma exceção
    public double dividir(int dividendo, int divisor) throws Exception{
        double resultado = dividendo/divisor;
        return resultado;
    }
    /* Esse método só pode ser usado dentro da classe */
    private void metodoPrivado(){

    }
    public void gravarCliente(String nome, String cpf, String endereço, String telefone){
        /*nesse caso um método com muitos parâmetros é mais 
        válido criar um objeto cliente e passar como parâmetro*/
    }
}
