public class Carro {
    public Carro(){
        this.ligarMotor();
        this.frear();

    }
    private int velocidade;
    public void ligarMotor() {
        System.out.print("Motor está sendo ligado");   
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade=velocidade;
    }
    
    public void desligarMotor() {
        System.out.print("Motor está sendo desligado");
        
    }
    public void frear() {
        velocidade = 0;
        System.out.println("O carro foi parado.");
    }
}
