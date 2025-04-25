public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setName("Cliente1");

        Conta cc = new ContaCorrente(cliente);
        cc.depositar(100);

        Conta pp = new ContaPoupanca(cliente);
        cc.transferir(100, pp);

        cc.imprimirExtrato();
        pp.imprimirExtrato();
    }
}