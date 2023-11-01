public class ContaBancaria {
    String nomeDoCliente;
    int numConta;
    double saldo = 0;

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    void sacar(double valor){
         if ((saldo-valor) >= 0) {
             saldo -= valor;
             return true ;
         }
    }
}
