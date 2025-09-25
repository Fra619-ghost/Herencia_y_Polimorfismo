package run;
import Models.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option = 0;
        while (option != 4) {
            System.out.println("Seleccione el tipo de vehículo que desea crear:");
            System.out.println("1. Carro");
            System.out.println("2. Camión");
            System.out.println("3. Moto");
            System.out.println("4. Salir");1
            option = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea

            switch (option) {

                case 1:
                    System.out.print("Ingrese la marca del carro: ");
                    String marcaCarro = sc.nextLine();
                    System.out.print("Ingrese el modelo del carro: ");
                    String modeloCarro = sc.nextLine();
                    Carro carro = new Carro(marcaCarro, modeloCarro);
                    carro.mover();
                    carro.recargar();
                    break;
                case 2:
                    System.out.print("Ingrese la marca del camión: ");
                    String marcaCamion = sc.nextLine();
                    System.out.print("Ingrese el modelo del camión: ");
                    String modeloCamion = sc.nextLine();
                    Camion camion = new Camion(marcaCamion, modeloCamion);
                    camion.mover();
                    camion.recargar();
                    break;
                case 3:
                    System.out.print("Ingrese la marca de la moto: ");
                    String marcaMoto = sc.nextLine();
                    System.out.print("Ingrese el modelo de la moto: ");
                    String modeloMoto = sc.nextLine();
                    Moto moto = new Moto(marcaMoto, modeloMoto);
                    moto.mover();
                    break;
                case 4:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;

            }

        }

    }



}