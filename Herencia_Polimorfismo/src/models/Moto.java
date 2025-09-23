package models;
// Hereda de Vehiculo, no necesita combustible
public class Moto extends Vehiculo{
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    //sobreescribe mover
    @Override
    public void mover() {
        System.out.println("La moto " + marca + " " + modelo + " avanza por la carretera.");
    }

}
