public class Pista {
    private int distancia;
    private boolean pistaMolhada;
    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    public int getDistancia() {
        return distancia;
    }
    public void chuva() {
        System.out.println("Chuva molha a pista, tornando-a escorregadia.");
        this.pistaMolhada = true;
    }
    public void simularCorrida(Carro carro) {

        System.out.println("O carro percorreu a pista em "+ (carro.getVelocidade() / this.distancia ));    
    }


}
