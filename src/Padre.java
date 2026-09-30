import java.io.*;
import java.util.Scanner;

public class Padre {
    public static void main() throws IOException {

        Scanner scannerInputPadre = new Scanner(System.in);

        ProcessBuilder pb = new ProcessBuilder("java" , "Hijo");

        Process hijo = pb.start();

        PrintWriter escritor = new PrintWriter(hijo.getOutputStream());
        BufferedReader lector = new BufferedReader(new InputStreamReader(hijo.getInputStream()));

        String mensajeHijo;
        String valorAEnviar;

        while((mensajeHijo = lector.readLine()) != "Correcto") {
            System.out.println("Vuelva introducir otro valor");
            valorAEnviar = scannerInputPadre.next();
            escritor.println(valorAEnviar);
        }
    }
}
