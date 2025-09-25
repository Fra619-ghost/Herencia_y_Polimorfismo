package Models;
//clase heredada de vehiculo, no necesita combustible
public class Moto extends Vehiculo {
    public Moto (String marca, String modelo) { super(marca, modelo);}

    //aqui se sobreescribe mover
    @Override
    public void mover() {
        System.out.println("La moto " + marca + " " + modelo + "avanza por la carretera ");
    }

}
