import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

       String asientos[][]=new String[10][10];

       int menu=0;
       int filas=0, columnas=0;
       Boolean control=true;

        for (int f = 0; f <= 9; f++) {
            for (int c =0; c<=9 ; c++){
                asientos[f][c]= "L";

            }
        }
        System.out.println("Bienvenido a nuestro teatro");
        while (menu!=3) {
            control=true;

            System.out.println("Por favor seleccione una opcion apra continuar");
            System.out.println("reservar : 1");
            System.out.println("visualizar asientos: 2");
            System.out.println("salir: 3");
            System.out.print("opcion = ");
            menu = teclado.nextInt();

            switch (menu) {
                case 1:

                    while (control) {

                        System.out.println("Por favor ingrese la fila entre 0 y 9");
                        filas = teclado.nextInt();
                        System.out.println("por favor ingrese su columna entre 1 y 9");
                        columnas = teclado.nextInt();

                        if (filas > 9 || filas < 0) {
                            System.out.println("Por favor ingrese un numero de filas valido");
                        } else if (columnas> 9 || columnas <0) {
                            System.out.println("por favor ingres un numero de columnas valido");

                        } else if (asientos[filas][columnas].equalsIgnoreCase("X")) {
                            System.out.println("su asiento ya ha sido reservado por favior ingrese otro valor");

                        } else {
                            asientos[filas][columnas] = "X";

                            System.out.println("su asiento se ha reservado con exito");
                            control = false;

                        }

                    }
                    break;

                case 2:
                    mostrarAsientos(asientos);
                    break;

                case 3:
                    System.out.println("has salido del sistema");
                    break;
                default:
                    System.out.println("por favor seleccione un numero valido");

            }
        }
    }
     static void mostrarAsientos(String asientos[][]){
        for (int f = 0; f <= 9; f++) {
            System.out.println("");
            System.out.print(f);

            for (int c =0; c<=9 ; c++) {

                System.out.print("["+ asientos[f][c]+ "]");


            }


        }
         System.out.println("");

    }
}