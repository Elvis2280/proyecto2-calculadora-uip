
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
                String[] a = { "SUMAR", "RESTAR", "MULTIPLICAR", "DIVIDIR" };
                double num1, num2;
                int opcion;

                Scanner scan = new Scanner(System.in);

                System.out.println("\n                  CALCULADORA\n ");

                System.out.println("0. Suma");
                System.out.println("1. Resta");
                System.out.println("2. Multiplicacion");
                System.out.println("3. Division \n");

                System.out.println("Ingrese el número de la operación");
                opcion = scan.nextInt();

                System.out.println("DIGITE EL PRIMER NUMERO A " + a[opcion] + ":");
                num1 = scan.nextDouble();
                System.out.println("DIGITE EL SEGUNDO NUMERO A " + a[opcion] + ":");
                num2 = scan.nextDouble();

                Calculo calculadora = new Calculo(num1, num2);
                switch (opcion) {

                        case 0:

                                System.out.println("\nLA SUMA ES: " + calculadora.sumar());

                                break;

                        case 1:

                                System.out.println("\nLA RESTA ES: " + calculadora.restar());

                                break;

                        case 2:

                                System.out.println("\nLA MULTIPLICACION ES: " + calculadora.multiplicar());

                                break;

                        case 3:

                                System.out.println("\nLA DIVISION ES: " + calculadora.dividir());

                        default:
                                System.out.println("Ingrese un valor válido");
                                break;
                }

        }
}
