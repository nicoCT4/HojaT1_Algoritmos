import java.util.Scanner;

public class MainRadio {
    
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        boolean go = true;
        Radio miRadio = new Radio("Sony");

        while(go){
            PrintMenu();
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                case 2:
                    miRadio.cambiarFrecuencia();
                    System.out.println("Frecuencia cambiada");
                    break;
                case 3:
                    miRadio.avanzarDial();
                    System.out.println("Dial avanzado");
                    break;
                case 4:
                    // Obtener la estación actual antes de guardar
                    float estacionActual = miRadio.obtenerEstacionActual();
                
                    System.out.print("Ingrese el número de botón (1-12): ");
                    int boton = sc.nextInt();
                
                    // Solicitar al usuario la elección de la banda
                    System.out.println("Seleccione la banda:");
                    System.out.println("1. AM");
                    System.out.println("2. FM");
                    int opcionBanda = sc.nextInt();
                
                    // Validar la opción de banda
                    if (opcionBanda == 1) {
                        // Banda AM
                        miRadio.guardarEstacion(estacionActual, new int[]{Radio_30.AM}, boton - 1);
                    } else if (opcionBanda == 2) {
                        // Banda FM
                        miRadio.guardarEstacion(estacionActual, new int[]{Radio_30.FM}, boton - 1);
                    } else {
                        System.out.println("Opción de banda no válida.");
                    }
                    break;
                case 5:
                    
                    System.out.print("Ingrese el numero de boton (1-12): ");
                        boton = sc.nextInt();
                        float
                    estacionRecuperada = miRadio.recuperarEstacion(boton - 1);

                    System.out.println("Estacion recuperada del boton " + boton + ": " + estacionRecuperada);
                        break;
                case 6:
                    miRadio.setEncendido(false);
                    System.out.println("Radio apagado");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    public static void PrintMenu(){
        System.out.println("-------------------------");
        System.out.println("1. Encender radio");
        System.out.println("2. Cambiar de AM a FM a AM");
        System.out.println("3. Avanzar en el dial"); //Al  llegar al final del dial, regresa al inicio
        System.out.println("4. Guardar estacion actual"); //Total de 12 estaciones
        System.out.println("5. Seleccionar estacion guardada");
        System.out.println("6. Apagar radio");
        System.out.println("-------------------------");
        System.out.println("Seleccione una opcion:");
    }
}
