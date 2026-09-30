    import java.io.PrintWriter;
    import java.util.Random;
    import java.util.Scanner;

    public class Hijo {
        public static void main() {

            Scanner scFlujoPadre = new Scanner(System.in);
            Random random = new Random();


            int numeroAleatorio = random.nextInt(1, 11);
            int numeroPadre;

            while((numeroPadre = scFlujoPadre.nextInt()) != numeroAleatorio){
                System.out.println("Incorrecto");
                scFlujoPadre.nextLine();
            }
            System.out.println("Correcto");
        }
    }
