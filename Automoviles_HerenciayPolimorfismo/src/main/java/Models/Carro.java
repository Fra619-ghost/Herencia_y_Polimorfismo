package Models;

public class Carro extends Vehiculo implements Combustible {

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    //sobreescribe mover
    @Override
    public void mover() {
        System.out.println("El carro " + marca + " " + modelo + " avanza por la carretera.");
    }

    @Override
    public void recargar() {
        System.out.println("Recargando gasolina del carro " + marca + " " + modelo + ".");
    }
}