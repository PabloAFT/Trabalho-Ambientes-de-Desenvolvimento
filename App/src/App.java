public class App {
    public static void main(String[] args) throws Exception {
        Pista pista = new Pista(1200, 3);
        Carro carro = new Carro(40);
        Motorista motorista = new Motorista("José",10, carro);
        
        pista.chuva();
        pista.simularCorrida(carro,motorista);
    }
}
