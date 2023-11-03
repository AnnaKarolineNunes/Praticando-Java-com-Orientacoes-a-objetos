public class Main {

    // criar contas ok
    //sacar um valor das contas
    // depositar
    // Mostrar um novo saldo a partir de um rendimento
    // Mostrar os dados da conta do CLiente ok

    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setNomeDoCliente("Anna");
        contaBancaria.setNumConta(2345);
        contaBancaria.setSaldo(2000);
        contaBancaria.depositar(200);

        System.out.println("Conta bancária criada:");
        System.out.println(contaBancaria.toString());


        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeDoCliente("Pedro");
        contaEspecial.setNumConta(7890);
        contaEspecial.setSaldo(1500);
        contaEspecial.setLimite(2500);

        System.out.println("Conta Especial criada:");
        System.out.println(contaEspecial.toString());

        ContaPoupança contaPoupança = new ContaPoupança();
        contaPoupança.setNomeDoCliente("Paulo");
        contaPoupança.setNumConta(1111);
        contaPoupança.setSaldo(4000);
        contaPoupança.setDiaRendimento(5);
        contaPoupança.depositar(350);

        System.out.println("Conta Poupança criada:");
        System.out.println(contaPoupança.toString());

        if (contaPoupança.calcularNovoSaldo(0.5)){
            System.out.println("Rendimento aplicado. Novo saldo de = " +  contaPoupança.getSaldo());
        }else {
            System.out.println("Hoje nao é dia de rendimento, novo saldo nao calculado");
        }
    }
}
