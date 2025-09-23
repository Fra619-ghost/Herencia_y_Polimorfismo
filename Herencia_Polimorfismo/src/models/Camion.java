package models;
//hereda de Vehiculo y adapta la interfaz combustible
public class Camion extends Vehiculo implements Combustible {

    public Camion(String marca, String modelo) {
        super(marca, modelo);
    }

    //sobreescribe mover
    @Override
    public void mover() {
        System.out.println("El camión " + marca + " " + modelo + " avanza por la carretera.");
    }

    @Override
    public void recargar() {
        System.out.println("Recargando gasolina del camión " + marca + " " + modelo + ".");
    }
}
