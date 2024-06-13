public class Conta {
    /*variavel da classe conta */
    private double saldo = 10.0;

    /*Métodos */
    public void sacar(double valor){
        /*Variavel local do método */
        double novoSaldo = saldo - valor;
    }
    public void imprimirSaldo(){
        //disponível em toda classe
        System.out.println(saldo);
        // domente o método sacar conhece esta variável
        //System.out.println(novoSaldo);
    }
    public double calcularDividaExponencial(){
        //variável local de método
        double valorParcela = 50.0;
        double valorMontante = 0.0;
        for (int x=1;x<=5; x++){ //varia do x do escopo for
            double valorCalculado = valorParcela; //variavel local do escopo for
            valorMontante = valorMontante+valorCalculado;
        }
        //aqui x e valorCalculado não estarão disponíveis
        return valorMontante;
    }
}
