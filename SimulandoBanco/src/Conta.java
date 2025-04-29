public abstract class Conta implements iConta {

    protected int agencia;
    protected int numero;
    protected double saldo;
    private static int Agencia_Padrao = 1;
    private static int Sequencial = 1;

    public Conta() {
        this.agencia = Conta.Agencia_Padrao;
        this.numero = Sequencial++;
    }

    public void sacar(double valor) {
        saldo -= valor;

    }

    public void depositar(double valor) {
        saldo += valor;

    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);


    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format(   "Agência: %d", this.agencia));
        System.out.println(String.format(   "Numero: %d", this.numero));
        System.out.println(String.format(   "Saldo: %2f", this.saldo));
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }



}
