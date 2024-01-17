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
                
                    // Utilizar la opción 2 directamente para determinar la banda
                    int opcionBanda = 2;  // Por defecto, asumimos FM
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

                    System.out.println(estacionRecuperada);
                        break;
                case 6:
                    System.out.println("Seleccione una opción:");
                    System.out.println("1. Subir volumen");
                    System.out.println("2. Bajar volumen");
                    int opcionVolumen = sc.nextInt();
                
                    System.out.println("Ingrese la cantidad de volumen a ajustar de 0 a 100:");
                    int cantidadVolumen = sc.nextInt();
                
                    int nuevoVolumen;
                    
                    if (opcionVolumen == 1) {
                        nuevoVolumen = miRadio.getVolumen() + cantidadVolumen;
                        System.out.println("Volumen subido a "+ nuevoVolumen);
                    } else if (opcionVolumen == 2) {
                        nuevoVolumen = miRadio.getVolumen() - cantidadVolumen;
                        System.out.println("Volumen bajado a "+ nuevoVolumen);
                    } else {
                        System.out.println("Opción no válida.");
                        break;
                    }
                
                    // Asegurarse de que el volumen esté en el rango de 0 a 100
                    if (nuevoVolumen >= 0 && nuevoVolumen <= 100) {
                        miRadio.setVolumen(nuevoVolumen);
                    } else {
                        System.out.println("Volumen fuera de rango (0-100).");
                    }
                    break;
                case 7:
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
        System.out.println("\n-------------------------");
        System.out.println("1. Encender radio");
        System.out.println("2. Cambiar de AM a FM a AM");
        System.out.println("3. Avanzar en el dial"); //Al  llegar al final del dial, regresa al inicio
        System.out.println("4. Guardar estacion actual"); //Total de 12 estaciones
        System.out.println("5. Seleccionar estacion guardada");
        System.out.println("6. Subir y bajar volumen");
        System.out.println("7. Apagar radio");
        System.out.println("-------------------------");
        System.out.println("\nSeleccione una opcion:");
    }
}
