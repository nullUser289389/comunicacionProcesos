    import java.io.PrintWriter;
    import java.util.Random;
    import java.util.Scanner;

    public class Hijo {
        public static void main() {

            Scanner input = new Scanner(System.in);

            int num = 7;

            while(input.nextInt() != num){
                System.out.println("Incorrecto");
                flujoDatosPadre.nextLine();
            }
            System.out.println("Correcto");
        }
    }
