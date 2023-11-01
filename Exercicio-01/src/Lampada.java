public class Lampada {
    public String cor;
    double preco;
    static int garantia;
    double voltagem;
    String marca;
    String tipo;
    boolean ligada;
    boolean desligada;

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