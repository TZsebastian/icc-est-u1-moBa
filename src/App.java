import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        MetodoOrdenamiento mO = new MetodoOrdenamiento();
        //int[] arr = {5, 8,9,3,0};
        int[] arr = {1,2,3,4,5};

        mO.sortBubbleAva(arr);
        mO.printArreglo(arr);
        System.out.println("");

        Scanner scanner = new Scanner (System.in);

        int tamanio = leerEnteroValido(scanner, "Ingrese el tamaño del arreglo: ", false);
        int[] arreglo2 = new int[tamanio];

        for (int i = 0; i < tamanio; i++){
            arreglo2[i] = leerEnteroValido(scanner, "Elemento" + (i+1), true);
        }
        for (int i : arreglo2){
            System.out.println(i);

        }
        
        mO.sortBubbleAva(arreglo2);
        mO.printArreglo(arreglo2);

        scanner.close();

    }
    public static int leerEnteroValido(Scanner scanner, String mensaje, boolean permitirNegativos){
        int numero = 0;

        do{
            System.out.println(mensaje);
            while(!scanner.hasNextInt()){
                System.out.println("Te pedí un entero valido");
                System.out.println(mensaje);
                scanner.next();
            }
            numero = scanner.nextInt();
            if(!permitirNegativos && numero < 0){
                System.out.println("No se permiten numeros negativos");

            }
        }while(!permitirNegativos && numero < 0);
        return numero;
    }
}
