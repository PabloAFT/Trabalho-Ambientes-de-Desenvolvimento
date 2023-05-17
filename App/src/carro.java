public class Carro {
    int velocidade;
    public void ligarMotor() {
        System.out.print("Motor está sendo ligado");   
    }
    public void desligarMotor() {
        System.out.print("Motor está sendo desligado");
        
    }
    public void freiar() {
        velocidade = 0;
        System.out.println("O carro foi parado.");
    }
}
