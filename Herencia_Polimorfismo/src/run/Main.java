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
            System.out.print("Tipo (carro/moto/camion): ");
            String tipo = sc.nextLine().trim().toLowerCase();

            System.out.print("Marca: ");
            String marca = sc.nextLine().trim();

            System.out.print("Modelo: ");
            String modelo = sc.nextLine().trim();

            switch (tipo) {
                case "carro":
                    vehiculos[i] = new Carro(marca, modelo);
                    break;
                case "moto":
                    vehiculos[i] = new Moto(marca, modelo);
                    break;
                case "camion":
                    vehiculos[i] = new Camion(marca, modelo);
                    break;
                default:
                    System.out.println("Tipo no reconocido.");
                    break;
            }
        }

        System.out.println("\n--- Vehículos ---");
        for (Vehiculo v : vehiculos) {
            v.mover();
            if (v instanceof Combustible) {
                ((Combustible) v).recargar();
            }
            System.out.println();
        }

        sc.close();
    }
}
