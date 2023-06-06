public class Motorista {

    String nome;
    double habilidade;
    public Motorista(String nome, double habilidade,Carro carro){
        this.habilidade = habilidade;
        this.nome = nome;
        this.entrarNoVeiculo(carro);
    }
    public void setHabilidade(int habilidade) {
        this.habilidade = habilidade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getHabilidade() {
        return habilidade;
    }
    public String getNome() {
        return nome;
    }
    public void entrarNoVeiculo(Carro carro) {
        System.out.println(this.nome + " entrou no veículo");
        carro.ligarMotor();
    }
}
