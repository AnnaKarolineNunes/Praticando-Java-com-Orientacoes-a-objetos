public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.preco = 20.50;
        Lampada.garantia = 1;
        lampada.voltagem = 9;
        lampada.marca = "philips";
        lampada.cor = "Amarela";
        lampada.tipo = "led";


        System.out.println("Preço: R$" + lampada.preco +" reais " );
        System.out.println("Garantia: "+ lampada.garantia +  " meses");
        System.out.println("Voltagem: " + lampada.voltagem + " Volts");
        System.out.println("Marca: " + lampada.marca);
        System.out.println("Cor: " + lampada.cor);
        System.out.println("Tipo: " + lampada.tipo);

        lampada.Desligar();
        System.out.println("Estado da lâmpada:");
        lampada.mostrarEstado();
        System.out.println("Mudando estado da lampada...");
        lampada.mudarEstado();
        lampada.mostrarEstado();



    }
}