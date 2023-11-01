public class Lampada {
    private String cor;
    private double preco;
    private int garantia;
    private double voltagem;
    private String marca;
    private String tipo;
    private boolean ligada;
    private boolean desligada;

    public Lampada(String cor, double preco, double voltagem, String marca, String tipo, int garantia) {
        this.cor = cor;
        this.preco = preco;
        this.voltagem = voltagem;
        this.marca = marca;
        this.tipo = tipo;
        this.garantia = garantia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public double getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    void Ligar(){
        ligada = true;
    }
    void Desligar(){
        desligada = false;
    }

    public void mostrarEstado(){
        if (ligada){
            System.out.println("A lâmpada está ligada.");
        }else {
            System.out.println("A lâmpada está desligada");
        }
    }

    void mudarEstado(){
        if (ligada){
            Desligar();
        }else {
            Ligar();
        }
    }
}