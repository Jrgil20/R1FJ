package inicial.com;

//se importa la clase Logger para evitar el uso de System.out.println por la regla de sonar Java:S106
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.Scanner;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    
    public static void main(String[] args) {
        //uso de  try-with-resources para evitar el uso de finally por la regla de sonar Java:S2095
        try (Scanner scanner = new Scanner(System.in)) {
            // ejemplo de uso de logger.info() en lugar de System.out.println
            logger.info("Solo un ejemplo en java");

            //prueba de concatenacion de tipos de datos
            byte zero = 0;
            short a = 3;
            int b = 1;
            char d = ' ';
            float e = 2.0f;
            boolean f = true;
            //se concatena los valores de las variables en un String
            String output = "H" + a + b + b + zero + d + "w" + zero + "r" + b + "d" + d + e + d + f;
            logger.info(output);

            //prueba de uso de array 
            int[] miArray = new int[5]; // Crea un array de enteros con 5 elementos

            // Asigna valores a los elementos del array
            miArray[0] = 10;
            miArray[1] = 20;
            miArray[2] = 30;
            miArray[3] = 40;
            miArray[4] = 50;

            //Asigna valores a los elementos del array con un bucleo
            for (int i = 0; i < miArray.length; i++) {
                if (logger.isLoggable(Level.INFO)) {
                    //se pregunta si se desea introducir un nuevo valor para el elemento
                    logger.info(String.format("¿Deseas introducir un nuevo valor para el elemento %d? (s/n)", (i+1)));
                }
                String respuesta = scanner.next();
                //se valida que la respuesta sea "s" o "n"
                if (respuesta.equalsIgnoreCase("s")) {
                    //se pide el valor para el elemento
                    if (logger.isLoggable(Level.INFO)) {
                        logger.info(String.format("Introduce el valor para el elemento %d:", (i+1)));
                    }
                    //se asigna el valor al elemento
                    miArray[i] = scanner.nextInt();
                    //se limpia el buffer del scanner
                    scanner.nextLine();
                }
            }

            // Imprime los elementos del array considerendo la regla de sonar s2629 
            for (int i = 0; i < miArray.length; i++) {
                if (logger.isLoggable(Level.INFO)) {
                    logger.info(String.valueOf(miArray[i]));
                }
            }
        } 

    }
}