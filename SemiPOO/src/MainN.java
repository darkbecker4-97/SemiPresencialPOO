public class MainN {
    public static void main(String[] args) {
        // Criando objetos da classe Veiculo
        Veiculo carro = new Veiculo("Toyota", "Corolla", 2022);
        Veiculo moto = new Veiculo("Honda", "CBR 600", 2021);

        // Ligando e desligando os veículos
        carro.ligar();
        carro.desligar();

        moto.ligar();
        moto.desligar();
    }
}

class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false; // Por padrão, o veículo está desligado
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O veículo foi ligado.");
        } else {
            System.out.println("O veículo já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O veículo foi desligado.");
        } else {
            System.out.println("O veículo já está desligado.");
        }
    }
}