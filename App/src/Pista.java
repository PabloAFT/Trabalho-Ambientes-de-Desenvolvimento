public class Pista {
    private int distancia;
    private boolean pistaMolhada;
    private int voltas;
    public Pista(int distancia,int voltas){
        this.distancia = distancia;
        this.voltas = voltas;

    }
    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    public int getDistancia() {
        return distancia;
    }
    public void setVoltas(int voltas) {
        this.voltas = voltas;
    }
    public int getVoltas() {
        return voltas;
    }
    public void chuva() {
        System.out.println("Chuva molha a pista, tornando-a escorregadia.");
        this.pistaMolhada = true;
    }
    public void simularCorrida(Carro carro, Motorista motorista) {
        double tempoTotal = 0;
        for (int i = 0; i < voltas; i++) {
            tempoTotal = tempoTotal + percorrerVolta(carro, motorista);
        }

        System.out.println("O carro percorreu a pista em "+ tempoTotal + "segundos");

    
    }
    public double percorrerVolta(Carro carro, Motorista motorista){
        double tempo = this.distancia / carro.getVelocidade() * (motorista.habilidade / 10) ;
        if (pistaMolhada) {
            tempo = tempo + tempo*0.3;
        }        
        System.out.println("O carro percorreu a volta em "+ tempo);
        return tempo;

    }


}
