import java.util.Calendar;

public class ContaPoupança extends ContaBancaria {
    private int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString(){
        String s = "ContaPoupança";
        s += "diaRendimento;" + diaRendimento;
        s += "; " + super.toString();
        s += "\n" ;
        return s;
    }
    public boolean calcularNovoSaldo(double tacaRendimento){

        Calendar hoje = Calendar.getInstance();

        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
            this.setSaldo(this.getSaldo()+ (this.getSaldo() * tacaRendimento));
                return true;
        }
        return false;
    }
}
