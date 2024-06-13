public class SmartTV {
    private boolean ligada = false;
    private int canal = 1;
    private int volume = 25;
    
    

    public boolean isLigada() {
        return ligada;
    }
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void ligar(){
        if (ligada == false){
            ligada = true;
        }
    }
    public void desligar(){
        if(ligada == true){
            ligada = false;
        }
    }
    public void trocarCanal(int canalDesejado){
        canal = canalDesejado;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void aumentarVolume(){
        volume++;
    }

    

    

}
