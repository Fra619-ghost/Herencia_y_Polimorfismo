<<<<<<< HEAD:Herencia_Polimorfismo/src/models/Vehiculo.java
package models;

//clase abstracta que represneta un vehiculo en general
public abstract class Vehiculo {
    String marca;
    String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }


    //método abstracto que cada subclase debe definir
    public abstract void mover();
}
=======
package Models;

//clase abstracta que represneta un vehiculo en general
public abstract class Vehiculo {
    String marca;
    String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }


    //método abstracto que cada subclase debe definir
    public abstract void mover();
}
>>>>>>> Franco:Herencia_y_Polimorfismo-Franco/Herencia_y_Polimorfismo-Franco_Camion/Automoviles_HerenciayPolimorfismo/src/main/java/Models/Vehiculo.java
