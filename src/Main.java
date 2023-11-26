import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Parqueadero parqueadero1 = new Parqueadero();
        int opc= 0;
        do {
            System.out.println("1. Ingresar Carro ");
            System.out.println("2. Dar salida a un carro ");
            System.out.println("3. Ingresos del parqueadero ");
            System.out.println("4. Consulta parqueaderos disponible ");
            System.out.println("5. Avanzar el reloj del parqueadero ");
            System.out.println("6. Cambiar la tarifa del parqueadero");
            System.out.println("7. Mtodo 1");
            System.out.println("8. Metodo 2");
            System.out.println("9. Salir ");
            System.out.print("\nIngrese una opción: ");
            opc= Integer.parseInt(scanner.next());
            switch(opc){
                case 1:
                    System.out.print("Ingrese la placa: ");
                    String placa= scanner.next();
                    int resultado= parqueadero1.entrarCarro(placa);
                    if (resultado == Parqueadero.NO_HAY_PUESTO){
                        System.out.println("No hay espacio");
                    }else if(resultado == Parqueadero.CARRO_YA_EXISTE){
                        System.out.println("Carros con placa repetida");
                    }else{
                        System.out.println("Carro en parqueadero: "+resultado);
                    }
                    break;
                case 2:
                    System.out.print("Ingrese la placa: ");
                    String pPlaca= scanner.next();
                    int resultadoS = parqueadero1.sacarCarro(pPlaca);
                    if (resultadoS == Parqueadero.CARRO_NO_EXISTE){
                        System.out.println("El carro no esta parqueado");
                    }else{
                        System.out.println("Carro fuera");
                        System.out.println("Total a pagar es: "+resultadoS);
                    }
                    break;
                case 3:
                    System.out.println("Ingresos del parqueadero es: "+parqueadero1.darMontoCaja());
                    break;
                case 4:
                    System.out.println("Parqueadero disponibles: "+parqueadero1.calcularPuestosLibres());
                    break;
                case 5:
                    parqueadero1.avanzarHora();
                    System.out.println("Avanzando una hora: : "+parqueadero1.darHoraActual());
                    break;
                case 6:
                    System.out.print("Nueva tarifa: ");
                    int pTarifa= scanner.nextInt();
                    parqueadero1.cambiarTarifa(pTarifa);
                    System.out.println("Tarifa nueva: "+parqueadero1.darTarifa()+" por hora o fraccion");
                    break;
                case 7:
                    System.out.println(parqueadero1.metodo1());
                    break;
                case 8:
                    System.out.println(parqueadero1.metodo2());
                    break;
                case 9:
                    System.out.println("Gracias por su visita");
                    break;
            }
        }while(opc!=9);
    }
}