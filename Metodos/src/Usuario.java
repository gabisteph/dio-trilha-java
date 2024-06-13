public class Usuario {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();
        System.out.println("===================Status atual da TV==================");
        System.out.println("TV Ligada? "+smartTV.isLigada());
        System.out.println("Canal Atual: "+smartTV.getCanal());
        System.out.println("Volume da TV: "+smartTV.getVolume());
        System.out.println("====================Métodos implementados==============");
        smartTV.ligar();
        System.out.println("TV Ligada? "+smartTV.isLigada());
        smartTV.trocarCanal(4);
        System.out.println("novo canal: "+smartTV.getCanal());
        smartTV.aumentarVolume();
        System.out.println("Aumentou em 1 Volume da TV: "+smartTV.getVolume());
        smartTV.diminuirVolume();
        System.out.println("Diminuiu em 1 Volume da TV: "+smartTV.getVolume());


    }
}
