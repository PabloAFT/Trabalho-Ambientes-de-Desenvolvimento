public class Pista {
    private int distancia;

    public void simularCorrida(Carro carro) {

        System.out.println("O carro percorreu a pista em "+ (carro.getVelocidade() - this.distancia ));    
    }


}
