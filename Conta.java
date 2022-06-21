public class Conta {

    private String nome;
    private float saldo;
    private float conta;

    public Conta(String nome, float saldo, float c){
        this.nome = nome;
        this.saldo = saldo;
        this.conta = c;
    }

    public void depositar(float d){
        this.saldo = this.saldo + d;
    }

    public void sacar(float s){
        this.saldo = this.saldo - s;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getConta() {
        return (int) conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    


    
}
