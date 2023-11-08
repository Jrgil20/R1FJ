package inicial.com;

//se importa la clase Logger para evitar el uso de System.out.println por la regla de sonar Java:S106
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        // ejemplo de uso de logger.info() en lugar de System.out.println
        logger.info("Solo un ejemplo en java");
        //prueba de concatenacion de tipos de datos
        byte zero = 0;
        short a = 3;
        int b = 1;
        char d = ' ';
        float e = 2.0f;
        boolean f = true;
        String output = "H" + a + b + b + zero + d + "w" + zero + "r" + b + "d" + d + e + d + f;
        logger.info(output);
    }
}