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
    public void chuva() {
        System.out.println("Chuva molha a pista, tornando-a escorregadia.");
        this.pistaMolhada = true;
    }
    public void simularCorrida(Carro carro) {
        for (int i = 0; i < voltas; i++) {
            percorrerVolta(carro);
        }
        System.out.println("O carro percorreu a pista em "+ (this.distancia*this.voltas / carro.getVelocidade()   ));

    
    }
    public void percorrerVolta(Carro carro){
                
        System.out.println("O carro percorreu a volta em "+ (this.distancia / carro.getVelocidade() ));
        

    }


}
