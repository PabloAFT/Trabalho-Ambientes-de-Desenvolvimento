public class Carro {

    public Carro(int velocidade){
        // velocidade deve ser dada em metros por segundo

        this.velocidade = velocidade;

    }
    private int velocidade;
    private  boolean motor;
    public void ligarMotor() {
        System.out.println("Motor está sendo ligado"); 
        this.motor=true;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade=velocidade;
    }

    
    public void desligarMotor() {
        System.out.println("Motor está sendo desligado");
        this.motor=false;
    }
    public void frear() {
        velocidade = 0;
        System.out.println("O carro foi parado.");
    }
}
