package run;
import models.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de vehículos a ingresar: ");
        int n = sc.nextInt();
        sc.nextLine(); //limpia salto de linea

        Vehiculo[] vehiculos = new Vehiculo[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nVehículo #" + (i + 1));

            // Bucle simple para validar tipo de vehículo
            String tipo;
            while (true) {
                System.out.print("Tipo (carro/moto/camion): ");
                tipo = sc.nextLine().trim().toLowerCase();
                if (tipo.equals("carro") || tipo.equals("moto") || tipo.equals("camion")) {
                    break; // tipo válido, se sale del bucle
                } else {
                    System.out.println("Tipo no reconocido. Intente de nuevo.");
                }
            }
            //pedir marca y modelo del vehiculo
            System.out.print("Marca: ");
            String marca = sc.nextLine().trim();

            System.out.print("Modelo: ");
            String modelo = sc.nextLine().trim();

            // Crear el vehículo según el tipo
            if (tipo.equals("carro")) {
                vehiculos[i] = new Carro(marca, modelo);
            } else if (tipo.equals("moto")) {
                vehiculos[i] = new Moto(marca, modelo);
            } else { // camion
                vehiculos[i] = new Camion(marca, modelo);
            }
        }
        //mostrar todos los vehiculos y el comportamiento
        System.out.println("\n--- Vehículos ---");
        for (Vehiculo v : vehiculos) {
            v.mover(); //polimorfismo
            if (v instanceof Combustible) {
                ((Combustible) v).recargar();//recarga combustible si aplica
            }
            System.out.println();
        }

        sc.close();
    }
}
