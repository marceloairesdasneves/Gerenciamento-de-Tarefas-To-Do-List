public class Correntista {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(123);
        conta.setSaldo(1000.0);
        conta.titular = "Joao";

        System.out.println("O numero da conta " + conta.getNumeroConta());
        System.out.println("O saldo da conta " + conta.getSaldo());
        System.out.println("O titular da conta " + conta.titular);

        conta.setSaldo(1444.0);
        System.out.println("O novo saldo e " + conta.getSaldo());
    }
}
