public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada("Amarela", 20.50,9,"LG","Inteligente",2);

        System.out.println("Preço: R$" + lampada.getPreco() +" reais " );
        System.out.println("Garantia: "+ lampada.getGarantia() +  " meses");
        System.out.println("Voltagem: " + lampada.getVoltagem() + " Volts");
        System.out.println("Marca: " + lampada.getMarca());
        System.out.println("Cor: " + lampada.getCor());
        System.out.println("Tipo: " + lampada.getTipo());

        lampada.Desligar();
        System.out.println("Estado da lâmpada:");
        lampada.mostrarEstado();
        lampada.mudarEstado();
        System.out.println("Mudando estado da lampada...");
        lampada.mostrarEstado();




    }
}