public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta coP = new ContaPoupanca();

        cc.imprimirExtrato();
        coP.imprimirExtrato();
    }

}
