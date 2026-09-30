import java.io.*;
import java.util.Scanner;

public class Padre {
    public static void main() throws IOException {

        Scanner scanner = new Scanner(System.in);

        ProcessBuilder pb = new ProcessBuilder("java" , "Hijo");
        Process hijo = pb.start();

        PrintWriter escritor = new PrintWriter(hijo.getOutputStream(), true);
        BufferedReader lector = new BufferedReader(new InputStreamReader(hijo.getInputStream()));

        String msjHijo;

        while (!msjHijo.equals("Correcto"))

        System.out.print("[*]Introduzca un numero ==> ");
        int valorIntroducido = scanner.nextInt();

        escritor.write(valorIntroducido);


    }
}
