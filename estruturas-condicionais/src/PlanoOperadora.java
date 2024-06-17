public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M"; //T, M, B
        switch (plano) {
            case "T":{
                System.out.println("5Gb Youtube");
                break;
            }case "M":{
                System.out.println("Whats e Instagram grátis");
            }case "B":{
                System.out.println("100 minutos de ligação");
            }        
            default:
                break;
        }
    }
    
}
