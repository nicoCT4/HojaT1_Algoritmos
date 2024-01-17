import java.util.Scanner;

/**
 * Clase MainRadio
 * Javier Benítez - 23405
 * Nicolás Concuá - 23197
 * Fernando Hernández - 23645
 * Fernando Rueda - 23748
 * Esta clase es el punto de entrada para interactuar con una instancia de Radio.
 * La clase contiene el método main, que ofrece un menú de opciones para controlar la radio.
 * Fecha de creación: [15/01/2024]
 * Fecha de última modificación: [15/01/2024]
 */
public class MainRadio {
    
    /**
     * El método principal que se ejecuta al iniciar el programa.
     * 
     * @param args Argumentos de la línea de comando.
     */
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        boolean go = true;
        Radio miRadio = new Radio("Sony");

        while(go){
            PrintMenu();
            opcion = sc.nextInt();
            switch(opcion){

                // Casos del switch
                case 1:
                    // Encender la radio.
                    miRadio.setEncendido(true);
                    System.out.println("Radio encendido");
                    break;
                case 2:
                    // Cambiar la frecuencia.
                    miRadio.cambiarFrecuencia();
                    System.out.println("Frecuencia cambiada");
                    break;
                case 3:
                    // Avanzar dial.
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
                    // Recuperar la estación.
                    System.out.print("Ingrese el numero de boton (1-12): ");
                        boton = sc.nextInt();
                        float
                    estacionRecuperada = miRadio.recuperarEstacion(boton - 1);

                    System.out.println("Estacion recuperada del boton " + boton + ": " + estacionRecuperada);
                        break;
                case 6:
                    //Apagar la radio.
                    miRadio.setEncendido(false);
                    System.out.println("Radio apagado");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    /**
     * Imprime el menú de opciones en la consola.
     * Este método muestra las opciones disponibles para el usuario.
     */
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
